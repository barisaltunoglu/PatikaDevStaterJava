package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Artık Yıl Olup/Olmadığını Öğrenmek İstediğiiz Yılı Giriniz : ");
        year = input.nextInt();

        if (year%4==0){
            System.out.println(year + " yılı bir artık yıldır.");
        }else {
            System.out.println( year + " yılı bir artık yıl değildir.");
        }

    }
}
