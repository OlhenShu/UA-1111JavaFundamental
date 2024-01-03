package edu01.homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println(name + ", " + "Where do you live?");
        String address = scanner.nextLine();
        System.out.println("Full information:" + " Your name is " + name + "," + " your address is " + address + ".");
    }
}
