import java.util.Scanner;
/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir 
değişkene atayın. Aşağıdaki formüle göre kullanıcının 
"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
*/ 


public class BodyMassIndexCalculator{
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022  */

        int kilo;
        double boy,kitle;

        Scanner girdi =new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinde) Giriniz :");
        boy = girdi.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");

        kilo = girdi.nextInt();

        kitle = kilo / Math.pow(boy,2);

        System.out.print("Vücut Kitle İndeksiniz :"+kitle);

        
    }


}