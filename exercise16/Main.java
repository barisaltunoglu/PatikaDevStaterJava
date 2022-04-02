package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int k;

        System.out.print("Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         */

        int k, counterFor3 = 0, counterFor4 = 0, counterFor3And4 = 0;
        float total3 = 0, total4 = 0, total3And4 = 0;
        System.out.print("Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();
        System.out.println("------------------------------------------------------");

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i != 0) {
                total3 += i;
                counterFor3++;
            }
            if (i % 4 == 0 && i != 0) {
                total4 += i;
                counterFor4++;
            }
            if (((i % 3 == 0) && (i % 4 == 0)) && i != 0) {
                total3And4 += i;
                counterFor3And4++;
            }
        }
        System.out.println("Üçe bölünen sayıların toplamı                   : " + total3);
        System.out.println("Üçe bölünen sayı adeti                          : " + counterFor3);
        System.out.println("Üç ile tam bölünen sayıların ortalaması         : " + (total3 / counterFor3));
        System.out.println("Dörde bölünen sayıların toplamı                 : " + total4);
        System.out.println("Dörde bölünen sayı adeti                        : " + counterFor4);
        System.out.println("Dört ile tam bölünen sayıların ortalaması       : " + (total4 / counterFor4));
        System.out.println("Üç ve dört bölünen sayıların toplamı            : " + total3And4);
        System.out.println("Üç ve dört bölünen sayı adeti                   : " + counterFor3And4);
        System.out.println("Üç ve dört ile tam bölünen sayıların ortalaması : " + (total3And4 / counterFor3And4));

    }
}
