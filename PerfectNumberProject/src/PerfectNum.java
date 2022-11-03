import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Sayıyı giriniz.");
        int num=scn.nextInt();
        int total=0;
        int i=1;
        //Mükemmel sayıyı bulmayı amaçlayan bir programdır.
        //Mükemmel sayı, kendisi hariç tam bölünebildiği pozitif tam sayıların toplamı
        //yine kendisine eşitse o sayı mükemmel sayıdır. Örneğin: 28 mükemmel sayıdır.
        //28'in bölenleri:1,2,4,7,14,28(28 hariç) 1+2+4+7+14=28'dir.
        while(i<num)
        {
            if(num%i==0)
            {
                total+=i;

            }
           i++;
        }
        if(total==num)
        {
            System.out.println(total+" Mükemmel sayıdır.");
        }
        else
        {
            System.out.println(num +" Mükemmel sayı değildir.");
        }
    }
}
