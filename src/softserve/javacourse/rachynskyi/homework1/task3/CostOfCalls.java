package softserve.javacourse.rachynskyi.homework1.task3;

import java.util.Scanner;

public class CostOfCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c1;
        double c2;
        double c3;
        int t1;
        int t2;
        int t3;

        System.out.println("Hello. I want to help you to calculate how much calls cost!");

        System.out.println("Input call price per minute for Country 1:");
        c1 = scanner.nextDouble();
        System.out.println("Input call duration in minutes for Country 1:");
        t1 = scanner.nextInt();

        System.out.println("Input call price per minute for Country 2:");
        c2 = scanner.nextDouble();
        System.out.println("Input call duration in minutes for Country 2:");
        t2 = scanner.nextInt();

        System.out.println("Input call price per minute for Country 3:");
        c3 = scanner.nextDouble();
        System.out.println("Input call duration in minutes for Country 3:");
        t3 = scanner.nextInt();

        double costOfCall1 = c1 * t1;
        double costOfCall2 = c2 * t2;
        double costOfCall3 = c3 * t3;

        System.out.println("Call that made from country 1 cost: " + costOfCall1);
        System.out.println("Call that made from country 2 cost: " + costOfCall2);
        System.out.println("Call that made from country 3 cost: " + costOfCall3);

    }
}
