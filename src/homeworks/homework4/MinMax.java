package homeworks.homework4;

import java.util.Scanner;

public class MinMax {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        System.out.print("Input the third number: ");
        int c = sc.nextInt();

        int minNumber = a;
        if (b < a) {
            minNumber = b;
        }
        if (c < b) {
            minNumber = c;
        }
        System.out.println("The smallest number is: " + minNumber );

        int maxNumber = a;
        if (b > a) {
            maxNumber = b;
        }
        if (c > b) {
            maxNumber = c;
        }
        System.out.println("The biggest number is: " + maxNumber);
    }
}