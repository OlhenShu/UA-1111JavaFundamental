package HW.HW_1._2_1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        System.out.println("Perimeter = " + String.format("%.2f", calculationPerimeter(radius)));
        System.out.println("Area = " + String.format("%.2f", calculationArea(radius)));

    }

    public static double calculationPerimeter(double r) {
//P=2*PI*r
        return 2 * Math.PI * r;
    }

    public static double calculationArea(double r) {
        // S=PI*r2
        return Math.PI * r * r;
    }
}
