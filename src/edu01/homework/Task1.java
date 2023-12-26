package edu01.homework;
import java.util.Scanner;
public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter radius: ");
            double r = scanner.nextDouble();

            double sq = Math.PI * r * r;
            double pr = 2 * Math.PI * r;

            System.out.println("Area of a circle: " + sq);
            System.out.println("Perimeter of a circle: " + pr);

            scanner.close();
        }
    }

