import java.util.*;

public class Main {
    //Dizide en küçük ve en büyük sayının bulunması istenmektedir.
    //Kullanıcıdan dizi boyutu,dizi elemanları da girilmesi istenir.
    //Bu işlemlerden sonra kullanıcıdan bir sayı istenir ve yakın olduğu en küçük ve en büyük sayı kullanıcıya bildirilir.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz: ");
        int a = s.nextInt();
        int[] arr = new int[a];
        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Dizi: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("}\n");
        int min = arr[0];
        int max = arr[0];
        System.out.println("Bir sayı giriniz: ");
        int n = s.nextInt();
        System.out.println("Girilen sayı: " + n);
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }

        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
        Arrays.sort(arr);
        for (int i : arr) {
            if (n > i) {
                min = i;

            } else {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);


    }
}
