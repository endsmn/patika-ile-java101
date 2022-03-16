import java.util.Scanner;
/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
int n,k;
Scanner scan =new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        n = scan.nextInt();
        System.out.print("Üs Sayısını Giriniz :");
        k = scan.nextInt();
        int total =1,i=1;

        while(i <=k){
            total *= n;
            i++;
            
        }
        System.out.println("Sonuç :"+total);


Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü"
 kullanarak yapınız.
 */

public class ÜsHesabı {
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022 */

        int n, k;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        n = scan.nextInt();
        System.out.print("Üs Sayısını Giriniz :");
        k = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= k;

        }
        System.out.print("Sonuç :" + " " + total);

    }
}
