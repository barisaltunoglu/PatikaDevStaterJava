package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        } */

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        n = scan.nextInt();
        System.out.println("----------------------------------------------------");
        System.out.println("Girilen sayıya kadar bulunan 4'ün kuvvetleri : ");
        for( int i = 1 ; i <= n ; i*=4){
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Girilen sayıya kadar bulunan 5'in kuvvetleri : ");
        for (int i = 1; i <= n ; i*=5){
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------");
    }
}
