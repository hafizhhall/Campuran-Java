package com.Latihan;

public class Main {

    public static void main(String[] args) {
        int [] data = {110,104, 98, 88, 80, 50, 108, 66,
            117, 56, 109, 73, 97, 97, 86, 88};
insertionInt(data);
insertionMax(data);
}
//TODO : Prosedur Integer
public static void insertionInt( int[] bil){
//TODO : Sebelum
System.out.println("==Sebelum Diurutkan==");
for (int b : bil ){
 System.out.print(b + " ");
}
//TODO : Proses
for (int i = 1; i < bil.length; i++){
 for(int j = i; j > 0; j--){
  if (bil[j] < bil [j-1]){
      int tamp = bil[j];
      bil[j] = bil[j-1];
      bil[j-1] = tamp;
  }
 }
}
//TODO : Sesudah
System.out.println("\n==Sesudah Diurutkan dari Terkecil==");
for (int b : bil ){
 System.out.print(b + " ");
}

}
public static void insertionMax (int[] bil){
//TODO : Sebelum
System.out.println("\n\n==Sebelum Diurutkan==");
for (int b : bil ){
 System.out.print(b + " ");
}
//TODO : Proses
for (int i = 1; i < bil.length; i++){
 for(int j = i; j > 0; j--){
     if (bil[j] > bil [j-1]){
         int tamp = bil[j];
         bil[j] = bil[j-1];
         bil[j-1] = tamp;
     }
 }
}
//TODO : Sesudah
System.out.println("\n==Sesudah Diurutkan dari Terbesar==");
for (int b : bil ){
 System.out.print(b + " ");
}
    }
}
