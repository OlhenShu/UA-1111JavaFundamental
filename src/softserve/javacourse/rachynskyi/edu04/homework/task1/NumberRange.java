package softserve.javacourse.rachynskyi.edu04.homework.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberRange {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        checkThatNumberInRange();
    }

    public static void checkThatNumberInRange() {
        List<Float> listOfNumbers = new ArrayList<>();

        System.out.println("Enter number 1:");
        listOfNumbers.add(getFloatNumber());
        System.out.println("Enter number 2:");
        listOfNumbers.add(getFloatNumber());
        System.out.println("Enter number 3:");
        listOfNumbers.add(getFloatNumber());

        int i = 0;
        for (float number : listOfNumbers) {
            if (number < -5 || number > 5) {
                i = 1;
                break;
            }
        }

        switch (i) {
            case 0 -> System.out.println("All numbers belong to range [-5;5]");
            case 1 -> System.out.println("Not all numbers belong to range [-5;5]");
            default -> System.out.println("Something happened wrong");

        }
    }

    public static float getFloatNumber() {
        while (!scanner.hasNextFloat()) {
            System.out.println("Number must be in float format. Please, try again:");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}
