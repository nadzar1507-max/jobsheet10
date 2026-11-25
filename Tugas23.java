import java.util.Scanner;

public class Tugas23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== INPUT HASIL SURVEI (NILAI 1 - 5) ===");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                int nilai;
                do {
                    System.out.print("  Pertanyaan ke-" + (j + 1) + ": ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("  Input harus antara 1 sampai 5! Coba lagi.");
                    }
                } while (nilai < 1 || nilai > 5);
                survey[i][j] = nilai;
            }
        }

        System.out.println("\nRATA-RATA PER RESPONDEN");
        for (int i = 0; i < jumlahResponden; i++) {
            int totalResp = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResp += survey[i][j];
            }
            double rataResp = (double) totalResp / jumlahPertanyaan;
            System.out.printf("Responden ke-%d: %.2f%n", (i + 1), rataResp);
        }

        System.out.println("\nRATA-RATA PER PERTANYAAN");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int totalTanya = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalTanya += survey[i][j];
            }
            double rataTanya = (double) totalTanya / jumlahResponden;
            System.out.printf("Pertanyaan ke-%d: %.2f%n", (j + 1), rataTanya);
        }

        sc.close();
    }
}