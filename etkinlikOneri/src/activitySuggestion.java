import java.util.Scanner;
public class activitySuggestion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int degree;
        //Kullanıcıdan sıcaklık değeri alınır.
        System.out.println("Sıcaklık değerini giriniz. ");
        degree=scan.nextInt();
        // Etkinlik önerilir.
        if(degree<5)
        {
            System.out.println("Kayağa gidebilirsiniz.");
        }
        else if(degree>5 && degree<15)
        {
            System.out.println("Sinema uygun olabilir.");
        }
        else if(degree>15 && degree<25)
        {
            System.out.println("Piknik güzel bir fikir olabilir.");
        }
        else
        {
            System.out.println("Yüzmeye gitmek uygun olabilir.");
        }

    }
}
