import java.util.Scanner;

public class HomeWork1 {

        public static void main(String[] args) {
            System.out.println("Hello World!");

            //1111111111111111

        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        float perimeter = (float) (2 * Math.PI * radius);
        System.out.println("Perimeter = " + perimeter);

        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Area = " + area);
        }
}
