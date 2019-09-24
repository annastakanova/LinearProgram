//Найти площадь равнобедренной трапеции
//с основаниями а и b и углом α при большем основании а.


// s = ((a+b)*h)/2
// h = tgA*(b-a)/2
// s = ((a+b)*tgA*(b-a))/4 = tgA * (a^2 - b^2) / 4

public class Task24a {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int angle = 1;  //угол в радианах
        if (a>b && a>0 && b>0){
            double s = Math.tan(angle) * (a*a - b*b) / 4;
            System.out.println("площадь трапеции = " + s);
        }
        else
            System.out.println("неверная длина оснований");

    }
}
