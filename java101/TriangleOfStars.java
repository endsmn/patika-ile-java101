import java.util.Scanner;
/*
Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
*/

public class TriangleOfStars {
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz :");
        int n = scan.nextInt();
        int count = n;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * i + 1); l++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        for (int k = 0; k < n; k++) {
            for (int c = 0; c <= k; c++) {
                System.out.print(" ");
            }
            for (int b = 2 * n - 1; b >= (2 * k + 1); b--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}