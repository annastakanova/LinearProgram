// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:

// Целое число N является четным двузначным числом.
// Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
// Сумма цифр данного трехзначного числа N является четным числом.
// Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
// Треугольник со сторонами а,b,с является равнобедренным.
// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
// Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
// График функции у=ах2+bх+с проходит через заданную точку с координатами (m, п).

public class Task37a {
    public static void main(String[] args) {
        System.out.println(m1(87));         // Целое число N является четным двузначным числом.
        System.out.println(m2(3526));       // Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
        System.out.println(m3(222));        // Сумма цифр данного трехзначного числа N является четным числом.
        System.out.println(m4(2, 5));    // Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
        System.out.println(m5(187));        // Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
        System.out.println(m6(2, 2, 4));      // Треугольник со сторонами а,b,с является равнобедренным.
        System.out.println(m7(548));        // Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
        System.out.println(m8(27, 3));   // Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
        System.out.println(m9(1, 9));           // График функции у=ах2+bх+с проходит через заданную точку с координатами (m, n).
    }

    static boolean m1 (int a) {
        if ((a > 9) && (a < 100) && (a % 2 == 0))
            return true;
        else
            return false;
    }

    static boolean m2 (int b) {
        int s1 = (int)b/1000;
        int s2 = (b/100)%10;
        int s3 = (b/10)%10;
        int s4 = b%10;
        if ((s1+s2 == s3+s4) && (b > 999) && (b < 10000))
            return true;
        else
            return false;
    }

    static boolean m3 (int c) {
        int s1 = (int)c/100;
        int s2 = (c/10)%10;
        int s3 = c%10;
        int sum = s1+s2+s3;
        if (sum%2==0)
            return true;
        else
            return false;
    }

    static boolean m4 (int d, int e) {
        int x1 = 1;
        int x2 = 24;
        if ((d >=x1) && (d < x2))
            return true;
        else
            return false;
    }

    static boolean m5 (int a) {
        int s1 = (int)a/100;
        int s2 = (a/10)%10;
        int s3 = a%10;
        int sum = s1+s2+s3;
        if ((a > 99) && (a < 1000) && (a*a == sum*sum*sum))
            return true;
        else
            return false;
    }

    static boolean m6 (int a, int b, int c) {
        if ((a == b) || (a == c) || (b == c))
            return true;
        else
            return false;
    }

    static boolean m7 (int a) {
        int s1 = (int)a/100;
        int s2 = (a/10)%10;
        int s3 = a%10;
        if ((a > 99) && (a < 1000) && (s1+s2 == s3) || (s1+s3 == s2) || (s2+s3 == s1))
            return true;
        else
            return false;
    }

    static boolean m8 (int n, int a) {
        if (n == Math.pow(a, 0) || n == Math.pow(a, 1) || n == Math.pow(a, 2) || n == Math.pow(a, 3) || n == Math.pow(a, 4))
            return true;
        else
            return false;
    }

    static boolean m9 (int m, int n) {
        int c1 = 2;
        int c2 = 3;
        int c3 = 4;
        if (n == c1*m*m+c2*m+c3)
            return true;
        else
            return false;
    }

}
