public class Course {
    Teacher teacher;
    String lecName;
    String lecCode;
    String prefix;
    int note_1;
    int note_2;
    int sozNot;
    int sinav;

    Course(String lecName,String lecCode,String prefix,Teacher teacher,int note_1,int note_2,int sozNot){
        this.lecName=lecName;
        this.lecCode=lecCode;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note_1=note_1;
        this.note_2=note_2;
        this.sozNot=sozNot;
    }

    protected void addTeacher(Teacher t1)
    {
        this.teacher=t1;
        if(this.prefix.equals(t1.branch))
        {
            System.out.println("Öğretmen dersi verebilir.");
        }
        else {
            System.out.println(t1.name+" öğretmen bu dersi veremez! ");
        }
    }


    public void printTeacher()
    {

        if(teacher!=null)
        {
            System.out.println(this.lecName+" adlı dersi"+this.teacher+" adlı öğretmen verecektir.");
        }
        else
        {
            System.out.println(this.lecName+" adlı derse öğretmen atanmamıştır! ");
        }

    }



}
