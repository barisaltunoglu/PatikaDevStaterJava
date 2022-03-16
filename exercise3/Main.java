package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float a,b,c,u,perimeter;
	Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını giriniz    :" );
        a = input.nextFloat();
        System.out.print("Üçgenin ikinci kenarını giriniz :" );
        b = input.nextFloat();
        System.out.print("Üçgenin üçüncü kenarını giriniz :" );
        c = input.nextFloat();
        u = (a + b + c)/2;
        perimeter = (float) Math.sqrt( u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin çevresi                 :" + perimeter);
    }
}
