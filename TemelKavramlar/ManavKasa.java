import java.util.Scanner;

/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin 
kilogram değerlerine göre toplam tutarını ekrana yazdıran 
programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

*/

public class ManavKasa {
public static void main(String[] args) {

    /** @Author Omer Ozekin, 2022  */

    double total;
    double armut = 2.14, elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;
    double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;

    Scanner girdi = new Scanner(System.in);
    System.out.print("Armut Kaç Kg ? :");
    armutKg = girdi.nextDouble();
    
    System.out.print("Elma Kaç Kg ? :");
    elmaKg = girdi.nextDouble();
   
    System.out.print("Domates Kaç Kg ? :");
    domatesKg = girdi.nextDouble();

    System.out.print("Muz Kaç Kg ? :");
    muzKg = girdi.nextDouble();

    System.out.print("Patlıcan Kaç Kg ? :");
    patlıcanKg = girdi.nextDouble();

    

    total = armutKg*armut+elmaKg*elma+domatesKg*domates+muzKg*muz+patlıcanKg*patlıcan;
    

    System.out.print("Toplam Tutar :"+total+"TL");



    
}

    
}
