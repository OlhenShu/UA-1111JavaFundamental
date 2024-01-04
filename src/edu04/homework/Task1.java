package edu04.homework;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Input the second number: ");
    int num2 = scanner.nextInt();
    System.out.print("Input the third number: ");
    int num3 = scanner.nextInt();

    if (num1 >= -5 && num1<= 5 &&
        num2 >= -5 && num2<= 5 &&
        num3 >= -5 && num3<= 5) {
        System.out.print("All numbers are in [-5;5] ");
    } else {
        System.out.print("One of the numbers does not belong [-5;5] ");
    }
    }
}
