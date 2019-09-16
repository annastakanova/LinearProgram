public class Task21a {
    public static void main(String[] args) {
        double n = 123.456;
        int a = (int) n;
        double aDouble = (double) a/1000;
        double b = n*1000%1000;
        double c = aDouble+b;

        System.out.println(a);
        System.out.println(aDouble);
        System.out.println(b);
        System.out.println(c);
    }
}
