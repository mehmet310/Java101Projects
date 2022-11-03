import java.util.*;
public class Combination {
    public static void main(String[] args) {

        //Bu programda kombinasyon değeri hesaplanacaktır.
        // O da C(n,r)=n!/(r!*(n-r)!) formulü ile hesaplanır.
        //Not: Bir kombinasyonda r değeri 0 ise kombinasyon daima 1'e eşit olur!

        Scanner scan=new Scanner(System.in);
        System.out.println("Kombinasyon için ilk sayı ('n') giriniz.");//Kombinasyon için birinci değer girilir.
        int n=scan.nextInt();
        int total_1=1,total_2=1;
        for(int i=1;i<=n;i++)
        {
            total_1*=i;
        }
        System.out.println("Kombinasyon için ikinci sayı ('r') giriniz."); //Kombinasyon için ikinci değer girilir.
        int r=scan.nextInt();
        for(int j=1;j<=r;j++)
        {
            total_2*=j;
        }
        int total_3=1; //Kombinasyonun (n-r)'li ifadesi tanımlanır.
        for(int k=1;k<=(n-r);k++)
        {
            total_3*=k;
        }
        int combination=(total_1)/(total_2*total_3); //Kombinasyon hesaplanır.
        System.out.println("Kombinasyon değeri: C(n,r)= "+ combination);

        //Ek olarak permütasyon hesabı da gösterilecektir.
        //O da P(n,r)=n!/((n-r)!) formulü ile hesaplanır.

        int permutation=(total_1)/(total_3); //Permütasyon hesaplanır.
        System.out.println("Permütasyon değeri: P(n,r)= "+ permutation);
    }
}
