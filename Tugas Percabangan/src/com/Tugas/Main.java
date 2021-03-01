package com.Tugas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// Objek dari scanner
        Scanner inputUser = new Scanner(System.in);

        float berat;
        System.out.println("Nama = Hafizh Athallah Widianto");
        System.out.println("NPM  = 5200311097");
        System.out.println("============================================");
        System.out.print("Masukkan berat badan anda dalam satuan Kg = ");
        berat = inputUser.nextFloat();

        if (berat >=90){
            System.out.println("Berat badan anda termasuk Gemuk");
        }
        else if (berat >=70){
            System.out.println("Berat badan anda termasuk ideal");
        }
        else if (berat >=55){
            System.out.println("Berat badan anda termasuk kurus");
        }
        else {
            System.out.println("anda perlu makan yang banyak");
        }

    }
}
