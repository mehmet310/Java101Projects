import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Fibonacci Serisini yapan programdır.
        //Bu seri kendisinden önceki sayı ile toplanarak bir sonraki sayıyı elde etme ile oluşan seridir.
        //Örneğin 0 1 1 2 3 5 8 13 ... diye gider ve altın orana yaklaşır.
        fibonacci();

    }

    public static int fibonacci() {

        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayı giriniz. ");
        int num = s.nextInt();
        int num1 = 0, num2 = 1, total;
        total = num1 + num2;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i <= num; i++) {
            System.out.print(total + " ");
            num1 = num2;
            num2 = total;
            total = num1 + num2;


        }
        return total;
    }
}
