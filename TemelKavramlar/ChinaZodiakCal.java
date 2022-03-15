import java.util.Scanner;

public class ChinaZodiakCal {

    public static void main(String[] args) {
        int birth;
        Scanner scan = new Scanner(System.in);

        System.out.print("Year Of Birth :");
        birth = scan.nextInt();

        switch (birth % 12) {

            case 0:
                System.out.print("Your Chinese Zodiak : "+" Monkey");
                break;

            case 1:
                System.out.print("Your Chinese Zodiak : "+" Cockerel");
                break;

            case 2:
                System.out.print("Your Chinese Zodiak : "+" Dog");
                break;

            case 3:
                System.out.print("Your Chinese Zodiak : "+" Pig");
                break;

            case 4:
                System.out.print("Your Chinese Zodiak : "+" Mouse");
                break;

            case 5:
                System.out.print("Your Chinese Zodiak : "+" Ox");
                break;

            case 6:
                System.out.print("Your Chinese Zodiak : "+" Tiger");
                break;

            case 7:
                System.out.print("Your Chinese Zodiak : "+" Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese Zodiak : "+" Dragon");
                break;
            case 9:
                System.out.print("Your Chinese Zodiak : "+" Snake");
                break;
            case 10:
                System.out.print("Your Chinese Zodiak : "+" Horse");
                break;
            case 11:
                System.out.print("Your Chinese Zodiak : "+" Sheep");
                break;

        }
    }
}