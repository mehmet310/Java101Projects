import java.util.Scanner;
public class Basamak {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir sayının basamak sayısını
        // ve o değerlerin toplamını gösteren programdır.

        Scanner inp=new Scanner(System.in);
        int sayi,sayac=0,toplam=0;
        System.out.println("Sayiyi giriniz.");
        sayi=inp.nextInt();
        System.out.println("Girilen sayı: "+sayi);
        while(sayi!=0)
        {
            toplam+=(sayi%10);
            sayi/=10;
            sayac++;
        }

        System.out.println("Basamak adedi: "+sayac);
        System.out.println("Rakamları toplamı: "+toplam);

    }
}
