import java.util.Scanner;

public class Tugas3_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = scanner.nextInt();
        
        int totalBarangSeluruhToko = 0;
        int maxTotalBarang = -1;
        int tokoMaxBarang = 0;
        
        int[] arrPelanggan = new int[jumlahToko + 1];
        int[] arrTotalBarangToko = new int[jumlahToko + 1];
        
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
            int jumlahPelanggan = scanner.nextInt();
            arrPelanggan[i] = jumlahPelanggan;
            
            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Masukkan jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                int jumlahBarang = scanner.nextInt();
                totalBarangToko += jumlahBarang;
            }
            
            arrTotalBarangToko[i] = totalBarangToko;
            totalBarangSeluruhToko += totalBarangToko;
            
            if (totalBarangToko > maxTotalBarang) {
                maxTotalBarang = totalBarangToko;
                tokoMaxBarang = i;
            }
        }
        
        System.out.println("\nRingkasan yang diharapkan:");
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i + " - pelanggan: " + arrPelanggan[i] + ", total barang: " + arrTotalBarangToko[i]);
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoMaxBarang);
        
        scanner.close();
    }
}