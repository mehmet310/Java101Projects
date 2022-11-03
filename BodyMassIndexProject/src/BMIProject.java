import java.util.Scanner;
public class BMIProject {
    public static void main(String[] args) {

        //Kullanıcıdan boy ve kilo değerleri alınır.
        Scanner scan = new Scanner(System.in);
        double kilo, boy;
        System.out.println("Lütfen boy değerinizi (metre cinsinden) giriniz: ");
        boy=scan.nextDouble();
        System.out.println("Lütfen kilo değerinizi giriniz: ");
        kilo=scan.nextDouble();
        double bmi=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+bmi);

        //Extra: Vücut kitle indeksine göre zayıf,normal,obez olduğu araştırılır.

        if(bmi>=0 && bmi<18.5)
        {
            System.out.println("Vücut kitle indeksine göre zayıfsınız.");
        }
        else if(bmi>=18.5 && bmi<25 )
        {
            System.out.println("Vücut kitle indeksine göre normalsiniz.");
        }
        else if(bmi>=25 && bmi<30 )
        {
            System.out.println("Vücut kitle indeksine göre kilolusunuz. ");
        }
        else
        {
            System.out.println("Vücut kitle indeksine göre obezsiniz. ");
        }

    }

}
