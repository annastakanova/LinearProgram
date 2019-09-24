//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
//(𝑏+ √(𝑏2 +4𝑎𝑐))/2a - (a^3)с - (b^-2)


import static java.lang.Math.*;

public class Task08a {
    public static void main(String[] args) {
        double a=1.0, b=2.0, c=3.0;
        double func1 = (b + (sqrt(Math.pow(b, 2) + 4*a*c)))/(2*a) - (Math.pow(a, 3))*c + (Math.pow(b, -2));
        System.out.println("значение функции = " + func1);
        double t1 = Math.pow(a, -2);
        System.out.println(t1);
    }
}
