import java.util.Scanner;

/*
Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/
public class BasamakBulma {
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = scan.nextInt();
        int j = n, bas, s;
        int result = 0;
        int x = 0;

        while (j != 0) {
            j /= 10;
            x++;

        }
        j = n;
        while (j != 0) {
            bas = j % 10;
            j /= 10;
            result += bas;

        }

        System.out.println("Basamak Sayılarının Toplamı :" + " " + result);

    }
}

/*
 * int basNumber = 0;
 * int tempNumber = number;
 * int basValue;
 * int result = 0;
 * int basPow;
 * 
 * 
 * 
 * /*
 * while (tempNumber != 0) {
 * basValue = tempNumber % 10;
 * basNumber++;
 * 
 * }
 * System.out.println(basNumber);
 * /*
 * while (tempNumber != 0) {
 * tempNumber /= 10;
 * basNumber++;
 * }
 * 
 * tempNumber = number;
 * while (tempNumber != 0) {
 * basValue = tempNumber % 10;
 * // 1*1*1*1 = 1^4
 * basPow = 1;
 * for (int i = 1; i <= basNumber; i++) {
 * basPow *= basValue;
 * }
 * result += basPow;
 * tempNumber /= 10;
 * }
 * 
 * if (result == number) {
 * System.out.println(number + " sayısı bir Armstrong sayıdır.");
 * } else {
 * System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
 * }
 * 
 * 
 * /*
 * int a = 2451, basamakSayisi = 0, numberCounter = 0;
 * 
 * // Basamak Sayısı Bulma İşlemi
 * // 2451 / 10 = 245
 * // 245 / 10 = 24
 * // 24 / 10 = 2
 * // 2 / 10 = 0
 * // 0 / 10 = 0
 * 
 * while (a != 0) {
 * a /= 10;
 * numberCounter++;
 * }
 * 
 * // Bir sayının son basamağını bulma
 * // 2451 % 10 = 1
 * int b = 2451;
 * int c = b % 10;
 * 
 * int sub = 2, sup = 3;
 * int result = 1;
 * for (int i = 1; i <= sup; i++ ){
 * result *= sub;
 * }
 * System.out.println(result);
 * 
 */
