package com.Tugas;
public class Main {
    public static void main(String[] args) {
        int [] bilangan = {6, 9, -8, 24, -99};
        String [][] hari = {
                {"Senin","Selasa","Rabu","Kamis","jumat","Sabtu","Minggu"},
                {"Senin","Selasa","Rabu","Kamis","jumat","Sabtu","Minggu"},
                {"Senin","Selasa","Rabu","Kamis","jumat","Sabtu","Minggu"},
                {"Senin","Selasa","Rabu","Kamis","jumat","Sabtu","Minggu"},
                {"Senin","Selasa","Rabu","Kamis","jumat","Sabtu","Minggu"},
                {"Senin","Selasa","Rabu","Kamis","jumat","Sabtu","Minggu"},
                {"Senin","Selasa","Rabu","Kamis","jumat","Sabtu","Minggu"}
        };
        System.out.println("Isi array Bilangan Pertama: " + bilangan[0]);
        System.out.println("Isi array Bilangan kedua: " + bilangan[1]);
        System.out.println("Isi array Bilangan ketiga: " + bilangan[2]);
        System.out.println("Isi array Bilangan keempat: " + bilangan[3]);
        System.out.println("Isi array Bilangan kelima: " + bilangan[4]);
        for (int i = 0; i < 7 ; i++){
            for (int j = 0; j < hari.length; j++)
            System.out.println("Hari: " + hari[i][j]);
            System.out.println("\n");
        }


    }
}
