public class Main {
    public static void main(String[] args) {
        //'*' karakteri ile çıktıda B harfi yazdırılır.
        String[][] arr = new String[7][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == 2 || i == 6) {
                    arr[i][j] = "*";
                } else if (j == 0 || j == 3) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }
            }
        }
        for (String[] j : arr) {
            for (String col : j) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
