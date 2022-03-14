import java.util.Scanner;

public class FlyTicketPriceCal {
    public static void main(String[] args) {

        int dist, age, trip;

        double total, ageDis, tripDis,disPrice;

        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi Km Cinsinden Giriniz :");
        dist = scan.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        age = scan.nextInt();

        System.out.print("Yolculuk Tipini Giriniz!\n(Tek Yön-1/Gidiş Dönüş-2) :");
        trip = scan.nextInt();

        double km = dist * 0.10;
        total = km;
        ageDis = total*0.10;
        disPrice = total-ageDis;
        tripDis = disPrice*0.20;

        if ((trip == 1)&& (dist>0)&& (age>1)) {

            System.out.print("Toplam Tutar :" + disPrice + " TL");

        } else if ((trip == 2)&& (dist>0)&&(age>1)) {
            System.out.println("Toplam Tutar :" + (disPrice-tripDis) * 2 + " TL");

        } else {
            System.out.print("Hatalı Giriş Yaptınız!");
        }

    }
}
