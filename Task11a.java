import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Task11a {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + c;
        double square = a * b / 2;

        System.out.println("периметр треугольника = " + perimeter);
        System.out.println("площадь треугольника = " + square);
    }
}
