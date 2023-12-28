package homeworks.homework1;
import java.math.*;
import java.io.*;
import java.util.Scanner;

public class Circle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the radius of flower bed:");

        int radius = sc.nextInt();
        double perimeter = 2*Math.PI*radius;

        System.out.println("Perimeter of flower bed is " + perimeter);
    }
}
