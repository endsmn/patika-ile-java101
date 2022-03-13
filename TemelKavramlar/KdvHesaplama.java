import java.util.Scanner;

public class KdvHesaplama{
    public static void main(String[] args) {
        double tutar,kdvOran,kdvToplam,kdvTutar;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ücret Tutarınızı Giriniz :");
        tutar = input.nextDouble();
        
        kdvOran = (tutar>1000)? 0.08 : 0.18 ;
        kdvTutar = tutar * kdvOran;
        kdvToplam = tutar + kdvTutar;
        
        
        System.out.println("Kdv'siz Tutar :"+ tutar);
        System.out.println("Kdv Oranı :"+kdvOran);
        System.out.println("Kdv Tutarı :"+kdvTutar);
        System.out.println("Kdv'li tutar :"+kdvToplam);


    }
}