package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Gaji Karyawan mingguan

        Scanner input  = new Scanner(System.in);
        //Variabel
        double jam, gol, upah;

        //input
        System.out.print("Golongan karyawan (1-4) = ");
        gol = input.nextDouble();
        System.out.print("Jam kerja = ");
        jam = input.nextDouble();

        //kondisi
        if (gol == 1 && jam <=40){
            upah = jam * 3000;
            System.out.println("Upah anda = " + upah);
        } else if (gol == 1 && jam >=40){
            upah = jam * 3000 * 1.5;
            System.out.println("Upah lembur anda = " +upah);
        }else if (gol == 2 && jam <= 40){
            upah = jam * 3500;
            System.out.println("Upah anda = " + upah);
        }else if (gol == 2 && jam >=40){
            upah = jam * 3500 * 1.5;
            System.out.println("Upah lembur anda = " + upah);
        }else if (gol == 3 && jam <= 40){
            upah = jam * 4000;
            System.out.println("Upah anda = " + upah);
        }else if (gol == 3 && jam >=40){
            upah = jam * 4000 * 1.5;
            System.out.println("Upah lembur anda = " + upah);
        }else if (gol == 4 && jam <= 40){
            upah = jam * 5000;
            System.out.println("Upah anda = " + upah);
        }else if (gol == 4 && jam >=40){
            upah = jam * 5000 * 1.5;
            System.out.println("Upah lembur anda = " + upah);
        }

    }
}
