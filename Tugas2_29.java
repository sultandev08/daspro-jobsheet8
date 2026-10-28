import java.util.Scanner;

public class Tugas2_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = scanner.nextInt();
        
        int jumlahSeluruhAngka = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahSeluruhAngka += hasil;
            }
            System.out.println();
        }
        
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        scanner.close();
    }
}