//Найти произведение цифр заданного четырехзначного числа.

public class Task16a {
    public static void main(String[] args) {
        int n = 2345;
        int m = 1;
        for (int i = 0; i < 4; i++) {
            m *= n % 10;
            n /= 10;
        }
        System.out.println("Произведение: " + m);
    }
}
