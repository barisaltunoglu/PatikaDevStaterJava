package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double amountOfPearPerKg = 2.14, amountOfApplePerKg = 3.67, amountOfTomatoPerKg = 1.11, amountOfBananaPerKg = 0.95,
            amountOfAuberginePerKg = 5;
	double pear, apple, tomato, banana, aubergine, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilogram armut aldınız      : ");
        pear = input.nextDouble();
        System.out.print("Kaç kilogram elma aldınız ?     : ");
        apple = input.nextDouble();
        System.out.print("Kaç kilogram domates aldınız ?  : ");
        tomato = input.nextDouble();
        System.out.print("Kaç kilogram muz aldınız ?      : ");
        banana = input.nextDouble();
        System.out.print("Kaç kilogram patlıcan aldınız ? : ");
        aubergine = input.nextDouble();
        total = pear*amountOfPearPerKg + apple*amountOfApplePerKg + tomato*amountOfTomatoPerKg + banana*amountOfBananaPerKg
                + aubergine*amountOfAuberginePerKg;
        System.out.println("-----------------------------------");
        System.out.println("Toplam Tuar : " + total + " TL");


    }
}
