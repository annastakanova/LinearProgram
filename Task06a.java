//double quantity = m * (80/n + 12);

public class Task06a {
    public static void main(String[] args) {
        int n = 40, m = 1;
        double smallVolume = 80/n;
        double bigVolume = smallVolume + 12;
        double quantity = m * bigVolume;
        System.out.println("количество литров в m больших бидонов = " + quantity);
    }
}