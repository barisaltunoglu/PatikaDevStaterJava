package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double amount,taxRate,amounWithTax,tax;

            Scanner input = new Scanner(System.in);
            System.out.print("Ürünün Giyatını Giriniz  : ");
            amount = input.nextDouble();
            taxRate = (amount < 1000) ? 0.18 : 0.08;
            tax = amount * taxRate;
            amounWithTax = amount + tax;
            System.out.println("Üründeki KDV tutarı      : " + tax);
            System.out.println("Ürünün KDV Dahil Fiyatı  : " + amounWithTax);

        }
    }
