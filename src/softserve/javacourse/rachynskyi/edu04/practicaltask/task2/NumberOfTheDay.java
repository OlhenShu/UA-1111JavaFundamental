package softserve.javacourse.rachynskyi.edu04.practicaltask.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfTheDay {
    Scanner scanner = new Scanner(System.in);
    int numberOfDay = 0;

    public static void main(String[] args) {
        NumberOfTheDay numberOfTheDay = new NumberOfTheDay();
        numberOfTheDay.dayOfWeek();
    }

    public void dayOfWeek() throws InputMismatchException {
        do {
            System.out.println("Enter day of week (number from 1 to 7):");
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong value entered!");
                scanner.next();
            }
            numberOfDay = scanner.nextInt();
        } while (numberOfDay < 1 || numberOfDay > 7);

        switch (numberOfDay) {
            case 1 -> System.out.println("En: Monday" + "\n" + "Ua: Понеділок");
            case 2 -> System.out.println("En: Tuesday" + "\n" + "Ua: Вівторок");
            case 3 -> System.out.println("En: Wednesday" + "\n" + "Ua: Середа");
            case 4 -> System.out.println("En: Thursday" + "\n" + "Ua: Четверг");
            case 5 -> System.out.println("En: Friday" + "\n" + "Ua: П'ятниця");
            case 6 -> System.out.println("En: Saturday" + "\n" + "Ua: Субота");
            case 7 -> System.out.println("En: Sunday" + "\n" + "Ua: Неділя");
            default -> System.out.println("Something wrong");
        }
    }
}
