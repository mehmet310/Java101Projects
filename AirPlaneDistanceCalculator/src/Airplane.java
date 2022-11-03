import java.util.Scanner;

public class Airplane {
    public static void main(String[] args) {
        /*
        * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) şeklinde ayarlıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilir.
          Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
          Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
          Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
          Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
        Scanner scan = new Scanner(System.in);
        int select, age, distance;
        double perDist = 0.10; // Gittiği mesafe başına 0,10 tl belirlenmiştir.
        double ageDiscount, normalPrice, discountedPrice, roundTrip, totalPrice;

        System.out.println("Mesafeyi km cinsinden giriniz: ");
        distance = scan.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        age = scan.nextInt();
        System.out.println("Yolculuk tipini giriniz: (1=>Tek yönlü gidiş , 2=>Gidiş-Dönüş bileti): ");
        select = scan.nextInt();
        if (select == 1 || select == 2 && distance > 0 && age > 0) //Kullanıcının yanlış veri girmesi engellenir.
        {
            if (select == 1) {
                if (age < 12)//Kullanıcı 12 yaşından küçükse %50 indirim yapılır
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.50;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age < 24 && age > 12)//Kullanıcı 12 yaş veya 24 aralığındaysa %10 indirim yapılır
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.10;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age > 65)//Kullanıcı 65 yaşından büyükse %30 indirim yapılır
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.30;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if(age>24 &&age<65) //Bu aralıkta bir indirim yoktur!
                {
                    totalPrice = distance * perDist;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                }
                else {
                    System.out.println("Hatalı Veri girdiniz! ");
                }


            }
            if (select == 2) //Gidiş Dönüş durumu
            {
                if (age < 12) //Kullanıcı gidiş-dönüş aldıysa %20 indirim daha alır.
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.50;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age < 24 && age > 12)
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.10;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age > 65)
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.30;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                }else if(age>24 &&age<65) //Bu aralıkta bir indirim yoktur!
                {
                    totalPrice = distance * perDist*2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                }
                else {
                    System.out.println("Hatalı Veri girdiniz! ");
                }
            }
        } else {
            System.out.println("Hatalı Veri girdiniz! ");
        }


    }
}
