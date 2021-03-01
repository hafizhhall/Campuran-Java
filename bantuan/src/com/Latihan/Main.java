package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Praktikum Computer Programming
        Scanner input = new Scanner(System.in);

        //Variabel
        int n;

        //Mulai Program
        System.out.print("Inputkan bilangan n = ");
        n = input.nextInt();

        //ekspresi
        switch (n) {
            case 3:
                System.out.println("1 4 9");
                break;
            case 4:
                System.out.println("1 4 9 16");
        }
    }
}
