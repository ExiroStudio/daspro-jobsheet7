import java.util.Scanner;

public class TugasBioskop30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0;
        double totalHargaPenjualan = 0;
        int hargaTiket = 50000;
        int jmlTiket;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (jmlTiket == 0) {
                break;
            }

            double diskon = 0;
            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            double totalHarga = jmlTiket * hargaTiket;
            double bayar = totalHarga - (diskon * totalHarga);

            totalTiket += jmlTiket;
            totalHargaPenjualan += bayar;

            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + (int) bayar);
        }

        System.out.println("\n--- Total Penjualan Hari Ini ---");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan tiket: Rp " + (int) totalHargaPenjualan);
        sc.close();
    }
}
