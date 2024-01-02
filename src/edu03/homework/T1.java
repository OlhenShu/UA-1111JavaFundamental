package edu03.homework;
import java.util.Scanner;
    public class T1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input side 1: ");
            double s1 = scanner.nextDouble();

            System.out.print("Input side 2: ");
            double s2 = scanner.nextDouble();

            System.out.print("Input side 3: ");
            double s3 = scanner.nextDouble();

            double area = calculateTriangleArea(s1, s2, s3);
            System.out.println("The area of triangle is: " + area);

        }

        public static double calculateTriangleArea(double s1, double s2, double s3) {
            double area = (s1 + s2 + s3) / 2;
            return Math.sqrt(area * (area - s1) * (area - s2) * (area - s3));
        }
    }

