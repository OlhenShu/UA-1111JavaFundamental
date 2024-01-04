package softserve.javacourse.rachynskyi.edu03.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        double number1 = scanner.nextDouble();
        System.out.println("Input the second number:");
        double number2 = scanner.nextDouble();
        System.out.println("Input the third number:");
        double number3 = scanner.nextDouble();

        System.out.println(isValid(number1, number2, number3) ? "The area of triangle is " + findSmallestNumber(number1, number2, number3) : "Numbers are equal");
    }

    public static boolean isValid(double n1, double n2, double n3) {
        return n1 != n2 && n2 != n3 && n1 != n3;
    }

    public static double findSmallestNumber(double n1, double n2, double n3) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(n1);
        list.add(n2);
        list.add(n3);

        double min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }

        return min;
    }
}
