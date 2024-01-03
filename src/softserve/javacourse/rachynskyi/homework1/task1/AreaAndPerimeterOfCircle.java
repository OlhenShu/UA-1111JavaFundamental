package softserve.javacourse.rachynskyi.homework1.task1;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double pi = Math.PI;

        System.out.println("Hello. I want to help you to calculate the perimeter and area for the Circle!");
        System.out.println("Enter value of radius in double format:");

        Double radius = Double.valueOf(scanner.nextLine());

        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Perimeter is: " + perimeter + "\n" + "Area is: " + area);
    }
}
