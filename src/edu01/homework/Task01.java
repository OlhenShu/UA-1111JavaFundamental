package edu01.homework;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;
        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);

    }
}
