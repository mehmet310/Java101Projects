import java.util.*;
public class Main {
    public static void main(String[] args) {
        Course math=new Course("Matematik",101,"mat");
        Course phys=new Course("Fizik",101,"fiz");
        Course chem=new Course("Kimya",101,"kim");


        Teacher t1 = new Teacher("Kerem K.", "112233", "mat");
        Teacher t2 = new Teacher("Ahmet A.", "496783", "fizik");
        Teacher t3 = new Teacher("Mehmet M.", "578265", "kim");
        Teacher t4 = new Teacher("Serra S.", "106567", "fiz");

        math.addTeacher(t1);

        phys.addTeacher(t2);

        chem.addTeacher(t3);

        phys.addTeacher(t4);


        //Bu uygulamada kullanıcıdan gerekli bilgiler alınarak öğrencinin geçip geçmediği kontrol edilir.
        Scanner scan2=new Scanner(System.in);
        System.out.println("Öğrencinin adını giriniz.");
        String stuName=scan2.nextLine();
        System.out.println("Bu öğrencinin sınıfını giriniz.");
        String classes=scan2.nextLine();
        System.out.println("Bu öğrencinin ,öğrenci numarasını giriniz.");
        int id =scan2.nextInt();
        System.out.println("Sırasıyla öğrencinin matematik,fizik ve kimyadaki sınav notlarını giriniz.");
        int mat,fiz,kim;
        mat=scan2.nextInt();
        fiz=scan2.nextInt();
        kim=scan2.nextInt();
        System.out.println("Sırasıyla öğrencinin matematik,fizik ve kimyadaki sözlü notlarını giriniz.");
        int sozMat,sozFiz,sozKim;
        sozMat=scan2.nextInt();
        sozFiz=scan2.nextInt();
        sozKim=scan2.nextInt();

        Student student = new Student(stuName, classes, id, math, phys,chem);
        student.addExamBulkExamNote(mat, fiz, kim, sozMat, sozFiz, sozKim);
        student.isPass();


    }
}
