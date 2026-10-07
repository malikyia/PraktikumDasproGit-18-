import java.util.Scanner;

public class StudiKasus2(18) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine().trim();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        // Pengecekan awal dokumen
        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            // Jenis kegiatan diproses menggunakan Nested IF (Nested Selection)
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
                jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                
                System.out.print("Peringkat juara : ");
                int peringkat = sc.nextInt();

                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Selamat! Dokumen lengkap dan meraih Juara " + peringkat + ". Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, namun tidak masuk Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
                }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                
                System.out.print("Status pendanaan PKM (1 = didanai, 0 = tidak didanai) : ");
                int statusPKM = sc.nextInt();

                if (statusPKM == 1) {
                    System.out.println("Status : Selamat! Dokumen lengkap dan PKM Lolos Didanai. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, namun PKM tidak lolos didanai. Dana penghargaan tidak diberikan.");
                }

            } else {
                // Untuk pilihan "LAINNYA" atau jenis kegiatan di luar ketentuan
                System.out.println("Status : Dokumen lengkap, namun jenis kegiatan tidak berhak menerima dana penghargaan.");
            }
        }

        sc.close();
    }
}