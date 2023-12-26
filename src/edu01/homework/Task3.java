package edu01.homework;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost per minute for first call: ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter the duration of first call: ");
        double t1 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for second call: ");
        double c2 = scanner.nextDouble();
        System.out.print("Enter the duration of  second call in minutes: ");
        double t2 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for third call: ");
        double c3 = scanner.nextDouble();
        System.out.print("Enter the duration of third call in minutes: ");
        double t3 = scanner.nextDouble();


        double costCall1 = c1 * t1;
        double costCall2 = c2 * t2;
        double costCall3 = c3 * t3;

        double totalCost = costCall1 + costCall2 + costCall3;

        System.out.println();
        System.out.println("Cost of call 1: ₴" + costCall1);
        System.out.println("Cost of call 2: ₴" + costCall2);
        System.out.println("Cost of call 3: ₴" + costCall3);
        System.out.println();
        System.out.println("Total cost: ₴" + totalCost);

        scanner.close();
    }


}

