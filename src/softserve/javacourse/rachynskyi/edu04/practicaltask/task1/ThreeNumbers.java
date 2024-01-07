package softserve.javacourse.rachynskyi.edu04.practicaltask.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeNumbers {

    public int firstNumber;
    public int secondNumber;
    public int thirdNumber;

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ThreeNumbers threeNumbers = new ThreeNumbers();

        threeNumbers.getCountOfOddNumbers();
    }

    public void getCountOfOddNumbers() {

        int countOfOddNumbers = 0;

        System.out.println("Enter first integer number:");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second integer number:");
        secondNumber = scanner.nextInt();
        System.out.println("Enter third integer number:");
        thirdNumber = scanner.nextInt();

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(firstNumber);
        numberList.add(secondNumber);
        numberList.add(thirdNumber);

        for (int number : numberList) {
            if (isOdd(number)) {
                countOfOddNumbers++;
            }
        }

        System.out.println(countOfOddNumbers + " odd numbers was entered");
    }

    public boolean isOdd(int i) {
        return i % 2 != 0;
    }
}
