import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("İlk sayıyı giriniz: ");
        a = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        b = scan.nextInt();
        int deger;
        // Kullanıcıdan işlemler ile ilgili değer istenerek hesap yapılır.
        System.out.println("Yapılacak işlemi giriniz  :");
        System.out.println("1: Toplama işlemini ifade eder.  :");
        System.out.println("2: Çıkarma işlemini ifade eder.  :");
        System.out.println("3: Çarpma işlemini ifade eder.  :");
        System.out.println("4: Bölme işlemini ifade eder.  :  :");
        deger = scan.nextInt();
        switch (deger) {

            case 1:
                System.out.println("Toplama işleminin sonucu: " + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu: " + (a - b));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu: " + (a * b));
                break;
            case 4:
                System.out.println("Bölme işleminin sonucu: " + (a / b));
                break;
            default:
                System.out.println("Hatalı işlem seçtiniz, lütfen (1-4) arası işlemi seçiniz! ");
                break;

        }

    }
}
