import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, total = 0;

        do {
            System.out.println("Sayi giriniz. ");
            sayi = inp.nextInt();

                if (sayi % 4 == 0) {
                    total =total+ sayi;
                } else if (sayi % 2 == 1) {
                    break;
                }


        } while (sayi % 2 == 0);
        System.out.println("Sayıların toplamı: " + total);

    }
}
