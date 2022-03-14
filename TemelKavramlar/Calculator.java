import java.util.Scanner;

public class Calculator {
    private static final String Void = null;

    public static void main(String[] args) {
        double n1, n2;

        int slc, toplama = 1, çıkarma = 2, çarpma = 3, bölme = 4;

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz :");
        n1 = scan.nextDouble();
        System.out.print("2. Sayıyı Giriniz :");
        n2 = scan.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz :");
        slc = scan.nextInt();

        switch (slc) {
            case 1:

                System.out.print("Sonuç :" + (n1 + n2));
                break;

            case 2:

                System.out.print("Sonuç :" + (n1 - n2));
                break;

            case 3:

                System.out.print("Sonuç :" + (n1 * n2));
                break;

            case 4:

                if (n1 == 0) {

                    System.out.println("Bu Sayı 0'a Bölünemez!");

                } else if (n2 == 0) {

                    System.out.println("Bu Sayı 0'a Bölünemez!");
                } else
                    System.out.println("Sonuç :" + (n1 / n2));
                break;

            default:

                System.out.println("Hatalı Seçim Yaptınız!");
                break;
                
        }
        
    }
    

}
