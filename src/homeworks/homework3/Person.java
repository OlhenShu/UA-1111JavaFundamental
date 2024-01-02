package homeworks.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - getBirthYear();
        return age;
    }

    public static Scanner sc = new Scanner(System.in);

    public void input() {
        Person nextPerson = new Person();

        System.out.println("Input first name: ");
        nextPerson.setFirstName(sc.nextLine());

        System.out.println("Input last name: ");
        nextPerson.setLastName(sc.nextLine());

        System.out.println("Input year of birth: ");
        nextPerson.setBirthYear(sc.nextInt());

        System.out.println(nextPerson);

    }

    public void output() {
        System.out.println(getFirstName() + " " + getLastName());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public static void main(String[] args) {

        Person petrenko = new Person();
        petrenko.setFirstName("Roman");
        petrenko.setLastName("Petrenko");
        petrenko.setBirthYear(1985);

        Person makarov = new Person("Oleh", "Makarov");
        makarov.setBirthYear(2005);

        Person ryda = new Person("Inna", "Ruda");
        ryda.setBirthYear(1994);

        Person fatikov = new Person("Oleksandr", "Fatikov");
        fatikov.setBirthYear(1965);

        Person yashchenko = new Person("Danylo", "Yashchenko");
        yashchenko.setBirthYear(2000);

        System.out.println(petrenko);
        System.out.println(makarov);
        System.out.println(ryda);
        System.out.println(fatikov);
        System.out.println(yashchenko);

        petrenko.changeName("Ihor", "Slyva");
        System.out.println(petrenko);

        petrenko.output();

    }
}
