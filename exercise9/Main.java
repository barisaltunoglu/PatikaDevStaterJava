package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mathematics, physics, turkish, chemistry, music,total=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen notlarınızı 0-100 aralığında giriniz.");
        System.out.print("Matematik notunuz : ");
        mathematics = input.nextInt();
        if ( 0 <= mathematics && mathematics <= 100){
            total += mathematics;
        }
        else {
            System.out.println("Belitilen aralıkta bir not girmediğiniz için ortalamaya katılmayacaktır !");
        }
        System.out.print("Fizik notunuz     : ");
        physics = input.nextInt();
        if ( 0 <= physics && physics <= 100){
            total += physics;
        }
        else {
            System.out.println("Belitilen aralıkta bir not girmediğiniz için ortalamaya katılmayacaktır !");
        }

        System.out.print("Türkçe notunuz    : ");
        turkish = input.nextInt();
        if ( 0 <= turkish && turkish <= 100){
            total += turkish;
        }
        else {
            System.out.println("Belitilen aralıkta bir not girmediğiniz için ortalamaya katılmayacaktır !");
        }

        System.out.print("Kimya notunuz     : ");
        chemistry = input.nextInt();
        if ( 0 <= chemistry && chemistry <= 100){
            total += chemistry;
        }
        else {
            System.out.println("Belitilen aralıkta bir not girmediğiniz için ortalamaya katılmayacaktır !");
        }

        System.out.print("Müzik notunuz     : ");
        music = input.nextInt();
        if ( 0 <= music && music <= 100){
            total += music;
        }
        else {
            System.out.println("Belitilen aralıkta bir not girmediğiniz için ortalamaya katılmayacaktır !");
        }

        double average;
        average = total / 5;

        if(average <= 55){
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere !");
        }
        else{
            System.out.println("Tebrikler, sınıfı geçtiniz !");
        }
        System.out.println("Ortalamanız       : " + average);

    }
}
