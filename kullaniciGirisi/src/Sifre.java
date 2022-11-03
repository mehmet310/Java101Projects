import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre, kullaniciAdi, sifre1 = "java546";
        System.out.println("Kullanıcı adınız: ");
        kullaniciAdi = scan.nextLine();
        System.out.println("Şifreniz: ");
        sifre = scan.nextLine();
        int selection;
        if (sifre.equals(sifre1)) {
            System.out.println("Giriş Yaptınız.");
        }
        else {
            System.out.println("Şifreniz yanlış.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? İstiyorsanız 1 tuşuna basınız ve yeni şifre alınız.");
            selection=scan.nextInt();
            Scanner scan2 = new Scanner(System.in);
            switch(selection)
            {
                case 1:
                    System.out.println("Yeni şifrenizi giriniz.");
                    String sifre2=scan2.nextLine();
                    if (!sifre.equals(sifre2)&&sifre2.length()<=11) //şifrenin 11 karaktere kadar girilmesine izin verilmesi amaçlanır.
                    {
                        System.out.println("Kullanıcı adı: "+kullaniciAdi);
                        System.out.println("Şifreniz başarı ile değiştirilmiştir!");

                    }
                    else
                    {
                        System.out.println("Tekrar deneyiniz.");
                    }
                    break;

                case 2,3,4,5,6,7,8,9,0: // 1 dışında sayı girilirse burası okunur.
                    System.out.println("Tekrar deneyiniz.");
                    break;


            }


        }
    }}





