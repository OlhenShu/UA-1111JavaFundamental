package softserve.javacourse.rachynskyi.edu04.practicaltask.task3;

import javax.management.BadAttributeValueExpException;
import java.util.Scanner;

import static softserve.javacourse.rachynskyi.edu04.practicaltask.task3.Continent.EUROPE;

public class Country {

    public static void main(String[] args) {
        Country country = new Country();

        country.getContinent();
    }

    public void getContinent() {
        Scanner scanner = new Scanner(System.in);

        ListOfCountries listOfCountries = new ListOfCountries();

        String country;

        System.out.println("Enter country name for getting continent:");
        country = scanner.nextLine();


        switch (checkListOfCounties(country, listOfCountries)) {
            case EUROPE -> System.out.println("Country " + country + " belong to " + Continent.EUROPE.getName());
            case ASIA -> System.out.println("Country " + country + " belong to " + Continent.ASIA.getName());
            case NORTH_AMERICA -> System.out.println("Country " + country + " belong to " + Continent.NORTH_AMERICA.getName());
            case SOUTH_AMERICA -> System.out.println("Country " + country + " belong to " + Continent.SOUTH_AMERICA.getName());
            case AFRICA -> System.out.println("Country " + country + " belong to " + Continent.AFRICA.getName());
            case AUSTRALIA -> System.out.println("Country " + country + " belong to " + Continent.AUSTRALIA.getName());
            case ANTARCTICA -> System.out.println("Country " + country + " belong to " + Continent.ANTARCTICA.getName());
            default -> System.out.println("Something happened wrong.");
        }
    }

    public Continent checkListOfCounties(String country, ListOfCountries listsOfCountries) {
        if (checkListOfCounties(country, listsOfCountries.europeanCountries())) {
            return EUROPE;
        } else if (checkListOfCounties(country, listsOfCountries.asianCountries())) {
            return Continent.ASIA;
        } else if (checkListOfCounties(country, listsOfCountries.northAmericaCountries())) {
            return Continent.NORTH_AMERICA;
        } else if (checkListOfCounties(country, listsOfCountries.southAmericaCountries())) {
            return Continent.SOUTH_AMERICA;
        } else if (checkListOfCounties(country, listsOfCountries.africanCountries())) {
            return Continent.AFRICA;
        } else if (checkListOfCounties(country, listsOfCountries.australianCountries())) {
            return Continent.AUSTRALIA;
        } else if (checkListOfCounties(country, listsOfCountries.antarcticaCountries())) {
            return Continent.ANTARCTICA;
        } else return null;
    }


    public boolean checkListOfCounties(String country, String[] listOfCountries) {
        for (String continentCountry : listOfCountries) {
            if (country.toLowerCase().equals(continentCountry)) {
                return true;
            }
        }
        return false;
    }
}
