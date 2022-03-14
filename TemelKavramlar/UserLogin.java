import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String user, pass;
        String yes, no;

        Scanner scan = new Scanner(System.in);

        System.out.print("Your User Name :");
        user = scan.nextLine();

        System.out.print("Your Password :");
        pass = scan.nextLine();

        if (user.equals("patika") && pass.equals("java101")) {
            System.out.print("Başarı İle Giriş Yaptınız!");

        } else if (!pass.equals("java101")) {
            System.out.println("Şifrenizi Yanlış Girdiniz!");

            System.out.print("Şifrenizi Değiştirmek İstermisiniz ?\n(Evet/Hayır :)");
            String cPass;
            cPass = scan.nextLine();

            switch (cPass) {

                case "e", "evet", "Evet":
                    System.out.print("New Password :");
                    String npass = scan.nextLine();
                    if (npass.equals("java101")) {
                        System.out.print("Yeni Şifre Eski Şifre İle Aynı Olamaz!");
                    } else {
                        System.out.print("Şifreniz Başarı İle Değiştirildi.");
                    }
                default:
                    System.out.print("Yeniden Giriş Yapmayı Deneyiniz.");
                    break;

            }

        }

    }

}
