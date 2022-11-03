public class Student {
    //global variables
    Course mat;
    Course fiz;
    Course kim;
    String studentName;
    int studentNumber;
    String classes;
    double average;
    boolean isPass;
    double averageMat;
    double averageFiz;
    double averageKim;

    //Constructor
    Student(String studentName, String classes,int studentNumber, Course mat, Course fiz, Course kim) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.average = average;
        this.isPass = false;
        this.mat = mat;
        this.fiz = fiz;
        this.kim = kim;
        calculateAverage();

    }

    //methods
    protected void addExamBulkExamNote(double mat, double fiz, double kim, double sozluMat, double sozluFiz, double sozluKim) {
        if (mat > 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.sozNote = sozluMat;
        }
        if (fiz > 0 && fiz <= 100) {
            this.fiz.note = fiz;
            this.fiz.sozNote = sozluFiz;
        }
        if (kim > 0 && kim <= 100) {
            this.kim.note = kim;
            this.kim.sozNote = sozluKim;
        }
    }

    protected void isPass() {
        if (this.mat.note == 0 || this.fiz.note == 0 || this.kim.note == 0) {
            System.out.println("Notlar girilmemiştir.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass) {
                System.out.println("Dersleri geçmiştir.");
            } else {
                System.out.println("Derslerden kalmıştır.");
            }

        }
    }


    protected void calculateAverage() //Her dersin ortalaması alınıp toplam ortalama bulunur.
    // Sözlü notu ve sınav notu Her derste değişkenlik göstermektedir.
    {
        this.averageMat = (this.mat.note * 0.80) + (this.mat.sozNote * 0.20);
        this.averageFiz = (this.fiz.note * 0.70) + (this.fiz.sozNote * 0.30);
        this.averageKim = (this.kim.note * 0.60) + (this.kim.sozNote * 0.40);
        //Toplam ortalama ise matematiğin %40'ı fizik ve kimyanın da %30'u şeklinde hesaplanır.
        this.average=averageMat*0.40+averageFiz*0.30+averageKim*0.30 ;


    }

    public boolean isCheckPass()//Toplam ortalama 60'dan yüksekse dönemi geçmektedir.
    {
        calculateAverage();
        if (this.average > 60)
        {
            return !isPass;
        }
        else {
            return this.isPass;
        }

    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrencinin adı : " + this.studentName);
        System.out.println("Matematik Notu : " + this.averageMat);
        System.out.println("Fizik Notu : " + this.averageFiz);
        System.out.println("Kimya Notu : " + this.averageKim);
    }


}
