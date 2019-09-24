//Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
// Найти его периметр и площадь.

public class Task13a {
    public static void main(String[] args) {
        int x1 = 9;
        int x2 = 3;
        int x3 = 1;
        int y1 = 1;
        int y2 = 7;
        int y3 = 5;

        double d1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double d2 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        double d3 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));

        if (d1>0 || d2>0 || d3>0 || d1+d2>d3 || d1+d3>d2 || d2+d3>d1) {
            double p = d1 + d2 + d3;
            double sq = Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
            System.out.println("длина ребра 1 = " + d1);
            System.out.println("длина ребра 2 = " + d2);
            System.out.println("длина ребра 3 = " + d3);
            System.out.println("периметр треугольника = " + p);
            System.out.println("площадь треугольника = " + sq);}
        else System.out.println("неверная длина стороны треугольника!");
        }
}
