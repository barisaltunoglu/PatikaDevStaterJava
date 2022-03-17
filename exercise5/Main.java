package patika.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float weight,length,BMI;
	Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu mertre cinsinden giriniz      : ");
        length = input.nextFloat();
        System.out.print("Lütfen kilogram cinsinden ağırlığınızı giriniz: ");
        weight = input.nextFloat();
        BMI = (weight)/(length*length);
        System.out.println("Vücut kitle indeksiniz                        : " + BMI);
    }
}
