//Дана величина А, выражающая объем информации в байтах.
// Перевести А в более крупные единицы измерения информации.

public class Task34a {
    public static void main(String[] args) {
        int b = 12000009;                     //объем в байтах
        int ost = b % 1000000;
        int mb;
        if (ost != 0) {
             mb = b / 1000000 +1;
        }
        else mb = b / 1000000;
        System.out.println(b + "байт = " + mb + " мегабайт");
    }
}
