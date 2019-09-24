//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).

public class Task23a {
    public static void main(String[] args) {
        int rSmall = 1;
        int rLarge = 5;
        if (rSmall<rLarge || rSmall>0 || rLarge>0) {
            double s = Math.PI * (Math.pow(rLarge, 2) - Math.pow(rSmall, 2));
            System.out.println("площадь кольца = " + s);
        } else System.out.println("неверная длина радиусов!");
    }
}
