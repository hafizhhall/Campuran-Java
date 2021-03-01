package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Program HARDCORE
       //Objek
        Scanner input = new Scanner(System.in);
        //Variabel
        String jenis;
        double j, h, d, t;

        //Mulai
        System.out.println("Program Menentukan Jumlah Pembelian");
        System.out.print("Nama Barang = ");
        String barang = input.nextLine();
        System.out.print("Jenis Barang = ");
        jenis = input.nextLine();
        System.out.print("Harga barang = Rp");
        h = input.nextDouble();
        //ekspresi
        if (jenis.equals("Alat Tulis") || jenis.equals("alat tulis") || jenis.equals("Alat tulis")){
            System.out.print("Inputkan Jumlah Barang = ");
            j = input.nextDouble();
            if (j <10){
                System.out.println("Tidak Mendapatkan Diskon");
                t = h * j;
                System.out.println("Total bayar = " + t);
            }else {
                if (j >= 11 && j <= 20){
                    System.out.println("Mendapat Diskon 5%");
                    d = j * h * 0.05;
                    System.out.println("Total diskon yang didapatkan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }if (j >= 21 && j <= 30){
                System.out.println("Mendapat Diskon 7% ");
                d = j * h * 0.07;
                System.out.println("total diskon yang diberikan = " + d);
                t = h * j - d;
                System.out.println("Total yang harus dibayarkan = " + t);
            }else {
                if (j > 30){
                    System.out.println("Mendapat Diskon 10%");
                    d = j * h * 0.1;
                    System.out.println("total diskon yang diberikan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }
        }else if (jenis.equals("Makanan Ringan") || jenis.equals("Makanan ringan") || jenis.equals("makanan ringan")){
            System.out.print("Jumlah barang = ");
            j = input.nextDouble();
            if (j <10){
                System.out.println("Tidak Mendapatkan Diskon");
                t = h * j;
                System.out.println("Total bayar = " + t);
            }else {
                if (j >= 11 && j <= 20){
                    System.out.println("Mendapat Diskon 10%");
                    d = j * h * 0.1;
                    System.out.println("Total diskon yang didapatkan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }if (j >= 21 && j <= 30){
                System.out.println("Mendapat Diskon 15% ");
                d = j * h * 0.15;
                System.out.println("total diskon yang diberikan = " + d);
                t = h * j - d;
                System.out.println("Total yang harus dibayarkan = " + t);
            }else {
                if (j > 30){
                    System.out.println("Mendapat Diskon 20%");
                    d = j * h * 0.2;
                    System.out.println("total diskon yang diberikan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }
        }else if (jenis.equals("Alat rumah tangga") || jenis.equals("Alat Rumah Tangga") || jenis.equals("alat rumah tangga")){
            System.out.print("Jumlah barang = ");
            j = input.nextDouble();
            if (j <10){
                System.out.println("Tidak Mendapatkan Diskon");
                t = h * j;
                System.out.println("Total bayar = " + t);
            }else {
                if (j >= 11 && j <= 20){
                    System.out.println("Mendapat Diskon 5%");
                    d = j * h * 0.05;
                    System.out.println("Total diskon yang didapatkan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }if (j >= 21 && j <= 30){
                System.out.println("Mendapat Diskon 10% ");
                d = j * h * 0.1;
                System.out.println("total diskon yang diberikan = " + d);
                t = h * j - d;
                System.out.println("Total yang harus dibayarkan = " + t);
            }else {
                if (j > 30){
                    System.out.println("Mendapat Diskon 15%");
                    d = j * h * 0.15;
                    System.out.println("total diskon yang diberikan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }
        }else if (jenis.equals("Fashion") || jenis.equals("fashion")){
            System.out.print("Jumlah barang = ");
            j = input.nextDouble();
            if (j <10){
                System.out.println("Tidak Mendapatkan Diskon");
                t = h * j;
                System.out.println("Total bayar = " + t);
            }else {
                if (j >= 11 && j <= 20){
                    System.out.println("Mendapat Diskon 5%");
                    d = j * h * 0.05;
                    System.out.println("Total diskon yang didapatkan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }if (j >= 21 && j <= 30){
                System.out.println("Mendapat Diskon 10% ");
                d = j * h * 0.1;
                System.out.println("total diskon yang diberikan = " + d);
                t = h * j - d;
                System.out.println("Total yang harus dibayarkan = " + t);
            }else {
                if (j > 30){
                    System.out.println("Mendapat Diskon 15%");
                    d = j * h * 0.15;
                    System.out.println("total diskon yang diberikan = " + d);
                    t = h * j - d;
                    System.out.println("Total yang harus dibayarkan = " + t);
                }
            }
        }else {
            System.out.println("Jenis barang tidak dapat ditemukan!!!");
        }
    }
}