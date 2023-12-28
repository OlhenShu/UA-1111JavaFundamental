package homeworks.homework1;

import java.util.Scanner;

public class PhoneCalls {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***** First call *****");
        System.out.println("Enter cost per minute:");
        int c1 = sc.nextInt();
        System.out.println("Enter the duration:");
        int t1 = sc.nextInt();
        System.out.println("Cost of the first call = $" + c1*t1);

        System.out.println("***** Second call *****");
        System.out.println("Enter cost per minute:");
        int c2 = sc.nextInt();
        System.out.println("Enter the duration:");
        int t2 = sc.nextInt();
        System.out.println("Cost of the second call = $" + c2*t2);

        System.out.println("***** Third call *****");
        System.out.println("Enter cost per minute:");
        int c3 = sc.nextInt();
        System.out.println("Enter the duration:");
        int t3 = sc.nextInt();
        System.out.println("Cost of the third call = $" + c3*t3);

        int totalCost = c1*t1 + c2*t2 + c3*t3;
        System.out.println("Total cost of all calls = $" + totalCost);
    }
}
