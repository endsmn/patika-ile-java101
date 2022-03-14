import java.util.Scanner;

/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız


*/

public class burcBulan{
    public static void main(String[] args) {

        int month, day;
        
            
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Doğum Gününüzü Ay ve Gün Olarak Giriniz!");
        
        System.out.print("Ay :");
        month = scan.nextInt();

        System.out.print("Gün :");
        day = scan.nextInt();

        if ((month<=1|| month>=12) || (day <=1 || day>=31)){
            System.out.print("Yanlış Bilgi Girdiniz!");
        }
       if (day>=22){
        if (month == 1 && day >=21) System.out.println("Oğlak");
        else if (month == 1) System.out.println("Kova");
        if ((month == 2) && (day<19)) System.out.println("Kova");
        else if (month ==2) System.out.println("Balık");
        if ((month == 3) && (day<20)) System.out.println("Balık");
        else if (month ==3) System.out.println("Koç");
        if ((month == 4) && (day<20)) System.out.println("Koç");
        else if (month ==2) System.out.println("Boğa");
        if ((month == 5) && (day < 21)) System.out.println("Boğa");
        else if (month == 5) System.out.println("İkizler");
        if ((month == 6) && (day < 22)) System.out.println("İkizler");
        else if (month == 6) System.out.println("Yengeç");
        if ((month == 7) && (day <22)) System.out.println("Yengeç");
        else if (month == 7) System.out.println("Aslan");
        if ((month == 8) && (day < 22)) System.out.println("Aslan");
        else if (month == 8) System.out.println("Başak");
        if ((month == 9) && (day <22)) System.out.println("Başak");
        else if (month == 9) System.out.println("Terazi");
        if ((month == 10) && (day <22)) System.out.println("Terazi");
        else if (month == 10) System.out.println("Akrep");
        if ((month ==11) && (day < 21)) System.out.println("Akrep");
        else if (month == 11) System.out.println("Yay");
        if ((month == 12) && (day<21)) System.out.println("Yay");
        else if (month == 12) System.out.println("Oğlak");
           
           
           
           
            
               }
               else {
                if (month == 1) 
                System.out.println("Oğlak");
                if (month == 2) 
                System.out.println("Kova");
                if (month == 3) 
                System.out.println("Balık");
                if (month == 4) 
                System.out.println("Koç");
                if (month == 5) 
                System.out.println("Boğa");
                if (month == 6) 
                System.out.println("İkizler");
                if (month == 7) 
                System.out.println("Yengeç");
                if (month == 8) 
                System.out.println("Aslan");
                if (month == 9) 
                System.out.println("Başak");
                if (month == 10) 
                System.out.println("Terazi");
                if (month == 11) 
                System.out.println("Akrep");
                if (month == 12) 
                System.out.println("Yay");
            }
           }
       }



