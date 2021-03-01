package com.Responsi;
public class Main {
    public static void main(String[] args) {
        int [] data = {110,104, 98, 88, 80, 50, 108, 66,
                       117, 56, 109, 73, 97, 97, 86, 88};
        int max = 0;
        int min = 0;
        System.out.print("Angka: ");
        for (int b : data ){
            System.out.print(b + " ");
        }
        for(int i = 0; i < data.length; i++){
            if (i == 0){
                max = data[1];
                min = data[1];
            }
            if (data[i] > max) max = data[i];
            if (data[i] < min) min = data[i];
        }
        System.out.println("\n\nNilai Terbesar: " + max);
        System.out.println("Nilai Terkecil: " + min);
    }
}
