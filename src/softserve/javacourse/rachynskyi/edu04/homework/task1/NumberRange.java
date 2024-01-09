package softserve.javacourse.rachynskyi.edu04.homework.task1;

import java.util.Scanner;

public class NumberRange {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        checkThatNumberInRange();
    }

    public static void checkThatNumberInRange() {
        System.out.println("Enter number 1:");
        float number1 = getFloatNumber();
        System.out.println("Enter number 2:");
        float number2 = getFloatNumber();
        System.out.println("Enter number 3:");
        float number3 = getFloatNumber();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }

    public static float getFloatNumber() {
        while (!scanner.hasNextFloat()) {
            System.out.println("Number must be in float format. Please, try again:");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}
