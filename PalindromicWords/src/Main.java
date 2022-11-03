import java.util.*;

public class Main {
    //Girilen kelimenin palindrom olup olmadığını kontrol eden programdır.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kelime;
        System.out.println("Bir kelime giriniz: ");
        kelime = scan.nextLine();
        isPalindrom(kelime);
    }

    public static boolean isPalindrom(String string) {
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("Girdiğiniz kelime palindrom kelime değildir.");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("Girdiğiniz kelime palindromdur. ");
        return true;
    }


}
