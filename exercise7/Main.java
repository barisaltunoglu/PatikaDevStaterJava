package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Basşt 4 işlem yapan hesap makinesi");
        int a,b,select;
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        Scanner input = new Scanner(System.in);
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("İlk sayıyı giriniz    : ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                b = input.nextInt();
                System.out.println("Toplam                : " + (a+b));
                break;
            case 2:
                System.out.print("İlk sayıyı giriniz    : ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                b = input.nextInt();
                System.out.println("Farkları              : " + (a -b));
                break;
            case 3:
                System.out.print("İlk sayıyı giriniz    : ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                b = input.nextInt();
                System.out.println("Çarpımları            : " + (a*b));
                break;
            case 4:
                System.out.print("İlk sayıyı giriniz    : ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                b = input.nextInt();
                if(b==0){
                    System.out.println("Bölünen sayı sıfır olamaz.");
                }
                System.out.println("Bölümleri             : " + (a/b));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen geçerli bir sayı giriniz.");
        }
    }
}
