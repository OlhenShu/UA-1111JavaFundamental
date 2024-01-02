package edu03.homework;
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int n3 = scanner.nextInt();

        int sml = findSmallestNumber(n1, n2, n3);
        System.out.println("The smallest number: " + sml);
    }
    public static int findSmallestNumber(int n1, int n2, int n3) {
        return Math.min(Math.min(n1, n2), n3);
    }
}
