import java.util.Scanner;
/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
*/

public class ChinaZodiakCal {

    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022  */


        int birth;
        Scanner scan = new Scanner(System.in);

        System.out.print("Year Of Birth :");
        birth = scan.nextInt();

        switch (birth % 12) {

            case 0:
                System.out.print("Your Chinese Zodiak : "+" Monkey");
                break;

            case 1:
                System.out.print("Your Chinese Zodiak : "+" Cockerel");
                break;

            case 2:
                System.out.print("Your Chinese Zodiak : "+" Dog");
                break;

            case 3:
                System.out.print("Your Chinese Zodiak : "+" Pig");
                break;

            case 4:
                System.out.print("Your Chinese Zodiak : "+" Mouse");
                break;

            case 5:
                System.out.print("Your Chinese Zodiak : "+" Ox");
                break;

            case 6:
                System.out.print("Your Chinese Zodiak : "+" Tiger");
                break;

            case 7:
                System.out.print("Your Chinese Zodiak : "+" Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese Zodiak : "+" Dragon");
                break;
            case 9:
                System.out.print("Your Chinese Zodiak : "+" Snake");
                break;
            case 10:
                System.out.print("Your Chinese Zodiak : "+" Horse");
                break;
            case 11:
                System.out.print("Your Chinese Zodiak : "+" Sheep");
                break;

        }
    }
}