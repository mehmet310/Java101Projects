public class Employee {
    //Bu sınıf işçi sınıfı olup maaşlarına çalıştıkları yıla göre zam yapacaktır.
    //Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    //Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    //OOP yöntemi ile yapılacaktır.

    //Nitelikler(global variables)

    String name;
    double salary;
    double workHours;
    double hireYear;

    //Constructor
    Employee(String name, double salary, double workHours, double hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Methods

    protected double Tax() //Vergi hesaplayan metod
    {
        double taxRate = 0.03; //%3 vergi uygulanır.
        double tax;
        if (this.salary > 1000.00) {

            tax=this.salary*taxRate;
            return tax;
        } else {

            return 0.0;
        }

    }

    public double bonus() //Fazla mesaide alınacak ekstra ücreti hesaplar.
    {

        if (this.workHours > 40.0) {
            return (this.workHours - 40.0)*30.0;//Ek mesaide kaldığı süre kadar 30 tl fazla ücret alacaktır.
        } else {
            return 0.0;
        }

    }

    public double raiseSalary() //Maaşına yapılacak zam çalıştığı yıla göre belirlenir.
    {

        double newSalary;

        if ((2022 - hireYear) < 10) {
            newSalary = (salary * 0.05); //10 yıldan az ise %5 zam eklenir.
            return newSalary ;
        }if ((2022 - hireYear) > 9.0 && (2022 - hireYear) < 20) {
            newSalary = (salary * 0.10); //20 yıldan az ve 9 yıldan fazla ise %10 zam eklenir.
            return newSalary ;
        }if ((2022- hireYear) > 19) {
            newSalary = (salary *0.15); //19 yıldan fazla ise %15 zam eklenir.
            return newSalary ;
        } else {

            return 0.0;
        }

    }

    public String toString() //Kullanıcıya ait bilgiler toString override edilir.
    {

        return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours
                + "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi: " + Tax() + "\nBonus: " + bonus()
                + " \nMaaş Artışı: " + raiseSalary() + "\nVergi ve Bonuslarla beraber maaş: "
                + (this.salary + bonus() -Tax() + "\nToplam Maaş: " + (this.salary + raiseSalary()));
    }
}
