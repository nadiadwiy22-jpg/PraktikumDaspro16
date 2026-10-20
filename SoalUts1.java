import java.util.Scanner;

public class SoalUts1 {
    
    static final int P = 16;

    static void kasir(int kode, boolean warna, int lembar) {
        String namaKertas;
        int hargaBW, hargaWarna;

        // 1. Jenis kertas: SWITCH-CASE
        switch (kode) {
            case 1:
                namaKertas = "A4";
                hargaBW = 300;
                hargaWarna = 1000;
                break;
            case 2:
                namaKertas = "F4";
                hargaBW = 350;
                hargaWarna = 1200;
                break;
            case 3:
                namaKertas = "A3";
                hargaBW = 800;
                hargaWarna = 2500;
                break;
            default:
                System.out.println("Kode kertas tidak tersedia");
                return;
        }

        // 2. Validasi jumlah lembar
        if (lembar < 1 || lembar > 1000) {
            System.out.println("Jumlah lembar tidak valid");
            return;
        }

        // 3. Harga per lembar: TERNARY, lalu + P x 10
        String jenisCetak = warna ? "Warna" : "Hitam-putih";
        int hargaPerLembar = (warna ? hargaWarna : hargaBW) + P * 10;
        int subtotal = hargaPerLembar * lembar;

        // 4. Diskon: IF - ELSE IF - ELSE
        int persen;
        if (lembar >= 500) {
            persen = 15;
        } else if (lembar >= 100) {
            persen = 10;
        } else {
            persen = 0;
        }
        int diskon = subtotal * persen / 100;

        // 5. Biaya minimum
        int total = subtotal - diskon;
        if (total < 5000) {
            total = 5000;
        }

        // Output
        System.out.printf("%-16s : %s%n", "Kertas", namaKertas);
        System.out.printf("%-16s : %s%n", "Jenis cetak", jenisCetak);
        System.out.printf("%-16s : Rp%d%n", "Harga per lembar", hargaPerLembar);
        System.out.printf("%-16s : Rp%d%n", "Subtotal", subtotal);
        System.out.printf("%-16s : Rp%d%n", "Diskon (" + persen + "%)", diskon);
        System.out.printf("%-16s : Rp%d%n", "Total bayar", total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kode kertas (1/2/3): ");
        int kode = sc.nextInt();
        System.out.print("Cetak warna (true/false): ");
        boolean warna = sc.nextBoolean();
        System.out.print("Jumlah lembar: ");
        int lembar = sc.nextInt();

        kasir(kode, warna, lembar);
    }
}