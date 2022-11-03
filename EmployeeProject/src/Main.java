import java.util.Scanner;
public class Main {
    public static void main(String[] args) //Ana metotta ise Employee sınıfından nesne oluşturulur
            //ve kullanıcıdan gerekli bilgiler de alınarak ekrana yazdırılır.
    {
        Scanner s=new Scanner(System.in);
        String name;
        double salary;
        double workHours;
        double hireYear;

        System.out.println("Çalışanın adını giriniz. ");
        name=s.nextLine();
        System.out.println("Çalışanın maaşını giriniz. ");
        salary=s.nextDouble();
        System.out.println("Çalışanın haftalık çalışma saatini giriniz. ");
        workHours=s.nextDouble();
        System.out.println("Çalışanın işe alındığı yılı giriniz. ");
        hireYear=s.nextDouble();
        Employee employee=new Employee(name,salary,workHours,hireYear);

        String val=employee.toString();
        System.out.println("==========================");
        System.out.print(val);

    }
}
