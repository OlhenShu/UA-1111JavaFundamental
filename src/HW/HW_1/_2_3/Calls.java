package HW.HW_1._2_3;

import java.util.Scanner;

public class Calls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the first call");
        int c1 = scanner.nextInt();
        System.out.println("Enter the price of the second call");
        int c2 = scanner.nextInt();
        System.out.println("Enter the price of the third call");
        int c3 = scanner.nextInt();

        System.out.println("Enter duration of the first call");
        int t1 = scanner.nextInt();
        System.out.println("Enter duration of the second call");
        int t2 = scanner.nextInt();
        System.out.println("Enter duration of the third call");
        int t3 = scanner.nextInt();

        int cost1 = calculationCostCall(c1, t1);
        int cost2 = calculationCostCall(c2, t2);
        int cost3 = calculationCostCall(c3, t3);

        int costAll = cost1 + cost2 + cost3;

        System.out.println("The cost of the first call = " + cost1);
        System.out.println("The cost of the second call = " + cost2);
        System.out.println("The cost of the third call = " + cost3);

        System.out.println("Total cost = " + costAll);
    }

    public static int calculationCostCall(int c, int t) {
        return c * t;
    }
}
