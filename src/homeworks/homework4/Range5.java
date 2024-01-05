package homeworks.homework4;

import java.util.Scanner;

public class Range5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please, input three float numbers, e.g. 2,45 (with comma): ");

        float number;
        int counter = 0;

        for (int i = 0; i < 3; i++) {
            number = sc.nextFloat();

            if ((number >= -5) && (number <= 5)) {
                counter++;
            }
        }

        if (counter == 3) {
            System.out.println("All your numbers belong to the range [-5; 5]");
        } else {
            System.out.println("Not all your numbers belong to the range [-5; 5]");
        }
    }
}
