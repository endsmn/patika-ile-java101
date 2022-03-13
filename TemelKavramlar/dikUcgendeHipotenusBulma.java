import java.util.Scanner;
/*
Üç kenar uzunluğunu kullanıcıdan aldığınız
üçgenin alanını hesaplayan program.
*/
public class Hipotenüs {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
       
        System.out.print("1. Kenar Uzunluğunu Giriniz : ");
        a = input.nextInt();
       
        System.out.print("2. Kenar Uzunluğunu Giriniz :" );
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Alan : "+c);



        


    }
    
}
