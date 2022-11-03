import java.util.*;

public class Loop1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double sayi; //Kullanıcıdan sayı alınır ve döngüde o sayıya kadar döndürülür.
        System.out.println("Bir sayi giriniz.");
        sayi = inp.nextDouble();
        double count = 0;
        double avg;
        int i, total = 0;
        System.out.print("Üç ve Dörde kalansız bölünen sayılar: ");
        for (i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                System.out.print("\t" + i);
                count++;
            }
        }
        System.out.println();
        if (count == 0) {
            System.out.println("Bölen kısım sıfır olamaz! Ancak sayının sanal(imaginary) kökü vardır.");
        }

        avg = total / count;
        System.out.println("Bu sayıların toplamı: " + total);
        System.out.println("Bu sayıların ortalaması: " + avg);

        /*  Extra: Çift sayıları while döngüsü kullanarak bulmak.
        int evenNums;
        System.out.println("Bir sayı giriniz.");
        evenNums=inp.nextInt();
        //int count_2=0;
        int i=0;
        System.out.print("Çift sayılar: ");
        while(i<=evenNums)
        {
            if(i%2==0) {

                System.out.println("\t" + i);
            }
            i++;

        }*/


    }
}
