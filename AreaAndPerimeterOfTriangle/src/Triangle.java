import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double area, perimeter, u;
        int a, b, c;
        System.out.println("Üçgenin kenarlarını giriniz.");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        u=(a+b+c)/2;

        //Çevre ve Alan hesabı için u değeri hesaplandı.

        perimeter=2*u;
        area=u*(u-a)*(u-b)*(u-c);
        System.out.println("U değeri: "+u);
        System.out.println("Üçgenin çevresi: "+perimeter);
        System.out.println("Üçgenin alanı: "+area);
    }
}
