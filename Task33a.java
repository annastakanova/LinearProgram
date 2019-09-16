public class Task33a {
    public static void main(String[] args) {
        char a = 'W';
        int numb = (int) a;
        System.out.println("предыдущий символ = " + (char)(numb-1));
        System.out.println("порядковый номер символа W = " + numb);
        System.out.println("следующий символ = " + (char)(numb+1));
    }
}
