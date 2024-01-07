package softserve.javacourse.rachynskyi.sandbox;

public class SandBox {
    public static void main(String[] args) {
        int t = 5, s = 4, v = 7;
        System.out.println((t > s) && (t > v) || (s < v));
        System.out.println((t > s) || (t > v) && (s > v));
        System.out.println((t > s || t > v) && (s > v));
    }


}
