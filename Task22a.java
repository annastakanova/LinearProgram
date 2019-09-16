public class Task22a {
    public static void main(String[] args) {
        int t = 12345;
        int seconds = t%60;             //остаток - секунд
        int minutesAll = t/60;          //всего минут
        int minutes = minutesAll%60;    //остаток - минут
        int hours = minutesAll/60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }
}
