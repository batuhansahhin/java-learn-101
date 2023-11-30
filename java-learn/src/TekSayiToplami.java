import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {

        int a, total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Sayi Giriniz: ");
            a = input.nextInt();
            if (a % 2 == 1){
                total += a;
            }
        }while (a>0);

        System.out.println("Toplam: " + total);
    }
}
