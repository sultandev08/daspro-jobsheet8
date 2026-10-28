import java.util.Scanner;

public class Tugas1_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = scanner.nextInt();
        
        int totalAngka = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + (j == i ? "" : " "));
                totalAngka++;
            }
            System.out.println();
        }
        
        System.out.println("Total angka tercetak: " + totalAngka);
        scanner.close();
    }
}