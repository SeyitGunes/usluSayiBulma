import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);

        System.out.println("n^k");

        System.out.println("n değerini giriniz: ");
        n = input.nextInt();

        System.out.println("k değerini giriniz: ");
        k = input.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++){
            total = total * n;
        }
        System.out.println(total);
    }
}