package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.println("Çin Zodyağına Göre Burç Hesaplama");
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();

        if (year % 12 == 0) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Maymun");
        } else if (year % 12 == 1) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Horoz");
        } else if (year % 12 == 2) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Köpek");
        } else if (year % 12 == 3) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Domuz");
        } else if (year % 12 == 4) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Fare");
        } else if (year % 12 == 5) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Öküz");
        } else if (year % 12 == 6) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Kaplan");
        } else if (year % 12 == 7) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Tavşan");
        } else if (year % 12 == 8) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Ejderha");
        } else if (year % 12 == 9) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Yılan");
        } else if (year % 12 == 10) {
            System.out.println("Çin Zodyağına Göre Burcunuz : At");
        } else if (year % 12 == 11) {
            System.out.println("Çin Zodyağına Göre Burcunuz : Koyun");
        } else {
            System.out.println("Lütfen Pozitif Tamsayı Giriniz !");
        }
/*
        switch (year%12){
            case 0:
                System.out.println("Çin Zodyağına Göre Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağına Göre Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağına Göre Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağına Göre Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağına Göre Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağına Göre Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağına Göre Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağına Göre Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağına Göre Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağına Göre Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağına Göre Burcunuz : At");
                break;
            case 11:
                System.out.println("Çin Zodyağına Göre Burcunuz : Koyun");
                break;
            default:
                System.out.println("Lütfen Pozitif Tamsayı Giriniz !");

        }
 */

    }
}
