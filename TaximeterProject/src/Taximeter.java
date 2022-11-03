import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        float km,minTutar=20f,toplamTutar;
        int taksimetreAcilis=10; //10 tl taksimetre açılış ücretidir.
        System.out.println("Gidilecek kilometreyi giriniz.");
        km=inp.nextFloat();
        float kmOran=2.2f; //km başına tutan tutar
        toplamTutar=taksimetreAcilis+(kmOran*km);

        //if-else olmadan km'ye göre koşul sorgusu yapılarak ödenecek tutar belirlenir.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.

        float tutar=(toplamTutar<minTutar)? minTutar :toplamTutar ;
        System.out.println("Ödeyeceğiniz toplam tutar: " + tutar+"\'dir. ");

    }
}
