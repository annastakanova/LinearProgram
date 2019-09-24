//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class Task35a {
    public static void main(String[] args) {
        double m = 746812;
        double n = 5021;
        double x = m / n;
        System.out.println("m/n = " + x + "\n");
        System.out.println("младшая цифра целой части = " + ((int)x%10));
        System.out.println("старшая цифра дробной части = " + (int)(10*x)%10);
    }
}
