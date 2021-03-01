package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Scanner
        Scanner input = new Scanner(System.in);

        //Variabel
        int j1,m1,j2,m2,j3,m3,waktu1,waktu2,selisih,sisa;
        System.out.println("lama bekerja seorang pegawai");
        //masuk
        System.out.println("Jam berapa anda masuk? ");
        System.out.print("Jam = ");
        j1 = input.nextInt();
        System.out.print("Menit = ");
        m1 = input.nextInt();

        //keluar
        System.out.println("Jam berapa anda keluar? ");
        System.out.print("Jam = ");
        j2 = input.nextInt();
        System.out.print("Menit = ");
        m2 = input.nextInt();

        //proses
        waktu1=(3600*j1)+(60*m1);
        waktu2=(3600*j2)+(60*m2);
        selisih = waktu2 - waktu1;

        j3=selisih/3600;
        sisa=selisih%3600;
        m3=sisa/60;

        if (j3 == 0){
            System.out.println("\nLama bekerja = " +m3+ " Menit");
        }else if (m3 == 0){
            System.out.println("\nLama bekerja = " +j3+ " Jam");
        }else {
            System.out.println("\nLama bekerja = " +j3+ " : " +m3+ " Menit");
        }



    }
}
