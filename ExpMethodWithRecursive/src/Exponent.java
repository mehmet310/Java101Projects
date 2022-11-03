import java.util.Scanner;
public class Exponent {
    public static int ExpRec(int base,int exp) // Recursive metot kullanılarak üs aldırma işlemi yapıldı.
    {

        if(exp==0||base==1)
            return 1;
        else
        {

             return ExpRec(base,exp-1)*base;
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Tabanı giriniz: ");
        int base=s.nextInt();
        System.out.println("Üssü giriniz: ");
        int exp=s.nextInt();
        System.out.println("İşlem sonucu: "+ExpRec(base,exp));
    }
}
