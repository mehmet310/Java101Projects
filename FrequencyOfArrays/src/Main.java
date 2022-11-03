import java.util.Scanner;

public class Main {
    //Kullanıcıdan önce dizinin boyutu ve dizi değerleri alınır.
    //Sonrasında girdiği değerlerin kaç kere tekrar ettiği bulunur.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz.");
        int boyut = s.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("Dizi elemanlarını giriniz.");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = s.nextInt();
        }
        System.out.print("Dizi elemanları:\t[");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(" " + dizi[i]);
        }
        System.out.print("]\n");
        System.out.println("Tekrar eden sayılar: ");
        int[] counter = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            counter[i] = 1;
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j] && (i != j)) {
                    counter[i]++;
                }

            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j] && (i != j)) {
                    dizi[j] = 0;
                }

            }
        }
        for (int i = 0; i < dizi.length; i++) {
            if (counter[i] >= 1) {
                if (dizi[i] != 0) {
                    System.out.println(dizi[i] + " sayısı " + counter[i] + " kere tekrar edildi.");
                }
            }
        }

    }
}
