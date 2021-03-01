package com.Tugas;

public class Main {
    public static void main(String[] args) {

	// Tugas Array
        //Soal Nomor 1
        String[] Presiden = {
                " ",
                "Soekarno",
                "Soeharto",
                "BJ Habibie",
                "Abdurrahman Wahid",
                "Megawati Soekarno Putri",
                "Susilo Bambang Yudhoyono",
                "Joko Widodo"
        };
        System.out.println("Soal nomor 1");
        for(int i = 1;i < Presiden.length; i++){
            System.out.println("Presiden RI ke-"+i+" "+ Presiden[i]);
        }





        //Soal Nomor 2
        System.out.println("\nSoal Nomor 2");

        System.out.println();
        String[][] item = {
                {"7DsxQ", "Sound JBL"},
                {"Dc1S9", "Kipas Angin Miyako"},
                {"dq3nH", "Radio"}
        };
        int[][] jumlah = {
                {1_200_000 ,12},
                {320_000, 31},
                {1_000_000, 21}
        };
        int x = 0;
        do{
            System.out.println("ID Barang: " + item[x][0]);
            System.out.println("Nama Barang: " + item[x][1]);
            System.out.println("Harga: " + jumlah[x][0]);
            System.out.println("stok: " + jumlah[x][1]);

            x++;
            System.out.println();
        }while (x < jumlah.length);

    }
}
