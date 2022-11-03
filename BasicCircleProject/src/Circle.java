import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double area,perimeter,alpha,area_2;
        System.out.println("Dairenin yarıçapını giriniz."); // Kullanıcıdan yarıçap alınır.
        int radius=scan.nextInt();
        //Daire alanı ve çevresi hesaplanır.
        area=Math.PI*Math.pow(radius,2);
        perimeter=2*Math.PI*radius;
        //Dairenin açısı kullanılarak daire diliminin alan hesaplanır bu yüzden kullanıcıdan açı değeri istenir.
        System.out.println("Daire açısını giriniz.");
        alpha=scan.nextDouble();
        area_2=(Math.PI*radius*radius*alpha)/360;
        System.out.println("Dairenin yarıçapı: "+radius);
        System.out.println("Dairenin merkez açısı: "+alpha);
        System.out.println("Dairenin alanı: "+area);
        System.out.println("Dairenin çevresi: "+perimeter);
        System.out.println("Dairenin diliminin alanı: "+area_2);

    }
}
