package com.tutorial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Athallah Imran Ahmad Dzulfikar
        //5200311076,

        String jawaban, jenis, pilihan;

        int jb, hb, t, ph, T;

        System.out.println("Promo launching Rita Pasaraya di kota B");
        System.out.println("Promo berupa diskon berdasarkan kartu member");
        System.out.println("Apakah pelanggan memiliki kartu member ?");
        System.out.println("Punya (P) atau Tidak (T)?");
        jawaban = sc.nextLine();

        if (jawaban.equals("P") || jawaban.equals("p")){
            System.out.println("Pelanggan mendapatkan promo");
            System.out.println();
            System.out.println("Daftar jenis kartu member = ");
            System.out.println("1. Platinum (P)");
            System.out.println("2. Gold (G)");
            System.out.println("3. Silver (S)");
            System.out.print("Jenis kartu member pelanggan = ");
            jenis = sc.nextLine();

            switch (jenis) {
                case "P":
                case "p":
                    System.out.println("Pelanggan mendapat diskon 25% tanpa minimum belanja");
                    System.out.println();
                    System.out.println("Daftar barang yang tersedia = ");
                    System.out.println("1. Kaos Oblong  = Rp 80.000");
                    System.out.println("2. Kaos Polo    = Rp 100.000");
                    System.out.println("3. Celana Jeans = Rp 145.000");
                    System.out.println("4. Jaket Jeans  = Rp 165.000");
                    System.out.println("5. Jas          = Rp 135.000");
                    System.out.println();
                    System.out.print("Barang yang dibeli pelanggan = ");
                    pilihan = sc.nextLine();
                    System.out.print("Jumlah barang yang dibeli pelanggan = ");
                    jb = sc.nextInt();
                    System.out.print("Harga barang = Rp ");
                    hb = sc.nextInt();
                    t = jb * hb;
                    System.out.println("Total belanjaan = Rp " + t);
                    ph = (int) (t * 0.25);
                    System.out.println("Potongan harga yang didapat = Rp " + ph);
                    T = t - ph;
                    System.out.println("Total yang harus dibayar = Rp " + T);
                    break;
                case "G":
                case "g":
                    System.out.println("Pelanggan mendapat diskon 15% dengan minimum belanja Rp 250000");
                    System.out.println("Pelanggan mendapat diskon 5% dengan minimum belanja kurang dari Rp 250000");
                    System.out.println();
                    System.out.println("Daftar barang yang tersedia = ");
                    System.out.println("1. Kaos Oblong  = Rp 80.000");
                    System.out.println("2. Kaos Polo    = Rp 100.000");
                    System.out.println("3. Celana Jeans = Rp 145.000");
                    System.out.println("4. Jaket Jeans  = Rp 165.000");
                    System.out.println("5. Jas          = Rp 135.000");
                    System.out.println();
                    System.out.print("Barang yang dibeli pelanggan = ");
                    pilihan = sc.nextLine();
                    System.out.print("Jumlah barang yang dibeli pelanggan = ");
                    jb = sc.nextInt();
                    System.out.print("Harga barang = Rp ");
                    hb = sc.nextInt();
                    t = jb * hb;
                    System.out.println("Total belanjaan = Rp " + t);

                    if (t > 2500000) {
                        ph = (int) (t * 0.15);
                        System.out.println("Potongan harga yang didapat = Rp " + ph);
                        T = t - ph;
                        System.out.println("Total yang harus dibayar = Rp " + T);

                        if (t < 250000) {
                            ph = (int) (t * 0.5);
                            System.out.println("Potongan harga yang didapat = Rp " + ph);
                            T = t - ph;
                            System.out.println("Total yang harus dibayar = Rp " + T);
                        }
                    }
                    break;
                case "S":
                case "s":
                    System.out.println("Pelanggan mendapat diskon Rp 75000 dengan minimum belanja Rp 150000");
                    System.out.println();
                    System.out.println("Daftar barang yang tersedia = ");
                    System.out.println("1. Kaos Oblong  = Rp 80.000");
                    System.out.println("2. Kaos Polo    = Rp 100.000");
                    System.out.println("3. Celana Jeans = Rp 145.000");
                    System.out.println("4. Jaket Jeans  = Rp 165.000");
                    System.out.println("5. Jas          = Rp 135.000");
                    System.out.println();
                    System.out.print("Barang yang dibeli pelanggan = ");
                    pilihan = sc.nextLine();
                    System.out.print("Jumlah barang yang dibeli pelanggan = ");
                    jb = sc.nextInt();
                    System.out.print("Harga barang = Rp ");
                    hb = sc.nextInt();
                    t = jb * hb;
                    System.out.println("Total belanjaan = Rp " + t);

                    if (t > 150000) {
                        ph = t - 750000;
                        System.out.println("Potongan harga yang didapat = Rp " + ph);
                        T = t - ph;
                        System.out.println("Total yang harus dibayar = Rp " + T);
                    }
                    break;
                default:
                    System.out.println("NOT VALID");
                    break;
            }
        }
        else if (jawaban.equals("T") || jawaban.equals("t")){
            System.out.println("Pelanggan tidak mendapatkan promo");
        }
        else {
            System.out.println("NOT VALID");
        }

    }
}
