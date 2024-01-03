package softserve.javacourse.rachynskyi.homework3.task1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Input Side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Input Side 3:");
        double side3 = scanner.nextDouble();

        System.out.println(isValid(side1, side2, side3) ? "The area of triangle is " + calculateTriangleArea(side1, side2, side3) : "Invalid triangle");
    }

    private static boolean isValid(double s1, double s2, double s3) {
        return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
    }

    private static double calculateTriangleArea(double s1, double s2, double s3) {
        double p = s1 + s2 + s3;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }
}
