//Для данных областей составить линейную программу,
// которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
// и false — в противном случае

public class Task38a {
    public static void main(String[] args) {
        System.out.println(squaA (-1, -1));
        System.out.println(squaB (1, -2));
        System.out.println(squaC (2, -1));
    }
    // a)
    static boolean squaA(int a, int b) {
        if ((b >= 0) && (b <= 4 - Math.abs(a)))
            return true;
        else
            return false;
    }

    // b)
    static boolean squaB(int i, int j) {
        if ((j >= 0) && (j <= 4) && ((i >= -2) && (j <= 2))
                || (j < 0) && (j >=-3) &&  (i>=-4) && (i<=4))
        return true;
        else
        return false;
    }


    // c)
    static boolean squaC(int x, int y){
        if ((x * x + y * y <= 16) && (x >= 0) && (y >= 0))
            return true;
        else if ((x * x + y * y <= 25) && (x >= 0) && (y <= 0))
            return true;
        else
            return false;
    }
}
