package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        /*if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız !");
        }
        else{
            System.out.println("Bilgileriniz yanlış !");
        }
        */

        if(userName.equals("patika")){
            if(password.equals("java123")){
                System.out.println("Başarıyla Giriş Yaptınız !");
            }
            else {
                System.out.print("Yanlış şifre girdiniz. Şifrenizi Sıfırlamak ister misiniz ?\nEvet için Y, hayır için N'ye basınız:");
                String Y = "Y", N = "N", newPassword;
                String str = input.nextLine();
                if (str.equalsIgnoreCase(Y)){
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    newPassword = input.nextLine();
                    if(newPassword.equals(password)){
                        System.out.println("Yeni şifre ile hatalı girilen şifre ile aynı aynı olamaz !\nŞifre oluşturulamadı, lütfen başka şifre giriniz. ");
                    }
                    else if (newPassword.equals("java123")){
                        System.out.println("Yeni şifre, eski şifre ile aynı olamaz !\nŞifre oluşturulamadı, lütfen başka şifre giriniz. ");
                    }
                    else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
                else {
                    System.out.println("Çıkış yapılıyor.");
                }
            }
        }
        else{
            System.out.println("Kullanıcı adını eksik veya hatalı girdiniz !");
        }


    }
}
