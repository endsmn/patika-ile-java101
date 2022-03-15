import java.util.Scanner;
/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/

public class GirilenSayıyaKadar {
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022  */

        Scanner scan = new Scanner(System.in);

        int sayi;
        double a = 0, b = 0;

        System.out.print("Lütfen Sayı Giriniz :");
        sayi = scan.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                a += i;
                b++;

            }

        }
        double average = (a / b);
        if (b == 0) {
            System.out.print("3 ve 4'e Bölünen sayıların Ortalaması :" + average);
        } else {
            System.out.println("3 ve 4'e Bölünen sayıların Ortalaması :" + average);
        }
    }

}
