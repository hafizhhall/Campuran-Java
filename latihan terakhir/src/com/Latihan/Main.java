package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// If bersarang
        Scanner input = new Scanner(System.in);

        String transportasi;
        String cuaca;
        String jawaban;

        System.out.print("apakah anda pergi ke kampus (ya/tidak)");
        jawaban = input.nextLine();
        if (jawaban.equals("ya")) {
            System.out.println("Naik motor atau mobil?");
            transportasi = input.nextLine();




        }

    }
}
