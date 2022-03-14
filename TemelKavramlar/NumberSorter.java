import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz :");
        a = scan.nextInt();

        System.out.print("2. Sayıyı Giriniz :");
        b = scan.nextInt();

        System.out.print("3. Sayıyı Giriniz :");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print("a>b>c");
            } else {
                System.out.print("b>c>a");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("b>a>c");
            } else {
                System.out.print("b>c>a");

            }
        } else {
            if (a > b) {
                System.out.print("c>a>b");

            } else {
                System.out.print("c > b > a");
            }

        }

    }

}
