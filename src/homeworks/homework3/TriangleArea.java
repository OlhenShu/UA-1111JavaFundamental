package homeworks.homework3;

import java.util.Scanner;

public class TriangleArea {

    public static Scanner sc = new Scanner(System.in);

    public static double calculateArea(double a, double b, double c) {

        double s = (a + b + c) / 2; //semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public static void main(String[] args) {
        System.out.print("Input side 1: ");
        double a = sc.nextDouble();

        System.out.print("Input side 2: ");
        double b = sc.nextDouble();

        System.out.print("Input side 3: ");
        double c = sc.nextDouble();

        System.out.println("Area of triangle = " + calculateArea(a, b, c));
    }
}
