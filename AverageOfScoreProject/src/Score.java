import java.util.Scanner;
public class Score {

    public static void main(String[] args) {
        String checking;
        checking= CalculateOfScore();
        System.out.println("You " + checking +" from this semester!");
    }
    /*
    Following This method will be calculating
    average of total scores of every lecture (6 lectures)
    and  will be determining the total average if average>60 then pass else fail.
    */

    public static String CalculateOfScore()
    {

        int history,calculus,physics,chemistry,turkish,music;
        Scanner scan=new Scanner(System.in);

        //Checking variables for points if range is between 0-100!

        String checkHist,checkMath,checkPhys,checkChem,checkTurk,checkMusic;
        // Data inputs from user.

        System.out.println("Please enter score of history lecture");
        history=scan.nextInt();
        checkHist=(history<0 || history>100)?"Please enter score correctly between 0-100 for history! Program will be finished!!! ": " ";
        System.out.println(checkHist);
        if (history<0 || history>100){System.exit(0);} //System will be finished if wrong score entered without range!

        System.out.println("Please enter score of calculus lecture");
        calculus=scan.nextInt();
        checkMath=(calculus<0 || calculus>100)?"Please enter score correctly between 0-100 for calculus! Program will be finished!!! ": " ";
        System.out.println(checkMath);
        if (calculus<0 || calculus>100){System.exit(0);}

        System.out.println("Please enter score of physics lecture");
        physics=scan.nextInt();
        checkPhys=(physics<0 || physics>100)?"Please enter score correctly between 0-100 for physics! Program will be finished!!! ": " ";
        System.out.println(checkPhys);
        if (physics<0 || physics>100){System.exit(0);}

        System.out.println("Please enter score of chemistry lecture");
        chemistry=scan.nextInt();
        checkChem=(chemistry<0 || chemistry>100)?"Please enter score correctly between 0-100 for chemistry! Program will be finished!!! ": " ";
        System.out.println(checkChem);
        if (chemistry<0 || chemistry>100){System.exit(0);}

        System.out.println("Please enter score of turkish lecture");
        turkish=scan.nextInt();
        checkTurk=(turkish<0 || turkish>100)?"Please enter score correctly between 0-100 for turkish! Program will be finished!!!" : " ";
        System.out.println(checkTurk);
        if (turkish<0 || turkish>100){System.exit(0);}

        System.out.println("Please enter score of music lecture");
        music=scan.nextInt();
        checkMusic=(music<0 || music>100)?"Please enter score correctly between 0-100 for music! Program will be finished!!!": " ";
        System.out.println(checkMusic);
        if (music<0 || music>100){System.exit(0);}

        double avg,total;  //definition and calculation of total and average scores.
        total=history+calculus+physics+chemistry+turkish+music;
        avg=total/6.0;
        System.out.println("Total score is: "+total);
        System.out.println("Average score is: "+avg);

        //Checking if pass or fail not using if operator!
        String isPassed= avg>=60 ? "passed" : "failed";

        return isPassed;

    }
}
