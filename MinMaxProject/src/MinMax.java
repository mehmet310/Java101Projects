import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //Kullanıcıdan n adet sayı alınır ve o kadar sayı girmesi istenir.
        //aralarındaki en büyük ve en küçük sayı belirlenir ve kullanıcıya bildirilir.
        //Metot denemesi yapılarak çözümleme yapılmıştır.
        sorting();
    }

    public static void sorting() {
        int num, n,bigNum=0,smallNum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println(i+".sayıyı giriniz.");
            num=s.nextInt();

            if(i==1)
            {
                bigNum=num;
                smallNum=num;

            }
            else
            {
                if(num>bigNum)
                {
                    bigNum=num;
                }
                else if(num<smallNum)
                {
                    smallNum=num;
                }
            }
            }
        System.out.println("Büyük sayı: "+bigNum);
        System.out.println("Küçük sayı: "+smallNum);
        }



}
