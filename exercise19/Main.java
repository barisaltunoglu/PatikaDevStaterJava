package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyelini bulmak istediğiniz sayıyı giriniz : ");
        int n = input.nextInt();
        int total = 1;
        int i = 1;

        -For Döngüsü ile faktöriyel hesaplama

        for (int i =1 ; i <=n ; i++){
            total = total*i;
        }
        System.out.println( n + ". Faktöriyel :" + total);

        -While Döngüsü ile Faktöriyel Hesaplama

        while (i <= n) {
            total = total * i;
            i++;
        }
        System.out.println(n + ". Faktöriyel :" + total);
        */

        // C(n,r)'yi Hesaplayan Program

        double totaln = 1;
        double totalr = 1;
        double totalnr = 1;
        System.out.println("n'in r'li komabinasyonunu hesaplayan program : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 'n' sayısını giriniz : ");
        int n = input.nextInt();
        System.out.print("Lütfen 'r' sayısını giriniz : ");
        int r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }
        for (int i = 1; i <= r; i++) {
            totalr *= i;
        }
        for (int i = 1; i <= (n-r) ; i++) {
            totalnr *= i;
        }

        double combination = totaln / (totalr * (totalnr));
        System.out.println("n" + "'in " + "r" + "'li " + "kombinasyonu :" + combination);
        input.close();


    }
}
