//Вычислить значение выражения по формуле (все переменные принимают действительные значения:
// (a/c) * (b/d) - (ab - c)/cd

//  формулу можно сократить, так как (a/c)*(b/d) = (a*b)/(c*d)
//  а также  с/(с*d) = 1/d

public class Task09a {
    public static void main(String[] args) {
        double d = 2.0;
        double formula = 1/d;
        System.out.println("значение формулы = " + formula);
    }
}
