import java.util.Scanner;

public class bismillahUTS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta yang ingin diinput: ");
        int jumlahPeserta = sc.nextInt();
        sc.nextLine(); // Membersihkan karakter newline dari buffer

        for (int i = 1; i <= jumlahPeserta; i++) {
            System.out.println("Input data peserta ke-" + i);

            System.out.print("Masukkan nilai akademik: ");
            int nilaiAkademik = sc.nextInt();

            System.out.print("Masukkan nilai bahasa: ");
            int nilaiBahasa = sc.nextInt();

            System.out.print("Masukkan nilai nasionalisme: ");
            int nilaiNasionalisme = sc.nextInt();

            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();

            System.out.print("Apakah Anda sehat jasmani? (true/false): ");
            boolean sehatJasmani = sc.nextBoolean();

            System.out.print("Apakah Anda sehat rohani? (true/false): ");
            boolean sehatRohani = sc.nextBoolean();

            double rataRata = (nilaiAkademik + nilaiBahasa + nilaiNasionalisme) / 3;

            if (rataRata >= 78 && nilaiAkademik >= 75 && nilaiBahasa >= 75 && nilaiNasionalisme >= 75) {
                if (ipk >= 3.25) {
                    if (sehatJasmani && sehatRohani) {
                        System.out.println("Selamat, Anda Lolos Tahap Akhir.");
                    } else {
                        System.out.println("Anda Tidak Lolos, Karena Tidak Memenuhi Syarat Kesehatan.");
                    }
                } else {
                    System.out.println("Anda Tidak Lolos, Karena IPK Tidak Memenuhi Persyaratan.");
                }
            } else {
                System.out.println("Anda Tidak Lolos, Karena Nilai rata-rata Kurang dari Persyaratan.");
            }
        }
    }
}
