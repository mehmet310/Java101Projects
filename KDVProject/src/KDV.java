import java.util.Scanner;

    public class KDV{
        public static void main(String[] args) {

            Scanner inp=new Scanner(System.in);
            double fiyat;
            double kdv_1=0.18,kdv_2=0.08; //KDV oranlari tanitildi.

            //Kullanıcıdan fiyat alınır.

            System.out.println("Fiyatı giriniz.");
            fiyat=inp.nextDouble();
            /*Fiyat tutarına göre kdv hesaplanır.
             * 0-1000 arası ise 18% kdv,
             * 1000'den büyükse 8% kdv oranı uygulanacak.
             * Eğer bu aralıkta değilse geçersiz fiyat uyarısı verilir.
             */
            if (fiyat>0 && fiyat<=1000)
            {
                fiyat+=fiyat*kdv_1;
                System.out.println("KDV\'li fiyat tutarınız: "+ fiyat );

            }
            else if (fiyat>1000)
            {
                fiyat+=fiyat*kdv_2;
                System.out.println("KDV\'li fiyat tutarınız: "+ fiyat );
            }
            else
            {
                System.out.println("Geçersiz fiyat girdiniz!");
            }

        }
    }


