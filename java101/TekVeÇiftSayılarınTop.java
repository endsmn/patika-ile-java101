import java.util.Scanner;
/*Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri 
kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana 
basan programı yazıyoruz.

Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul 
eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
 ekrana basan programı yazıyoruz.
*/

public class TekVeÇiftSayılarınTop {

    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022 */

        int x, total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz:");
            x = scan.nextInt();
            if (x % 2 == 0 || x % 4 == 0) {
                total += x;

            }
        } while (x > 9);
        System.out.print("Toplam :" + total);
        
        /*
         * do {
         * System.out.print("Sayı Giriniz :");
         * x = scan.nextInt();
         * if(x % 2==1){
         * total += x;
         * 
         * }
         * 
         * } while (x > 0);
         * System.out.print("Toplam :"+total);
         */

    }

}
