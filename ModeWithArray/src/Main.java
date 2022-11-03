import java.util.Scanner;
public class Main {

//Tekrar eden çift ve tek sayıları bulan program...
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz.");
        int boyut=s.nextInt();
        System.out.println("Dizinin elemanlarını giriniz.");
        int[] list=new int[boyut];
        for(int i=0;i<list.length;i++) {
            list[i] = s.nextInt();
        }
        int sayacCift=1;
        System.out.println("Tekrar eden çift sayılar: ");
        for(int i=0;i<list.length;i++)
        {
            for(int j=i+1;j<list.length;j++)
            {
                if(list[i]==list[j])
                {
                    if(list[j]%2==0)
                    {
                        System.out.println((sayacCift++)+". tekrar eden sayı "+list[j]);

                    }
                }
            }

        }
        int sayacTek=1;
        System.out.println("Tekrar eden tek sayılar: ");
        for(int i=0;i<list.length;i++)
        {
            for(int j=i+1;j<list.length;j++)
            {
                if(list[i]==list[j])
                {
                    if(list[j]%2==1)
                    {
                        System.out.println((sayacTek++)+". tekrar eden sayı "+list[j]);

                    }
                }
            }


    }
}}
