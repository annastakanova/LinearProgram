//Даны два числа.
// Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class Task17a {
    public static void main(String[] args) {
        int a = 9;
        int b = 4;
        double avgAr = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
        double avgGeo = Math.sqrt (Math.abs(a) + Math.abs(b));
        System.out.println("среднее арифметическое кубов = " + avgAr);
        System.out.println("среднее геометрическое чисел = " + avgGeo);
    }
}
