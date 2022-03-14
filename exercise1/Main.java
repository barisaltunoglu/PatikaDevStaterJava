package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double physic, mathemathic, chemistry,turkish,history,music,average;
        Scanner input = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz: ");
        physic = input.nextDouble();
        System.out.println("Matematik notunuzu giriniz: ");
        mathemathic = input.nextDouble();
        System.out.println("Kimya notunuzu giriniz: ");
        chemistry = input.nextDouble();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkish = input.nextDouble();
        System.out.println("Tarih notunuzu giriniz: ");
        history = input.nextDouble();
        System.out.println("Müzik notunuzu giriniz: ");
        music = input.nextDouble();
        average = (physic+mathemathic+chemistry+turkish+history+music)/6;
        System.out.print("Ortalamanız:" + average +" Geçme Durumu:");
        System.out.print(average> 60 ? " Geçti" : " Kaldı");
    }
}
