//Дана сторона равностороннего треугольника.
// Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

public class Task19a {
    public static void main(String[] args) {
        int a = 6;
        double h = Math.sqrt (a*a - a*a/4);
        double s = a*h/2;

        double rSmall = Math.sqrt (3)/6*a;
        double rLarge = Math.sqrt (3)/3*a;
                System.out.println("площадь треугольника = " + s);
        System.out.println("высота треугольника = " + h);
        System.out.println("радиус вписанной окружности = " + rSmall);
        System.out.println("радиус описанной окружности = " + rLarge);
    }
}
