package homeworks.homework1;
import java.util.Scanner;
public class NameAndadress {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is your name? ");

        String name = sc.nextLine();

        System.out.println("Where do you live, " + name + "?");

        String address = sc.nextLine();

        System.out.println("Name: " + name + "; Address: " + address);
    }
}
