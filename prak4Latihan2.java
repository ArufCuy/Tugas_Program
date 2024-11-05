
package prak4laatihan2;

import java.util.Scanner;
public class Prak4Laatihan2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris (m): ");
        int m = input.nextInt();
        System.out.print("Masukkan jumlah kolom (n): ");
        int n = input.nextInt();

        int[][] matriks1 = new int[m][n];
        int[][] matriks2 = new int[m][n];
        int[][] hasil = new int[m][n];

        // Input matriks 1
        System.out.println("Masukkan matriks 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matriks1[" + i + "][" + j + "]: ");
                matriks1[i][j] = input.nextInt();
            }
        }

        // Input  matriks 2
        System.out.println("Masukkan matriks 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matriks2[" + i + "][" + j + "]: ");
                matriks2[i][j] = input.nextInt();
            }
        }

        // Penjumlahan
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        // Menampilkan hasil 
        System.out.println("Hasil penjumlahan kedua matriks:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
