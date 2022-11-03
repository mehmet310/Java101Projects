import java.util.Scanner;
public class PrimeNums //Recursive metot ile asal sayıların bulunması hedeflenir.
{
    public static boolean PrimeNumbers(int prime,int index)
    {

      if(prime%index==0)
      {
          System.out.println("Asal değildir.");
          return false;
      }
      else if(index*index>prime)
      {
          System.out.println("Asaldır. "+ prime);
          return true;
      }
      if(prime<1)
          return false;

    return PrimeNumbers(prime,index+1);
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n=s.nextInt();
        PrimeNumbers(n,2);
    }
}
