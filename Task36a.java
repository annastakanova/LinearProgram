public class Task36a {
    public static void main(String[] args) {
        int n = 1234;
        int a = n/1000;
        int b = (int)(n/100 - 10*a);
        int c = (int)(n /10 - 10*b - 100*a);
        int d = (int)(n - 10*c - 100*b - 1000*a);
        double temp1 = b*d;
        double temp2 = a*c;
        double m = temp1/temp2;

        System.out.println("в виде дроби = " + b +"*" +d+ "/" +a+ "*" +c);
        System.out.println("в виде числа = " + m);
    }
}
