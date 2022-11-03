public class PrimeNums {
    //Bu projede 1'den 100'e kadar asal sayıların bulunması amaçlanır.
    public static void main(String[] args) {


        boolean checkPrime; //Asal sayıyı kontrol edecek birim
        System.out.print("Asal sayılar: \t ");
        for (int i = 2; i <= 100; i++) {
            checkPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    checkPrime = false;

                }
            }

            if (checkPrime)
                System.out.print(i + " ");
        }

    }
}
