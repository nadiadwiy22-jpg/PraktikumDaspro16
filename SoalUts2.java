import java.util.Scanner;
public class SoalUts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int minSks = 144;
        final int batasSemester = 14;
        String pesan;

        System.out.print("Bebas kompen (Ya/Tidak): ");
        String kompen = sc.nextLine();
        System.out.print("Tanggungan perpustakaan (true/false): ");
        boolean perpus = sc.nextBoolean();

        // Tingkat 1: administrasi
        if (kompen.trim().equalsIgnoreCase("ya") && !perpus) {

            System.out.print("Jumlah SKS lulus: ");
            int sks = sc.nextInt();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.print("Lama studi (semester): ");
            int semester = sc.nextInt();
            System.out.print("Pernah mengulang (true/false): ");
            boolean mengulang = sc.nextBoolean();

            // Tingkat 2: akademik
            if (sks >= minSks && ipk >= 2.00) {

                // Tingkat 3: predikat
                String predikat;
                if (ipk > 3.50 && semester <= batasSemester && !mengulang) {
                    predikat = "Dengan Pujian";
                } else if (ipk > 3.00) {
                    predikat = "Sangat Memuaskan";
                } else if (ipk >= 2.76) {
                    predikat = "Memuaskan";
                } else {
                    predikat = "Cukup";
                }
                pesan = "Lulus yudisium dengan predikat " + predikat;

            } else {
                pesan = "Ditolak: syarat akademik (SKS/IPK) belum terpenuhi";
            }

        } else {
            pesan = "Ditolak: syarat administrasi (kompen/perpustakaan) belum terpenuhi";
        }

        System.out.println(pesan);
    }
}