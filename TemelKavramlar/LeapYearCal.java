import java.util.Scanner;

public class LeapYearCal {
    public static void main(String[] args) {
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
