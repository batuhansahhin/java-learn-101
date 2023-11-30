import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {

        String userName, passwword;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0){

            Scanner input = new Scanner(System.in);
            System.out.print("Kullanici adınızı giriniz: ");
            userName = input.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            passwword = input.nextLine();

            if (userName.equals("patika") && passwword.equals("dev123")){
                System.out.println("Sisteme giriş yapıldı");

                do {
                    System.out.println("Lütfen yapılacak işlemi seçiniz");
                    System.out.println("1- Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Yatıralacak para tutarını giriniz");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Çekilecek para tutarınızı giriniz");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount <= balance){
                                balance -= withdrawAmount;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            else {
                                System.out.println("Yetersiz bakiye");
                                break;
                            }
                            case 3:
                                System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapıldı!");
                            break;
                        default:
                            System.out.println("Geçersiz işlem!");

                    }

                }
                while (select != 4);
                break;
            }
            else{
                System.out.println("Hatalı kullanıcı girişi" +
                        "Tekrar deneyiniz");
                System.out.println("Kalan hak: " + --right);
                if (right == 0){
                    System.out.println("Hesap bloke olmuştur, banka ile iletişime geçiniz");
                }
            }
        }
    }
}
