import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı girniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarman\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz Nedir");

        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme: " + (n1 / n2) );
        }

    }
}
