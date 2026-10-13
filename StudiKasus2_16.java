import java.util.Scanner;
public class StudiKasus2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPendanaan, kurang;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan: ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen yang diupload: ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
        jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
        jenisKegiatan.equalsIgnoreCase("Mandiri")) {

        System.out.print("Peringkat juara: ");
        peringkat = sc.nextInt();






    }
    
}
