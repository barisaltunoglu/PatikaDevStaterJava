package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float r,a,formula;

        Scanner input = new Scanner(System.in);
        System.out.println("Daire diliminin alanını bulan program");
        System.out.print("Yarıçap değerini giriniz : ");
        r = input.nextFloat();
        System.out.print("Açı değerini giriniz     : ");
        a = input.nextFloat();
        formula = (float) (( Math.PI* (r*r)*a) / 360);
        System.out.println("Daire diliminin alanı    : " + formula);

    }
}
