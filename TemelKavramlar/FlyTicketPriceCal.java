import java.util.Scanner;

/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) 
bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. 
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki 
koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
public class FlyTicketPriceCal {
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022 */

        int dist, age, trip;

        double total, ageDis, tripDis, disPrice, chilDis, oldDis,disPr,oldPr;

        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi Km Cinsinden Giriniz :");
        dist = scan.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        age = scan.nextInt();

        System.out.print("Yolculuk Tipini Giriniz!\n(Tek Yön-1/Gidiş Dönüş-2) :");
        trip = scan.nextInt();

        double km = dist * 0.10;
        total = km;
        ageDis = total * 0.10;
        disPrice = total - ageDis;
        tripDis = disPrice * 0.20;
        chilDis = total * 0.50;
        oldDis = total * 0.30;
        disPr = total-chilDis;
        oldPr = total-oldDis;

        if ((trip == 1) && (dist > 1) && (age >= 1 && age <= 12)) {
            System.out.print("Toplam tutar :" + disPr + " TL");

        } else if ((trip == 2) && (dist > 1) && (age >= 1 && age <= 12)) {
            System.out.print("Toplam tutar :" + (disPr - tripDis) + " TL");

        } else if ((trip == 1) && (dist > 1) && (age >= 65)) {
            System.out.print("Toplam tutar :" + oldPr + " TL");

        } else if ((trip == 2) && (dist > 1) && (age >= 65)) {
            System.out.print("Toplam tutar :" + (oldPr - tripDis) + " TL");

        } else if ((trip == 1) && (dist > 0) && (age > 1)) {

            System.out.print("Toplam Tutar :" + disPrice + " TL");

        } else if ((trip == 2) && (dist > 0) && (age > 1)) {
            System.out.println("Toplam Tutar :" + (disPrice - tripDis) * 2 + " TL");

        } else {
            System.out.print("Hatalı Giriş Yaptınız!");
        }

    }
}
