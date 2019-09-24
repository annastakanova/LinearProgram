//Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с
// (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).

public class Task25a {
    public static void main(String[] args) {
        double a = 1;
        double b = -8;
        double c = 12;
        double dis = b*b - 4*a*c;

        if (a!=0 && dis>=0){
            double x1 = (- b + Math.sqrt(dis))/(2*a);
            double x2 = (- b - Math.sqrt(dis))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else System.out.println("неверные значения");
    }
}
