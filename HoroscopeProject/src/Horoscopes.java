import java.util.*;

public class Horoscopes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Kullanıcıdan doğduğu günün tarihi alınarak burcu belirlenir.
        /*
        Koç Burcu : 21 Mart - 20 Nisan

        Boğa Burcu : 21 Nisan - 21 Mayıs

        İkizler Burcu : 22 Mayıs - 22 Haziran

        Yengeç Burcu : 23 Haziran - 22 Temmuz

        Aslan Burcu : 23 Temmuz - 22 Ağustos

        Başak Burcu : 23 Ağustos - 22 Eylül

        Terazi Burcu : 23 Eylül - 22 Ekim

        Akrep Burcu : 23 Ekim - 21 Kasım

        Yay Burcu : 22 Kasım - 21 Aralık

        Oğlak Burcu : 22 Aralık - 21 Ocak

        Kova Burcu : 22 Ocak - 19 Şubat

        Balık Burcu : 20 Şubat - 20 Mart */

        System.out.println("Doğduğunuz günü giriniz.");
        int gun=scan.nextInt();
        int ay; // Bazı günlerin aynı olmasından dolayı ayırt edilmesi için ay da kullanıcıdan istenir.
        System.out.println("Doğduğunuz ayı giriniz.");
        ay=scan.nextInt();

        if(ay==1)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<=22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Oğlaktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Kovadır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==2)
        {
            if(gun>=1&&gun<=28)
            {
                if(gun<20)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Kovadır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Balıktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==3)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<=20)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Balıktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Koçtur.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==4)
        {
            if(gun>=1&&gun<=30)
            {
                if(gun<21)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Koçtur. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Boğadır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==5)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Boğadır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz İkizlerdir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==6)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz İkizlerdir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yengeçtir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==7)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yengeçtır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Aslandır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==8)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Aslandır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Başaktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==9)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Başaktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Terazidir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==10)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Terazidir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Akreptir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==11)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Akreptir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yaydır.");
                }
            }
            else
            {

                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==12)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yaydır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Oğlaktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }

    }
}
