import java.util.Scanner;
public class SoalUts1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    static final int P = 16;

    int kode = sc.nextInt();
    int warna = sc.nextInt();
    int lembar = sc.nextInt();

    static void kasir(int kode, int warna, int lembar) {
    String namaKertas;
    int hargaKertasHP, hargaWarna;

    switch (kode) {
        case 1:
        namaKertas = "A4";
        hargaKertasHP = 300;
        hargaWarna = 1000;
        break;
        case 2:
        namaKertas = "F4";
        hargaKertasHP = 350;
        hargaWarna = 1200;
        break;
        case 3:
        namaKertas = "A3";
        hargaKertasHP = 800;
        hargaWarna = 2500;
        break;

        default:
        System.out.println("Kode kertas tidak valid.");
        return;

        if (lembar < 1 || lembar > 1000) {
        System.out.println("Jumlah lembar tidak valid.");
        return;
        }

        String jenisCetak = warna == 1 ? "Warna" : "Hitam-putih";
        int hargaPerLembar = (warna == 1 ? hargaWarna : hargaKertasHP) + P * 10;
        int subtotal = hargaPerLembar * lembar;

    int persen;
    if (lembar >= 500) {
    persen = 15;
    } else if (lembar >= 100) {
    persen = 10;
    } else {
    persen = 0;
    }
  final int diskon = subtotal * persen / 100;

  int total = subtotal - diskon;
  if (total < 5000) {
    total = 5000;
  }

  // Output
  System.out.println("Kertas".padEnd(16) + ": " + namaKertas);
  System.out.println("Jenis cetak".padEnd(16) + ": " + jenisCetak);
  System.out.println("Harga per lembar".padEnd(16) + ": Rp" + hargaPerLembar);
  System.out.println("Subtotal".padEnd(16) + ": Rp" + subtotal);
  System.out.println(("Diskon (" + persen + "%)").padEnd(16) + ": Rp" + diskon);
  System.out.println("Total bayar".padEnd(16) + ": Rp" + total);
}

kasir (1, false, 200);

        }
    }
}