import java.util.Scanner;
public class SiakadFor16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double niai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            niai = sc.nextDouble();
            
            if (niai > tertinggi) {
                tertinggi = niai;
            }
            if (niai < terendah) {
                terendah = niai;
            }   
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}

