import java.util.*;

public class MineSweeper {
    //Global variables
    int row; //satır
    int column;// sütun

    String[][] map; //mayınların haritası
    String[][] board;//kullanıcıların haritası
    int mineNums; //toplam boyut

    //Constructor
    public MineSweeper(int row, int column) {
        this.column = column;
        this.row = row;
        this.map = new String[row][column];
        this.board = new String[column][row];
        this.mineNums = (row * column) / 4;
    }

    //methods
    public void run() {
        Scanner s=new Scanner(System.in);

        int overallMove=(this.column * this.row) - mineNums;
        System.out.println("===== Bayanlar ,Baylar... Mayın Tarlası Oyunumuza Hoşşşgelddiinizzz.. ======");
        setMapZone();
        setMines();

        int showMines=0;
        while(overallMove!=0) {
            System.out.println("=============================================");
            showMap();
            System.out.print("Satır giriniz: ");
            int newRow = s.nextInt();
            System.out.print("Sütun giriniz: ");
            int newCol = s.nextInt();
            if((newRow>=this.row||newRow<0) || (newCol>=this.column|| newCol<0))
            {
                System.out.println("Hatalı giriş... Lütfen yeniden giriniz.");
            }
            else{
                if(this.map[newRow][newCol]=="*")
                {
                    System.out.println("Üzgünüz,Oyun sona erdi.");
                    printMines();
                    break;
                }
                else{
                    int sumOfRows=(newRow+1),sumOfCols=(newCol+1);
                    int diffOfRows=(newRow-1),diffOfCols=(newCol-1);
                    if((sumOfRows>=this.row)||(sumOfCols>=this.column)){
                        sumOfRows=newRow;
                        sumOfCols=newCol;
                    }
                    if((diffOfRows<0)||(diffOfCols<0))
                    {
                        diffOfRows=0;
                        diffOfCols=0;
                    }
                    for(int i=diffOfRows;i<=sumOfRows;i++){
                        for(int j=diffOfCols;j<=sumOfCols;j++){
                            if(map[i][j]=="*")
                            {
                                showMines++;
                            }
                        }
                    }
                }

            }
            String newShowMines = String.valueOf(showMines);
            this.board[newRow][newCol] = newShowMines ;
            overallMove--;
        }
        if(overallMove==0)
        {
            System.out.println("Tebrikler oyunu kazandınız!");
        }

    }
    public void showMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setMines() //Mayınlar rassal eklenir.
    {

        int size = (this.row * this.column) / 4;

        for (int i = 0; i < size; i++) {
            int randX = (int) (Math.random() * this.row);
            int randY = (int) (Math.random() * this.column);

            if (map[randX][randY]=="*") {
                i--;
            } else {
                map[randX][randY] = "*";

            }
        }
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if(map[i][j]!="*")
                {
                    map[i][j]="-";
                }
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setMapZone() //Haritada boş yerlere "-" koyuyoruz.
    {
        map = new String[this.row][this.column];

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {

                this.board[i][j] = "-";


            }
        }
    }

    public void printMines() // Tarlanın gösterimi sağlanır.
    {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(this.map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void showMines() // Tarlanın gösterimi sağlanır.
    {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}



