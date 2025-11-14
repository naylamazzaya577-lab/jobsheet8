import java.util.Scanner;

public class NilaiKelompok21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i;
        int j;
        int jumlahKelompok = 6;
        double rataTertinggi = 0;
        int nomorKelompokTerbaik = 0;
        int nomorKelompok = 1; 

        System.out.println("=== Program Penilaian Tugas Proyek Antar Kelompok ===");
        System.out.println("Setiap kelompok akan dinilai oleh 5 kelompok lain.");
        System.out.println();

        while (nomorKelompok <= jumlahKelompok) {

            System.out.println("Kelompok ke-" + nomorKelompok);
            
            int totalNilai = 0;  
            for (int penilai = 1; penilai <= 5; penilai++) {
                System.out.print("Masukkan nilai dari kelompok penilai ke-" + penilai + " : ");
                int nilai = sc.nextInt();
                totalNilai += nilai;  // akumulasi
            }

            // hitung rata-rata
            double rataRata = totalNilai / 5.0;

            if (rataRata > rataTertinggi) {
             rataTertinggi = rataRata;
             nomorKelompokTerbaik = nomorKelompok;
            }

            System.out.println("Total nilai: " + totalNilai);
            System.out.printf("Rata-rata nilai kelompok %d = %.2f%n", nomorKelompok, rataRata);
            System.out.println("------------------------------------");

            nomorKelompok++; 
        }

            System.out.println("\n=== HASIL AKHIR ===");
            System.out.printf("Kelompok dengan nilai rata-rata tertinggi adalah Kelompok %d dengan nilai %.2f\n",
                           nomorKelompokTerbaik, rataTertinggi);

        sc.close();
    }
}
    
