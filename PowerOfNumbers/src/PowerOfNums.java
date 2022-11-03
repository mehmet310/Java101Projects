import java.util.Scanner;
public class PowerOfNums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sınır sayısı giriniz.");
        int num;
        num = scan.nextInt();
        System.out.println("4'lü katlar: ");
        for(int i=1;i<=num;i*=4) {

                System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        System.out.println("5'li katlar: ");
        for(int i=1;i<=num;i*=5) {

            System.out.println(i);
        }
    }
}
