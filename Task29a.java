//Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

public class Task29a {
    public static void main(String[] args) {
        double a = 8.0;
        double b = 9.0;
        double c = 2.0;

        double Angle1rad = Math.acos((b*b + c*c - a*a)/(2*b*c));
        double Angle2rad = Math.acos((- b*b + c*c + a*a)/(2*c*a));
        double Angle3rad = Math.acos((b*b - c*c + a*a)/(2*a*b));

        double Angle1deg = (180 * Angle1rad / Math.PI);
        double Angle2deg = (180 * Angle2rad / Math.PI);
        double Angle3deg = (180 * Angle3rad / Math.PI);

        System.out.println("угол 1 = " + Angle1rad + " радиан = " + Angle1deg + "градусов");
        System.out.println("угол 2 = " + Angle2rad + " радиан = " + Angle2deg + "градусов");
        System.out.println("угол 3 = " + Angle3rad + " радиан = " + Angle3deg + "градусов");
    }
}
