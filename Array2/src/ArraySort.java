
import java.util.Scanner;

public class ArraySort {
    //Hem OOP(object oriented programming) hem de dizi mantığı pekiştirilmesi hedeflenir.
    //Küçükte büyüğe sıralama yapan programdır.
    public void Sorting( int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz.");
        int n = s.nextInt();
        arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = s.nextInt();
            System.out.println("Dizinin " + (i + 1) + ". elemanı: " + arr[i]);

        }


        //Sıralama yapılması için iki for döngüsü yapılır.
        //Dizinin elemanı önceki elemandan büyükse atama işlemleri gerçekleşir.
        //Bubble sort mantığı ile yapıldığı için algoritma analizindeki değeri O(n^2)'dir.

        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 1; k < (arr.length-j); k++) {
                if (arr[k-1] > arr[k]) {
                    temp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = temp;
                }

            }
        }
        System.out.print("Sıralama: ");
        for (int i = 0; i < arr.length; i++) {


            System.out.print("\t " + arr[i]);

        }
    }
}

