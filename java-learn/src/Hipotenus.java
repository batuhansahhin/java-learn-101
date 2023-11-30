import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        // a^2 + b^2 = c^2
        // Değişkenler: a, b, c = hipotenus

        int yatayKenar, dikeyKenar;
        double hipotenus;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dikey Kenar Uzunluğu Giriniz");
        dikeyKenar = scanner.nextInt();

        System.out.println("Yatay Kenar Uzunluğu Giriniz");
        yatayKenar = scanner.nextInt();

        hipotenus = Math.sqrt((yatayKenar * yatayKenar) + (dikeyKenar * dikeyKenar));

        System.out.println("Hipotenüs: " + hipotenus);
    }
}
