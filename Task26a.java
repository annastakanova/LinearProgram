//Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.

public class Task26a {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int y = 8;                                     //угол в радианах
        double CountSin = Math.sin(y);                  //синус угла
        double s = a * b * Math.abs(CountSin)/2;        //синус берем по модулю
            //System.out.println("синус угла = " + CountSin);
        System.out.println("площадь треугольника = " + s);
    }
}
