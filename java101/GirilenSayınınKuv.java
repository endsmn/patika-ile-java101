
import java.util.Scanner;
/*
Java döngüler ile girilen sayıya kadar olan 2'nin 
kuvvetlerini ekrana yazdıran programı yazıyoruz.

2'nin kuvvetlerini alan kısım.
 * 
 * for(i=1 ; i <= n; i*=2){
 * System.out.println(i);
 * }

Ödev (https://app.patika.dev/moduller/java101/www.patika.dev)
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in 
kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

public class GirilenSayınınKuv {

    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022  */

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        n = scan.nextInt();

        System.out.print("4'ün Kuvvetleri :");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(" " + i + ",");

        }
        System.out.println();
        System.out.println("================================");

        System.out.print("5'in Kuvvetleri :");
        for (int j = 1; j <= n; j *= 5) {
            System.out.print(" " + j + ",");
        }

    }

}


