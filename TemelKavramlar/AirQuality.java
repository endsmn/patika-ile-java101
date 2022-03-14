import java.util.Scanner;

public class AirQuality {
    public static void main(String[] args) {

        int temp, ski, cine, picnic,swim;

        Scanner scan =new Scanner(System.in);

        System.out.print("Hava Sıcaklığı:");
        temp = scan.nextInt();

        if(temp<=5){
            System.out.print("Bugün hava sıcaklığı 5 dereceden düşük kayak yapman tavsiye edilir.");

        }else if((temp>=5) && (temp<=15)){
            System.out.print("Bugün hava sinema için çok güzel.");

        }else if((temp>=15)&&(temp<=25)){
            System.out.print("Bugün hava piknik için çok elverişli.");

        }else if((temp>=25)){
            System.out.print("Bugün denizde zaman geçirmen için en sıcak gün.");


        }
    }

}
