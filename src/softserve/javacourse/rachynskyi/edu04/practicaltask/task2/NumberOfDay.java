package softserve.javacourse.rachynskyi.edu04.practicaltask.task2;

import java.util.InputMismatchException;
import java.util.Scanner;



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

