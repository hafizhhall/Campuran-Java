package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Nama :Hafizh Athallah Widianto
        //NPM  : 5200311097
        //Variabel yang dibutuhkan
        String jenis;
        double diskon, total;
        double oblong, polo,celana, jaket, jas, jumlah;

        //Mulai
        System.out.println("Kasir Toko Rita Pasaraya");
        System.out.println("Daftar Jenis Member : ");
        System.out.println("    Platinum");
        System.out.println("    Gold");
        System.out.println("    Silver");
        System.out.print("Jenis Member Anda = ");
        jenis = input.nextLine();
        System.out.println("============================");
        System.out.println("Barang Yang Tersedia =");
        System.out.println("Kaos Oblong : Rp 80.000");
        System.out.print("jumlah item yang dibeli = ");
        oblong = input.nextInt();
        System.out.println("Kaos Polo : Rp 100.000");
        System.out.print("jumlah item yang dibeli = ");
        polo = input.nextInt();
        System.out.println("Celana Jeans : Rp 145.000");
        System.out.print("jumlah item yang dibeli = ");
        celana = input.nextInt();
        System.out.println("Jaket Jeans  Rp 165.000");
        System.out.print("jumlah item yang dibeli = ");
        jaket = input.nextInt();
        System.out.println("Jas : Rp 135.000");
        System.out.print("jumlah item yang dibeli = ");
        jas = input.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        jumlah = (oblong*80000) + (polo*100000) + (celana*145000) + (jaket*165000) + (jas*135000);
        System.out.println("Total belanjaan yang dibeli = Rp" + jumlah);

        switch (jenis) {
            case "platinum":
            case "Platinum":
                System.out.println("Mendapat Diskon 25% tanpa minimum belanja");
                diskon = jumlah * 0.25;
                System.out.println("Diskon yang anda dapatkan = Rp" + diskon);
                total = jumlah - diskon;
                System.out.println("Total yang harus dibayarkan = Rp" + total);
                break;
            case "gold":
            case "Gold":
                if (jumlah >= 250000) {
                    diskon = jumlah * 0.15;
                    System.out.println("Anda Mendapat Diskon 15%");
                    System.out.println("Diskon yang anda dapatkan = Rp" + diskon);
                    total = jumlah - diskon;
                    System.out.println("Total yang harus dibayarkan = Rp" + total);
                } else if (jumlah <= 250000) {
                    diskon = jumlah * 0.05;
                    System.out.println("Anda Mendapatkan Diskon 5%");
                    System.out.println("Diskon yang anda dapatkan = Rp" + diskon);
                    total = jumlah - diskon;
                    System.out.println("Total yang harus dibayarkan = Rp" + total);
                }
                break;
            case "silver":
            case "Silver":
                if (jumlah >= 150000) {
                    System.out.println("Anda mendapatkan potongan harga sebesar Rp75.000 ");
                    total = jumlah - 75000;
                    System.out.println("Total yang harus dibayarkan = Rp" + total);
                } else if (jumlah <= 150000) {
                    System.out.println("Anda Tidak Mendapatkan Potongan Harga!!!");
                    System.out.println("Total yang harus dibayarkan = Rp" + jumlah);
                }
                break;
            default:
                System.out.println("Daftar kartu member tidak tersedia");
                break;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
