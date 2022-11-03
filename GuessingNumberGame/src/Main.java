import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int guess;
        int number;
        int count = 0;
        int right = 19;
        System.out.println("==========Sayı tahmin oyunumuza hosgeldiniz========");
        System.out.println();
        System.out.println("(0-100) arasında bir sayı giriniz. Sayıyı bilmeniz durumunda oyunu kazanacaksınız.\n" +
                "20 adet tahmin hakkınız vardır.\n" +
                "Oyuna devam edebilmek için lütfen (0-100) arasında sayı tahmini yapınız.");
        System.out.println();
        System.out.println("Aksi halde oyun sonlandırılacaktır!");
        System.out.println();
        System.out.println("Bol şans dileriz!");
        do {

            System.out.print("Sayı giriniz: ");
            number = (int) (Math.random() * 100);
            guess = s.nextInt();
            if (guess < 0 || guess > 100)// Tahmin sayısının (0-100) arasında kalması kontrol edilir.Eğer şartı sağlamazsa programdan çıkılır.
            {
                System.out.println("Lütfen (0-100) arasında sayı tahmini yapınız.");
                System.exit(0);
            }
            if (guess < number && guess > 0 && guess < 100 || guess > number && guess < 100 && guess > 0)
            //Tahmin sayısı ile rassal sayı (0-100) arasında kalmak koşulu ile aralarındaki farkı kaç sayı ile kaçırdığını kullanıcıya bildirmektedir.
            {

                System.out.println("Sayıyı " + Math.abs(guess - number) + " kadar farkla kaçırdınız.");

            }
            if (Math.abs(guess - number) <= 5)//Tahmin sayısı ile rassal sayı farkı beşten daha az ise
            //kullanıcıya çok yaklaştınız bilgisi veriliyor.
            {
                System.out.println("Çok yaklaştınız.");
            }

            if (guess == number) //Kullanıcı sayıyı bulduğunda ,tebrikler buldunuz mesajı verilir.
            {
                System.out.println("Tebrikler sayıyı " + count + "\'nci denemede buldunuz ve oyunu kazandınız!!! " + guess + " = " + number);

                break;
            } else {

                System.out.println("Bilemediniz, Sayımız: " + number + "\'dir, yeniden deneyiniz.");
            }
            count++;
            right--;
            System.out.println("Kalan hakkınız: " + right);

            if (right == 0) {
                System.out.println("Üzgünüz oyun bitmiştir,Yeniden deneyiniz.");
            }

        } while (right != 0);
    }
}
