import java.util.Scanner;
/*
Matematik, Fizik, Kimya, Türkçe, Tarih derslerinin sınav puanlarını
kullanıcıdan alan, ortalamalarını hesaplayıp ekrana bastıran ve kullanıcının ortalaması 60'dan
büyük ise ekrana "Sınıfı Geçti." , küçük ise "Sınıfta Kaldı." yazdıran program.
*/
public class NotOrtalaması {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih);
        double sonuc =toplam / 6.0;
        System.out.println("Ortalamanız :" + sonuc);

        String str = (sonuc<60)? "Sınıfta Kaldı." : "Sınıfı Geçti.";
        System.out.println(str);

    }
}
