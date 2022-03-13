import java.util.Scanner;
/*
-Yaricapi r, merkez acisinin olcusu 𝛼 olan daire diliminin alanini bulan program
-𝜋 sayisi = 3.14
-Formul : (𝜋 * (r*r) * 𝛼) / 360
 */
public class circleAreaFinder {
    public static void main(String[] args) {

        /** @Author Omer Ozekin, 2022  */
        
        int r;
        double pi=3.14;
        double dilim;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Yarı Çap Giriniz :");
        r = girdi.nextInt();
        System.out.print("Merkez Açısını Giriniz :");
        dilim = girdi.nextDouble();

        
        double alan = pi * r * r;
        double cevre = 2 * pi * r ;
        dilim = (pi*(r*r)*dilim)/360;


        System.out.println("Dairenin Alanı :"+alan);
        System.out.println("Dairenin Çevresi :"+cevre);
        System.out.println("Merkez Açısı :"+dilim);




    }
    
}
