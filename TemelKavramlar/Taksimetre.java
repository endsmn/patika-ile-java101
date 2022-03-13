import java.util.Scanner;


public class Taksimetre {
    public static void main(String[] args) {
        int a,total = 10;
        Double b=2.20,tutar;

        Scanner km = new Scanner(System.in);

        System.out.print("Km Giriniz :");
        a = km.nextInt();
        
        tutar = (a*b);
        tutar += total;

        tutar = (tutar<20)? 20 : tutar;
        
        System.out.print("Yol Ücreti :"+tutar+"TL");





    }
    
}
