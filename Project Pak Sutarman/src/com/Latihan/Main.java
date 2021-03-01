package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Program gaji tunjangan PNS
        //scanner
        Scanner input = new Scanner(System.in);
        //Variabel
        double gaji, j, t;

        //mulai
        System.out.print("Gaji Pokok PNS = ");
        gaji = input.nextDouble();
        System.out.print("Jumlah anak = ");
        j = input.nextDouble();

        //Proses
        if (j >= 3){
            t = gaji * 0.3;
            System.out.println("Tunjangan yang didapatkan = " + t);
        }else if (j == 2){
            t = gaji * 0.2;
            System.out.println("Tunjangan yang didapatkan = " + t);
        }else if (j == 1){
            t = gaji * 0.1;
            System.out.println("Tunjangan yang didapatkan = " +t);
        }
//        int a,b,c,d,e,f;
//        a = 18;
//        b = 10;
//        c = 5;
//        d = 0 + c-- + a++;
//        System.out.println(d);
//        e = 12 + ++c - 2 * b++ + d;
//        System.out.println(e);
//        f = (19%3*5) + 11 - ++a;
//        System.out.println(f);
    }
}
