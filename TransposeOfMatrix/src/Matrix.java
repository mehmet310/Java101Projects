import java.util.*;

public class Matrix {
    //Matrisin transpozunu bulan programdır. 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Matrisin satır değerini giriniz.");
        int row = s.nextInt();
        System.out.println("Matrisin sütun değerini giriniz.");
        int column = s.nextInt();
        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];
        System.out.print("Matrisin elemanlarını giriniz.");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = s.nextInt();


            }
            System.out.println();
        }
        System.out.print("Matris: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {

                transpose[i][j] = matrix[j][i];
            }

            System.out.println();
        }
        System.out.println("Matrisin transpozu: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }
}
