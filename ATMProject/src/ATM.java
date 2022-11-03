import java.util.Scanner;
public class ATM {
    //Bu programda ATM'deki işlemlerin yapılması amaçlanmaktadır.

        public static void main(String[] args) {
            String userName, password;
            Scanner input = new Scanner(System.in);
            int right = 3;
            int balance = 1500;
            int select;
            while (right > 0) {
                System.out.print("Kullanıcı Adınız :");
                userName = input.nextLine();
                System.out.print("Parolanız : ");
                password = input.nextLine();

                if (userName.equals("patika") && password.equals("dev123")) {
                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    do {
                        System.out.println("1-Para yatırma\n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgula\n" +
                                "4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select = input.nextInt();
                        int price;
                        switch (select) {
                            case 1:
                                System.out.println("Yatırılacak tutar :");
                                price = input.nextInt();
                                balance += price;
                                System.out.println("teşekkür ederiz.İşlemlerinize devam etmek ister misiniz ?");
                                break;

                            case 2:
                                System.out.println("Çekilecek tutar");
                                price = input.nextInt();
                                if (price > balance) {
                                    System.out.println("bakiye yetersiz!");
                                } else {
                                    balance -= price;
                                    System.out.println("İşleminiz gerçekleşti.Teşekkür ederiz." +
                                            "Tekrar görüşmek üzere hoşçakalın." 
                                            );
                                }
                                break;
                            case 3:
                                System.out.println("bakiyeniz: " + balance);
                                break;
                            case 4:
                                System.out.println("Gecersiz işlem seçtiniz.Lütfen tekrar deniyiniz.");
                                break;
                            default:
                                System.out.println("gecersiz işlem seçtiniz!");
                                break;
                        }
                    } while (select != 4);
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                } else {
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan Hakkınız : " + right);
                    }
                }
            }
        }
    }

