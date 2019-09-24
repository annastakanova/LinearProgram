//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Task18a {
    public static void main(String[] args) {
        int a = 10;
        double squareVerge = Math.pow(a, 2);
        double squareCube = squareVerge * 6;
        double volumeCube = Math.pow(a, 3);
        System.out.println("площадь грани куба = " + squareVerge);
        System.out.println("площадь куба = " + squareCube);
        System.out.println("объем куба = " + volumeCube);
    }
}
