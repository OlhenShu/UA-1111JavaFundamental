package softserve.javacourse.rachynskyi.edu01.task2;

import java.util.Scanner;

public class NameAndAddressOfPerson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String address;

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("Where do you live?");
        address = scanner.nextLine();

        System.out.println("Your name is " + name + ". " + "You live in " + address + ".");
    }
}
