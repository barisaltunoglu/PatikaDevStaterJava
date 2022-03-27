package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("a sayısını giriniz   : ");
        a = input.nextInt();

        System.out.print("b sayıyısını giriniz : ");
        b = input.nextInt();

        System.out.print("c sayıyısını giriniz : ");
        c = input.nextInt();

        //Büyükten küçüğe sıralama
        /*
        if(a > b && a > c){
            if(b>c){
                System.out.println("a > b > c");
            }
            else{
                System.out.println("a > c > b");
            }
        }
        else if ( b > a && b > c) {
            if ((a > c)) {
                System.out.println("b > a >c");
            } else {
                System.out.println("b > c > a");
            }
        }
        else if (c > b && c >a){
            if (a > b){
                    System.out.println("c > a > b");
                }
                else {
                    System.out.println("c > b > a");
                }
            }
        */

        //Küçükten büyüğe sıralama

        if( a < c && b < c ){
            if (b < a){
                System.out.println("b < a < c");
            }
            else {
                System.out.println("a < b < c");
            }
        }
        else if (a < b && c < b){
            if(a < c){
                System.out.println(" a < c < b");
            }
            else{
                System.out.println("c < a < b");
            }
        }
        else if (c < a && b < a){
            if (c < b){
                System.out.println("c < b < a");
            }
            else{
                System.out.println("b < c < a");
            }
        }


        }
 }

