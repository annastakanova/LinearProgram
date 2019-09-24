//Текущее показание электронных часов:
// т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59).
// Какое время будут показывать часы через р ч q мин r с?

public class Task32a {
    public static void main(String[] args) {
        int m=12, n=40, k = 20;
        int p=18, q=5, r=45;

        if (m <= 23 || m>=0 || n <= 59 || n>=0 || k <= 59 || k>=0){
        int allSecs = k + r;
        int secs = (k+r)%60;                  //остаток секунд

        int addMins = (k+r)/60;
        int allMins = n+q + addMins;        //всего минут
        int mins = allMins%60;                //остаток минут

        int addHours = allMins/60;
        int hours = (m+p + addHours)%24;

        System.out.println("текущее время: " + hours + "ч " + mins + "мин " + secs + "с");
        }

        else System.out.println("неверное исходное значение времени");
    }
}
