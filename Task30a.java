//Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.

public class Task30a {
    public static void main(String[] args) {
        int r1 = 9;
        int r2 = 4;
        int r3 = 10;
        double rAll = (double)(r1*r2*r3)/(r1*r2 + r2*r3 + r1*r3);
        System.out.println("сопротивление соединения = " + rAll);
    }
}
