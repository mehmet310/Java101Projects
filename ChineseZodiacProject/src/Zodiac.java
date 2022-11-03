import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Çin zodyağı, bilinen takvimlerden farklı olup yılın 12 ayına bölünmesinden kalan sayıya göre
        // hayvan isimleri ile anılan bir burç sistemidir.
        //Kalan sayılara göre hayvan eşleştirilmesi aşağıdaki programda verilmektedir.

        int year;
        System.out.println("Doğum tarihinizi sadece (yıl) olarak giriniz.");
        year=scan.nextInt();
        String zodyak=" ";
        if(year%12==0)
        {
            zodyak="Maymun";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==1)
        {
            zodyak="Horoz";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==2)
        {
            zodyak="Köpek";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==3)
        {
            zodyak="Domuz";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==4)
        {
            zodyak="Fare";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==5)
        {
            zodyak="Öküz";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==6)
        {
            zodyak="Kaplan";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==7)
        {
            zodyak="Tavşan";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==8)
        {
            zodyak="Ejderha";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==9)
        {
            zodyak="Yılan";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==10)
        {
            zodyak="At";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }
        else if(year%12==11)
        {
            zodyak="Koyun";
            System.out.println("Çin zodyağı burcunuz: "+zodyak);
        }





    }
}
