package edu01.homework;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost per minute for the first call");
        double c1 = scanner.nextDouble();
        System.out.println("Enter the duration of the first call");
        double t1 = scanner.nextDouble();
        System.out.println("Enter the cost per minute for the second call");
        double c2 = scanner.nextDouble();
        System.out.println("Enter the duration of the second call");
        double t2 = scanner.nextDouble();
        System.out.println("Enter the cost per minute for the third call");
        double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of the third call");
        double t3 = scanner.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3; System.out.println("Cost of the first call: " + cost1);
        System.out.println("Cost of the second call: " + cost2);
        System.out.println("Cost of the third call: " + cost3);
        System.out.println("Total cost: " + totalCost);





    }
}
