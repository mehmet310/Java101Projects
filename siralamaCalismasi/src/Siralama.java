import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        // Kullanıcıdan üç sayı alıp küçükten büyüğe doğru sıralama yapan programdır.

        Scanner scan=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Birinci sayiyi giriniz. ");
        num1=scan.nextInt();
        System.out.println("İkinci sayiyi giriniz. ");
        num2=scan.nextInt();
        System.out.println("Üçüncü sayiyi giriniz. ");
        num3=scan.nextInt();
        minToMax(num1,num2,num3);

    }

    public static void minToMax(int num1,int num2,int num3)
    {
        //Bu pratikte metot denemesi yapılarak çözümleme amaçlanmıştır.
        if(num1>num2 &&num1>num3)
        {
            System.out.println("en büyük sayı: "+num1+ "\'dir");
            if(num2>num3)
            {
                System.out.println("Küçükten büyüğe sayılar: "+num3+"<"+num2+"<"+num1+"\'dir.");
            }
            else
            {
                System.out.println("Küçükten büyüğe sayılar: "+num2+"<"+num3+"<"+num1+"\'dir.");
            }
        }
        else if(num3>num2 && num3>num1)
        {
            System.out.println("en büyük sayı: "+num3+ "\'dir");
            if(num1>num2)
            {
                System.out.println("Küçükten büyüğe sayılar: "+num2+"<"+num1+"<"+num3+"\'dir.");
            }
            else
            {
                System.out.println("Küçükten büyüğe sayılar: "+num1+"<"+num2+"<"+num3+"\'dir.");
            }
        }
        else
        {
            System.out.println("en büyük sayı: "+num2+ "\'dir");
            if(num1>num3)
            {
                System.out.println("Küçükten büyüğe sayılar: "+num3+"<"+num1+"<"+num2+"\'dir.");
            }
            else
            {
                System.out.println("Küçükten büyüğe sayılar: "+num1+"<"+num3+"<"+num2+"\'dir.");
            }
        }
    }
}
