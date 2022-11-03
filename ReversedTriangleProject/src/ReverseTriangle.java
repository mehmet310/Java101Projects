import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {// Ters üçgen çalışması yapılır.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int n=scan.nextInt();
        for (int i=n;i>=0;i--)
        {

            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=(2*i-1);k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
