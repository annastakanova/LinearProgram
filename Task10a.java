// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)*(𝑡𝑔 𝑥𝑦)

// верно или нет??

public class Task10a {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 5.0;
        double result = (Math.sin(x) + Math.cos(y)) * (Math.tan(x * y)) / (Math.cos(x) - Math.sin(y));
        System.out.println("значение выражения = "+result);
    }
}
