import java.util.Scanner;

public class KucukKuvvet {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i = 1; i <= n; i*=2){
            System.out.println(i);
        }

    }
}
