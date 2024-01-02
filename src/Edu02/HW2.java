package Edu02;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int number1 = sc.nextInt();

        System.out.println("enter second number");
        int number2 = sc.nextInt();

        System.out.println("enter third number");
        int number3 = sc.nextInt();

        //calculate minNumber
        int minNumber = Math.min(number1, Math.min(number2,number3));

        System.out.println("The minimum number is " + minNumber);
    }
}
