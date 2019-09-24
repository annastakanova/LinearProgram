//Написать программу, которая выводит на экран первые четыре степени числа π.

public class Task15a {
    public static void main(String[] args) {
        double pi1 = Math.PI;
        double pi2 = pi1 * Math.PI;
        double pi3 = pi2 * Math.PI;
        double pi4 = pi3 * Math.PI;
        double pi5 = pi4 * Math.PI;
        System.out.println("Пи в первой степени = " + pi1);
        System.out.println("Пи в квадрате = " + pi2);
        System.out.println("Пи в кубе = " + pi3);
        System.out.println("Пи в четвертой степени = " + pi4);
        System.out.println("Пи в пятой степени = " + pi5);
    }
}
