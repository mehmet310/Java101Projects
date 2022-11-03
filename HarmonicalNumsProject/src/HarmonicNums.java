import java.util.*;
public class HarmonicNums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double harmNum;
        System.out.println("Harmonik sayılar için bir sınır değeri giriniz. ");
        harmNum=scan.nextDouble();
        double total=0.0;
        for (int i=1;i<=harmNum;i++)
        {
            total+=(1.0/i);
        }
        System.out.println("Harmonik toplam: "+total);
    }
}
