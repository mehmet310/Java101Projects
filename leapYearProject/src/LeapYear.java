import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Artık yıl hesaplayan bir programdır.
        int year;
        System.out.println("Yıl giriniz.");
        year=scan.nextInt();
        if(year%4==0&&year!=100||year%400==0)
        {
            System.out.println("Girdiğiniz yıl artık yıldır.");
        }
        else
        {
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }
    }
}
