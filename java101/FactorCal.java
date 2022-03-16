import java.util.Scanner;
/*
Java ile faktöriyel hesaplayan program yazıyoruz.
        for(int i=1; i <=n; i++){
            total=total *i;

        }
        System.out.println(n+". Faktöriyel :"+total);
While Döngüsü ile faktöriyel hesaplayan program kodları şe şekildedir.
        
        System.out.print("Faktöriyel Sayısını Giriniz :");
        int n = scan.nextInt();
        int sayac = n;
        int i=1,total =1;
        System.out.print(n+". Faktöriyel :");
         while(sayac>1){
             i++;
             total = total*i;
             sayac--;            
         }
         System.out.print(" "+total);
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı 
grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li 
kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/

public class FactorCal {
    public static void main(String[] args) {

         /** @Author Omer Ozekin, 2022  */
         
        Scanner scan = new Scanner(System.in);

        System.out.println("C(n,r) Kombinasyonu İçin :");
        System.out.print("n Sayısını Giriniz :");
        int n = scan.nextInt();
        System.out.print("r Sayısını Giriniz :");
        int r = scan.nextInt();

        if (n < r) {
            System.out.println("N sayısı R Sayısından Büyük Olmalıdır!");
            System.out.print("Lütfen N Sayısını Tekrar Giriniz :");
            n = scan.nextInt();
            kombinasyon(n, r);
        } else {
            kombinasyon(n, r);
        }
    }

    private static void kombinasyon(int n, int r) {

        int nTotal = 1, rTotal = 1, nr = 1;
        int rTotaln;
        rTotaln = n - r;

        System.out.print(n + ". Faktöriyeli =");
        for (int i = 1; i <= n; i++) {
            nTotal = nTotal * i;

        }
        System.out.println(" " + nTotal);
        System.out.println("=============");

        System.out.print(r + ". Faktöriyeli =");
        for (int j = 1; j <= r; j++) {
            rTotal = rTotal * j;

        }
        System.out.println(" " + rTotal);
        System.out.println("=============");

        System.out.print(nTotal + "-" + rTotal + " Faktöriyeli =");
        for (int k = 1; k <= rTotaln; k++) {
            nr = nr * k;

        }
        System.out.println(" " + nr);
        System.out.println("=============");

        double c = nTotal / (rTotal * (nr));
        System.out.print("Kombinasyon Sonucu :" + " " + c);

    }
}