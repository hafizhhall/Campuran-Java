package com.Latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// Latihan Menghitung Lingkaran Dengan Scanner

        Scanner userInput = new Scanner(System.in);
        double r, d, pi, k;

        pi = 3.14;

        System.out.print("jari - jari lingkaran = ");
        r = userInput.nextDouble();
        d = 2*r;
        System.out.println("Diameter lingkaran = " + d);

        k = pi*d;
        System.out.print("Keliling lingkaran = " + k);







    }
}
