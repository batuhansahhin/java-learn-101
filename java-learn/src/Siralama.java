import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int[] sayilar = new int[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println((i + 1) + ". Sayıyı Giriniz");
            sayilar[i] = input.nextInt();
        }

        Arrays.sort(sayilar);

        System.out.println("Sıralama: " + sayilar[2] + " " + sayilar[1] + " " + sayilar[0]);
    }
}
