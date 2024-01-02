package Edu02;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter side 1");
        double side1 = sc.nextDouble();

        System.out.println("Enter side 2");
        double side2 = sc.nextDouble();

        System.out.println("Enter side 3");
        double side3 = sc.nextDouble();

        double area = calculateAreaTriangle(side1,side2,side3);
        System.out.println("The area of the triangle is = "+ area);

    }

    public static double calculateAreaTriangle  (double side1, double side2, double side3) {

        //perimeter
        double s = (side1 + side2 + side3) / 2;
        //area
        double calculateArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return calculateArea;


    }
}
