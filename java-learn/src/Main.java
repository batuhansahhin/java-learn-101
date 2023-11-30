
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner imp = new Scanner(System.in);

        //Kullanıcıdan değerleri al

        System.out.println("Matematik Notunuz: ");

        mat = imp.nextInt();

        System.out.println("Fizik Notunuz: ");

        fizik = imp.nextInt();

        System.out.println("Kimya Notunuz: ");

        kimya = imp.nextInt();

        System.out.println("Turkce Notunuz: ");

        turkce = imp.nextInt();

        System.out.println("Tarih Notunuz: ");

        tarih = imp.nextInt();

        System.out.println("Müzik Notunuz: ");

        muzik = imp.nextInt();

        double ortalama =  (mat + fizik + kimya + tarih + turkce + muzik) / 6.0;

        int gectiMi = (ortalama >= 60) ? 1: 0;
        String sonuc = (gectiMi == 1) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(sonuc);

    }
}