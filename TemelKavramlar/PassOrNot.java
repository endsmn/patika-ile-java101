import java.util.Scanner;

public class PassOrNot {

    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, muzik, dNotları, total = 0;
        int gNotu, counter = 0;

        gNotu = 55;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ders Notlarınızı Giriniz");

        System.out.print("Matematik Notunuz :");
        mat = scan.nextInt();
        if (!(mat >= 0) || mat <= 100) {
            total += mat;
            counter++;

        }

        System.out.print("Fizik Notunuz :");
        fizik = scan.nextInt();
        if (!(fizik >= 0) || (fizik <= 100)) {
            total += fizik;
            counter++;
        }

        System.out.print("Kimya Notunuz :");
        kimya = scan.nextInt();
        if (!(kimya >= 0) || (fizik <= 100)) {
            total += fizik;
            counter++;
        }

        System.out.print("Türkçe Notunuz :");
        turkce = scan.nextInt();
        if (!(turkce >= 0) || (turkce <= 100)) {
            total += turkce;
            counter++;
        }
        System.out.print("Müzik Notunuz :");
        muzik = scan.nextInt();
        if (!(muzik >= 0) || (muzik <= 100)) {
            total += muzik;
            counter++;
        }

        dNotları = (total) / (counter);
        if (dNotları / 5 >= gNotu) {
            System.out.print("Tebrikler, Sınıfta Kalmayı Başardınız!");

        } else {
            System.out.println("Tebrikler, Sınıfı Geçtiniz.");
        }

        System.out.print("Ortalamanız :" + " " + dNotları);

    }

}
