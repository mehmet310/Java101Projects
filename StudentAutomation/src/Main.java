public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Tarık","001","123");
        Teacher t2 = new Teacher("Kerem","002","976");
        Teacher t3 = new Teacher("Eray","003","813");

        Course c1 = new Course("Tarih","001","20",80);
        Course c2 = new Course("Matematik","002","30",70);
        Course c3 = new Course("Kimya","003","60",40);

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("Ali","1234","class1",c1,c2,c3);
        s1.addBulkExamNote(20,90,80,30,60,45);
    }
}
