//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class Task14a {
    public static void main(String[] args) {
        int radius = 9;
        double circleLength = Math.PI*2*radius;
        double circleSquare = Math.PI*radius*radius;
        System.out.println("длина окружности = " + circleLength);
        System.out.println("площадь круга = " + circleSquare);
    }
}
