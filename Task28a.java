//Составить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Task28a {
    public static void main(String[] args) {
        int radian = 2;
        int degree = (int)(180 * radian / Math.PI);
        double tempMins = ((180 * radian / Math.PI) - degree)*60;   //от действительного числа отняли целую часть и остаток умножили на 60
        int mins = (int) tempMins;
        double tempSec = (tempMins - mins)*100;
        int sec = (int) tempSec;
        System.out.println(radian + " радиан  = " + degree + " градусов, " + mins + " минут, " + sec + " секунд");
    }
}
