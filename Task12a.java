public class Task12a {
    public static void main(String[] args) {
        int x1 = 9;
        int x2 = 3;
        int y1 = 1;
        int y2 = 7;
        double a = Math.pow(x2-x1, 2);
        double b = Math.pow(y2-y1, 2);
        double d = Math.sqrt(a + b);
        System.out.println("расстояние между точками = " + d);
    }
}
