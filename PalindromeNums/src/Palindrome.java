import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome(int number) {
        //Palindrome sayı olup olmadığını araştıran bir programdır.
        //Palindrome sayılar düz ve tersten bakıldığında aynı olan sayılardır.
        //Örneğin 343,565,1001 gibi...

        int tempNum = number, revNumber = 0, lastNum = 0;
        while (tempNum != 0) {
            lastNum = tempNum % 10;
            revNumber = (revNumber * 10) + lastNum;
            tempNum = tempNum / 10;
        }
        if (number == revNumber) {
            System.out.println("Bu sayı palindrome sayıdır.");
            return true;
        } else {
            System.out.println("Bu sayı palindrome sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Bir sayı giriniz. ");
        int b = a.nextInt();
        checkPalindrome(b);

    }
}
