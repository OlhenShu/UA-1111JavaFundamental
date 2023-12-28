import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String name;
        String address;

        System.out.println("What is your name?");
        Scanner st = new Scanner(System.in);
        name = st.nextLine();
        System.out.println("my name is " + name);

        System.out.println("Where do you live?");
        address = st.nextLine();
        System.out.println("I live in " + address);

    }
}
