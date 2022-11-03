import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {
        //For döngüsü kullanılarak üslü sayıyı hesaplayan programdır.
        Scanner scan=new Scanner(System.in);
        System.out.println("Üs alınacak sayıyı giriniz. ");
        int num1=scan.nextInt();
        System.out.println("Üssü giriniz. ");
        int num2=scan.nextInt();
        int total=1;
        for(int i=1;i<=num2;i++)
        {

            total*=num1;

        }
        System.out.println("Sayının üslü hali: "+total);

    }
}
