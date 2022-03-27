package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double km, fare, ageDiscountRate, discountOfAge, discountOfType;
        int age, typeOfTrip;

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi 'km' olarak yazınız : ");
        km = input.nextInt();
        if (km >= 0) {
        fare = km * 0.10;
        System.out.print("Yaşınızı giriniz                         : ");
        age = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz\n1-Tek Yön\n2-Gidiş/Dönüş\nYolculuk Tipi                            : ");
        typeOfTrip = input.nextInt();
        System.out.println("------------------------------------------------");
            if (age < 12) {
                ageDiscountRate = 0.50;
            } else if (12 <= age && age <= 24) {
                ageDiscountRate = 0.10;
            } else if (age > 65) {
                ageDiscountRate = 0.30;
            } else {
                ageDiscountRate = 0;
            }
            switch (typeOfTrip) {
                case 2:
                    System.out.println("İndirimsiz bilet tutarı     : " + fare + " TL");
                    discountOfAge = fare * ageDiscountRate;
                    System.out.println("Yaş İndirimi                : " + discountOfAge + " TL");
                    discountOfType = (fare - discountOfAge) * 0.20;
                    System.out.println("Gidiş-Dönüş İndirim Tutarı  : " + discountOfType + " TL");
                    System.out.println("Toplam Tutar                : " + (fare - discountOfAge - discountOfType) * 2 + " TL");
                    break;
                case 1:
                    System.out.println("İndirimsiz bilet tutarı     : " + fare + " TL");
                    discountOfAge = fare * ageDiscountRate;
                    System.out.println("Yaş İndirimi                : " + discountOfAge + " TL");
                    discountOfType = (fare - discountOfAge) * 0;
                    System.out.println("Gidiş-Dönüş İndirim Tutarı  : " + discountOfType + " TL");
                    System.out.println("Toplam Tutar                : " + (fare - discountOfAge - discountOfType) + " TL");
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz !\nLütfen size verilen seçeneklerden birini seçiniz !");
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz ! \nLütfen Pozitif Bir Sayı Giriniz !");
        }
    }
}
