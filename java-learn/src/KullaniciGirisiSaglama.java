import java.util.Scanner;

public class KullaniciGirisiSaglama {
    public static void main(String[] args) {

        String username, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adınız: ");

        username = input.nextLine();

        System.out.print("Şifreniz: ");

        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş sağlandı");
        }
        else {
            System.out.println("Bilgileriniz Yanlış");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String resetChoise = input.nextLine();

            if(resetChoise.equalsIgnoreCase("Evet")){
                System.out.print("Yeni Şifrenizi Giriniz: ");
                newPassword = input.nextLine();

                if(!newPassword.equals(password) && newPassword.length() >= 6){
                    System.out.println("Şifre oluşturuldu");
                }
                else{
                    System.out.println("Şifre oluşturulamadı");
                }

            }
            else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
