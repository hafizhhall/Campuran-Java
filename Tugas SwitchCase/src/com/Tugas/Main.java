package com.Tugas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Nama :Hafizh Athallah Widianto
    //NPM  :5200311097

        //objek
        Scanner input = new Scanner(System.in);

        //Variabel
        int p,l; //variabel persegi panjang
        int s,L; //variabel persegi
        float q,a,t;// segitiga sama sisi

        //mulai
        System.out.print("Pilih angka 1 - 3 = ");
        String rumus = input.next();

        //ekspresi
        switch(rumus) {
            case "1":
                System.out.println("Menghitung Luas persegi panjang");
                System.out.print("Masukkan panjang = ");
                p = input.nextInt();

                System.out.print("Masukkan lebar = ");
                l = input.nextInt();

                L = p * l;
                System.out.println("Tampilkan hasil Luas Persegi Panjang = " + L);
                break;
            case "2":
                System.out.println("Menghitung luas persegi");
                System.out.print("Masukkan sisi = ");
                s = input.nextInt();

                L = s * s;
                System.out.println("Tampilkan hasil luas persegi = " + L);
                break;
            case "3":
                System.out.println("Menghitung luas segitiga sama sisi");
                System.out.print("Masukkan alas segitiga sama sisi = ");
                a = input.nextInt();

                System.out.print("Masukkan tinggi segitiga sama sisi = ");
                t = input.nextInt();

                q = (float) (0.5 * a * t);
                System.out.println("Tampilkan hasil luas segitiga sama sisi = " + q);
                break;
            default:
                System.out.println("Rumus tidak tersedia");
                break;


        }



    }
}
