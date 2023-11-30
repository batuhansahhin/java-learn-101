import java.util.Scanner;

public class CiftSayiYazdirma {
    public static void main(String[] args) {

        int a;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");

        a = input.nextInt();

        for(int i = 1; i <= a; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
