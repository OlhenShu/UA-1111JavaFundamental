package homeworks.homework2;

import java.util.Scanner;

public class SmallestNumber {

    public static Scanner sc = new Scanner(System.in);

    public static int findSmallestNumber(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        System.out.print("Input the third number: ");
        int c = sc.nextInt();

        System.out.println("The smallest number is: " + findSmallestNumber(a, b, c));

    }
}
