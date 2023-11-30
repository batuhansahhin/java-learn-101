import java.util.Scanner;

public class KitleEndeksi {

    public static void main(String[] args) {

        double boy, kilo, kitleIndex;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz");

        Scanner inputBoy = new Scanner(System.in);

        boy = inputBoy.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz");

        Scanner inputKilo = new Scanner(System.in);

        kilo = inputKilo.nextDouble();

        kitleIndex = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + kitleIndex);
    }
}
