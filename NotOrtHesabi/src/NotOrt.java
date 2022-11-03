import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int muz, mat, fiz, kim, tar;
        double total = 0.0, avg;
        int count = 0;
        System.out.println("Müzik dersinin puanını giriniz. ");
        muz = scan.nextInt();
        System.out.println("Mat dersinin puanını giriniz. ");
        mat = scan.nextInt();
        System.out.println("Fizik dersinin puanını giriniz. ");
        fiz = scan.nextInt();
        System.out.println("Kimya dersinin puanını giriniz. ");
        kim = scan.nextInt();
        System.out.println("Tarih dersinin puanını giriniz. ");
        tar = scan.nextInt();

        if (!(muz <= 0 || muz > 100)) {

            total = total + muz;
            count++;
        }

        if (!(mat <= 0 || mat > 100)) {

            total = total + mat;
            count++;
        }
            if (!(fiz <= 0 || fiz > 100)) {

                total = total + fiz;
                count++;

            }
            if (!(kim <= 0 || kim > 100)) {

                total = total + kim;
                count++;

            }
            if (!(tar <= 0 || tar > 100)) {

                total = total + tar;
                count++;

            }


            avg = total / count;

            System.out.println("Toplam puanınız: " + total);
            System.out.println("Not ortalamanız: " + avg);
            if (avg > 55) {
                System.out.println("Dersi geçtiniz.");
            } else {
                System.out.println("Bu dönem kaldınız. ");
            }
        }

    }