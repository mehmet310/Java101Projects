import java.util.Scanner;

public class EBOBveEKOK {
    public static void main(String[] args) {
        //Bu projede En Büyük Ortak Bölen(EBOB) ve En Küçük Ortak Katlar(EKOK) hesabı yapılır.
        Scanner s = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        int num1 = s.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int num2 = s.nextInt();
        int count = 1;
        int ebob = 1;
        while (count <= num1) //EBOB hesabı yapılır.
        {
            if (num1 % count == 0 && num2 % count == 0) {
                ebob = count;
            }
            count++;

        }
        System.out.println("Sayıların EBOB'u: " + ebob);
        count = 1;
        while (count <= (num1 * num2)) //EKOK hesabı yapılır.
        {
            if (count % num1 == 0 && count % num2 == 0) {
                System.out.println("Sayıların EKOK'u: " + count);
                break;
            }
            count++;
        }


    }
}
