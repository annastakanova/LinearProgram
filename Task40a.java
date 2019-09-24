//Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 .
//Позаботьтесь об экономии операций

public class Task40a {
    public static void main(String[] args) {
        double x = 2.0;
        double f1 = ((-4*x+3)*x-2)*x;
        double f2 = ((4*x+3)*x+2)*x+1;
        System.out.println("значение функции 1 = " + f1);
        System.out.println("значение функции 2 = " + f2);
    }
}
