import java.util.Scanner;

public class CevreAlanHesaplama {

    public static void main(String[] args) {

        double yaricap, alan, cevre;

        System.out.println("Yarıçap değeri giriniz");

        Scanner input = new Scanner(System.in);

        yaricap = input.nextDouble();

        alan = (yaricap * yaricap * 3.14);

        cevre = (2 * 3.14 * yaricap);

        System.out.println("Alan değeri: " + alan);

        System.out.println("Cevre değeri: " + cevre);

    }
}
