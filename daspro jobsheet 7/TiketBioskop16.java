import java. util. Scanner;
public class TiketBioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        final int HARGA = 50000;
        int jumlah, totalTiket = 0;
        double totalPenjualan = 0;

        do {
            System.out.print("Jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            double total = jumlah * HARGA;
            if (jumlah > 10) {
                total = total * 0.85;       // diskon 15%
            } else if (jumlah > 4) {
                total = total * 0.90;       // diskon 10%
            }

            totalTiket += jumlah;
            totalPenjualan += total;
            System.out.println("Total bayar: Rp " + total);
        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}
    
