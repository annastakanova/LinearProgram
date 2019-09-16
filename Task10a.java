// верно или нет??
//

public class Task10a {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 5.0;
        double result = (Math.sin(x) + Math.cos(y)) * (Math.tan(x * y)) / (Math.cos(x) - Math.sin(y));
        System.out.println("значение выражения = "+result);
    }
}
