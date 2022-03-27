package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz  : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz : ");
        day = input.nextInt();

        if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31)) {

            if ((month == 1) && (day <= 21) || (month == 12) && (day >= 22)) {
                System.out.println("Burcunuz oğlak ");
            } else if ((month == 1) || (month == 2) && (day <= 19)) {
                System.out.println("Burcunuz kova ");
            } else if ((month == 2) || (month == 3) && (day <= 20)) {
                System.out.println("Burcunuz balık");
            } else if ((month == 3) || (month == 4) && (day <= 20 )) {
                System.out.println("Burcunuz koç ");
            } else if ((month == 4) || (month == 5) && (day <= 21)) {
                System.out.println("Burcunuz boğa ");
            } else if ((month == 5) || (month == 6) && (day <= 22 )) {
                System.out.println("Burcunuz ikizler");
            } else if ((month == 6) || (month == 7) && (day <= 22)) {
                System.out.println("Burcunuz yengeç ");
            } else if ((month == 7) || (month == 8) && (day <= 22)) {
                System.out.println("Burcunuz aslan ");
            } else if ((month == 8) || (month == 9) && (day <= 22 )) {
                System.out.println("Burcunuz başak ");
            } else if ((month == 9) || (month == 10) && (day <= 22 )) {
                System.out.println("Burcunuz terazi ");
            } else if ((month == 10) || (month == 11) && (day <= 21 )) {
                System.out.println("Burcunuz akrep");
            } else if (month == 12) {
                System.out.println("Burcunuz oğlak ");
            }
        } else {
            if ((month > 12 || month <= 0) && ( day > 0 && day <= 31)) {
                System.out.println("Lütfen geçerli bir ay değeri giriniz !");
            } else if ( (day > 31 || day <= 0) && ( month <= 12 && month > 0) ) {
                System.out.println("Lüfen geçerli bir gün değeri giriniz !");
            }else {
                System.out.println("Lütfen geçerli ay ve gün değerleri giriniz !");
            }
        }
    }
}
