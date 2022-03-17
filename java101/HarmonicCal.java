import java.util.Scanner;

/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.

*/
public class HarmonicCal {
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int n = scan.nextInt();

        double x = 0;
        for (double i = 1; i <= n; i++) {
            x += (1 / i);
        }
        System.out.println(x);
    }
}