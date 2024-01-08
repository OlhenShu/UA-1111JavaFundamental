package softserve.javacourse.rachynskyi.edu04.practicaltask.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

enum DayOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четверг"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    final String englishName;
    final String ukrainianName;

    DayOfWeek(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public static String getInfoByNumber(int numberOfDay) {
        return switch (numberOfDay) {
            case 1 -> "En: " + MONDAY.englishName + "\n" + "Ua: " + MONDAY.ukrainianName;
            case 2 -> "En: " + TUESDAY.englishName + "\n" + "Ua: " + TUESDAY.ukrainianName;
            case 3 -> "En: " + WEDNESDAY.englishName + "\n" + "Ua: " + WEDNESDAY.ukrainianName;
            case 4 -> "En: " + THURSDAY.englishName + "\n" + "Ua: " + THURSDAY.ukrainianName;
            case 5 -> "En: " + FRIDAY.englishName + "\n" + "Ua: " + FRIDAY.ukrainianName;
            case 6 -> "En: " + SATURDAY.englishName + "\n" + "Ua: " + SATURDAY.ukrainianName;
            case 7 -> "En: " + SUNDAY.englishName + "\n" + "Ua: " + SUNDAY.ukrainianName;
            default -> throw new IllegalArgumentException("There is no such number of day:" + numberOfDay);
        };
    }
}

public class NumberOfDay {
    Scanner scanner = new Scanner(System.in);
    int dayNumber = 0;

    public static void main(String[] args) {
        NumberOfDay numberOfDay = new NumberOfDay();
        numberOfDay.getDayOfWeek();
    }

    public void getDayOfWeek() throws InputMismatchException {
        do {
            System.out.println("Enter the number of day of a week:");
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong number. Enter number from 1 to 7.");
                scanner.next();
            }
            dayNumber = scanner.nextInt();
        } while (dayNumber < 1 || dayNumber > 7);

        System.out.println(DayOfWeek.getInfoByNumber(dayNumber));
    }
}

