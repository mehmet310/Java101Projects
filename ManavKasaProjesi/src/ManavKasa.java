import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //Kullanıcıdan meyve adetleri istenir ve toplam tutar hesaplanır.

        double elma,armut,patlican,domates,muz,toplamTutar ;
        System.out.println("Armut kaç kilo aldınız? ");
        armut=scan.nextDouble();
        System.out.println("Elma kaç kilo aldınız? ");
        elma=scan.nextDouble();
        System.out.println("Domates kaç kilo aldınız? ");
        domates=scan.nextDouble();
        System.out.println("Muz kaç kilo aldınız? ");
        muz=scan.nextDouble();
        System.out.println("Patlican kaç kilo aldınız? ");
        patlican=scan.nextDouble();
        toplamTutar=armut*2.14+elma*3.67+muz*0.95+domates*1.11+patlican*5.0 ;

        System.out.println("Toplam ödeyeceğiniz fiyat: "+toplamTutar+"\'dir.");
    }
}
