package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int n, toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz :");
            n = input.nextInt();
            if (n % 2 == 1) {
                toplam += n;
            }
        } while (n > 0);
        System.out.println("Tek sayıların toplamı : " + toplam);
         */

        int n, totalEven = 0, total4 = 0, totalEvenAnd4=0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz : ");
            n = scan.nextInt();
            if (n % 2 == 0) {
                totalEven += n;
            }
            if (n % 4 == 0) {
                total4 += n;
            }

        } while (n % 2 == 0);

        System.out.println("-------------------------------------------");
        System.out.println("Çift Sayıların Toplamı             : " + totalEven);
        System.out.println("Dördün katı olan sayıların toplamı : " + total4);
        System.out.println("-------------------------------------------");

    }
}
