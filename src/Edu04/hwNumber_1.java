package Edu04;

import java.util.Scanner;

public class hwNumber_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the first float number:");
//        float num1 = scanner.nextFloat();
//
//        System.out.println("Enter the second float number:");
//        float num2 = scanner.nextFloat();
//
//        System.out.println("Enter the third float number:");
//        float num3 = scanner.nextFloat();
//
//
//       if (((num1 >= -5) && (num1 <= 5)) && ((num2 >= -5) && (num2 <= 5)) && ((num3 >= -5) && (num3 <= 5))){
//           System.out.println("they belong to the range [-5, 5].");
//       }else {
//           System.out.println("not all numbers belong to the range [-5, 5]. ");
//       }



        //як вивести в консоль цифру з крапкою без помилки!!!!!!!!!!!

        for (int i = 0; i < 3; i++){
        System.out.println("Enter the first float number:");
             float number = scanner.nextFloat();

            if ( (number >= -5.0) &&  (number <= 5.0)){
                System.out.println("they belong to the range [-5, 5].");

            }else  {
                System.out.println("not all numbers belong to the range [-5, 5]. ");
            }

        }
        Scanner close;
    }
}
