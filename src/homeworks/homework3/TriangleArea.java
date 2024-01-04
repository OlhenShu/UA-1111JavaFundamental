package homeworks.homework3;

import java.util.Scanner;

public class TriangleArea {

    public static Scanner sc = new Scanner(System.in);

    public static double calculateArea(double a, double b, double c) {
        // double semiPerimeter = (a + b + c) / 2;//this variant naming better
        double s = (a + b + c) / 2; //semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
        // return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // if you don`t use variable area, you can to do return
    }
//    private static boolean isValidTriangle(double a, double b, double c) {
//        return (a + b > c) && (a + c > b) && (b + c > a);
//    }//better to add this method, because without it you can have exception
    // try 2, 4,7


    public static void main(String[] args) {
        System.out.print("Input side 1: ");
        double a = sc.nextDouble();

        System.out.print("Input side 2: ");
        double b = sc.nextDouble();

        System.out.print("Input side 3: ");
        double c = sc.nextDouble();

        System.out.println("Area of triangle = " + calculateArea(a, b, c));

//        if (isValidTriangle(a, b, c)) {
//            System.out.println("Area of triangle = " + calculateArea(a, b, c));
//        } else {
//            System.out.println("Entered sides do not form a valid triangle.");
//        }
    }
}
