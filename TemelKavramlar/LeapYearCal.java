import java.util.Scanner;

/*
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

Artık Yıl Nedir?

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün),
 normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik 
yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
*/

public class LeapYearCal {
    public static void main(String[] args) {

         /** @Author Omer Ozekin, 2022  */

        int year;
        Scanner scan =new Scanner(System.in);

        System.out.print("Input A Year :"+" ");
        year = scan.nextInt();


        if((year %4==0 )&& !(year %400==100)){
            System.out.print(year+" Is A Leap Year");


        }else{
            System.out.print(year+" Is Not A Leap Year");
        }


    
    
    }
    
}
