public class Student {

    Course mat;
    Course fiz;
    Course kim;
    String stuName;
    String stuNo;
    String classes;
    double average;
    boolean isPassed;

    Student(String stuName,String stuNo,String classes,Course mat,Course fiz,Course kim){
        this.stuName=stuName;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.fiz=fiz;
        this.kim=kim;
        this.average=0.0;
        this.isPassed=false;

    }
    protected void addBulkExamNote(int mat,int fiz,int kim,int sozMat,int sozFiz,int sozKim)
    {
        if (mat>=0&&mat<=100)
        {
            this.mat.note_1=mat;
            this.mat.note_2=sozMat;
        }
        if (fiz>=0&&fiz<=100)
        {
            this.fiz.note_1=fiz;
            this.fiz.note_2=sozFiz;
        }
        if (kim>=0&&kim<=100)
        {
            this.kim.note_1=kim;
            this.kim.note_2=sozKim;
        }
        calcAverage();
    }
    public void isPass()
    {
        if(this.average>55)
        {
            System.out.println("Bu dönemi geçtiniz.");
            this.isPassed=true;
        }
        else if(mat.note_1==0||fiz.note_1==0||kim.note_1==0) {
            System.out.println("Notlarınız henüz girilmemiştir.");

        }
        else{
            System.out.println("Bu dönem kaldınız,dersleri tekrar etmeniz gerekmektedir! ");
            this.isPassed=false;
        }
    }

    public void calcAverage()
    {
        double avg_1=(mat.note_1*mat.note_2)/100+ (mat.note_2*mat.sinav)/100;
        double avg_2=(fiz.note_1*fiz.note_2)/100+ (fiz.note_2*fiz.sinav)/100;
        double avg_3=(kim.note_1*kim.note_2)/100+ (kim.note_2*kim.sinav)/100;
        //this.average=((this.mat.note_1*0.80+this.mat.note_2*0.20)+(this.fiz.note_1*0.80+this.fiz.note_2*0.20)+(this.kim.note_1*0.80+this.kim.note_2*0.20))/3.0;
        this.average=(avg_1+avg_2+avg_3)/3.0;
        System.out.println("Ortalamanız: "+this.average);
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrencinin Adı : " + this.stuName);
        System.out.println("Matematik Notu : " + this.mat.note_1);
        System.out.println("Fizik Notu : " + this.fiz.note_1);
        System.out.println("Kimya Notu : " + this.kim.note_1);
    }

}
