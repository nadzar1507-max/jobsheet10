import java.util.Scanner;

public class bioskopwithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {

            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println(
                                "Peringatan: Nomor baris atau kolom tidak tersedia! Silakan masukkan kembali.");
                        continue;
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Peringatan: Kursi baris " + baris + " kolom " + kolom +
                                " sudah terisi oleh " + penonton[baris - 1][kolom - 1] +
                                "! Silakan pilih baris dan kolom kembali.");
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                    break;
                }

            } else if (menu == 2) {
                System.out.println("\n DAFTAR PENONTON ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isiKursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isiKursi + "\t");
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;

            } else {
                System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }

        sc.close();
    }
}