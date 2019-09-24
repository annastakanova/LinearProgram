//Дано значение a. Не используя никаких функций
// и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.

public class Task27a {
    public static void main(String[] args) {
        int a = 2;
        int b = a*a;
        int c = b*b;
        int d = c*c;  //a в степени 8
        int e = d*b;  //a в степени 10
        System.out.println("a в степени 8 = " + d);
        System.out.println("a в степени 10 = " + e);
    }
}
