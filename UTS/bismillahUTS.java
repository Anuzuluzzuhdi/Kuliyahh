import java.util.Scanner;
public class bismillahUTS {
    public static void main(String[] args) {
        Scanner sc01 =new Scanner(System.in);

        int jumlahPeserta;
        int nilaiAkademik; 
        int nilaiBahasa;
        int nilaiNasionalisme;
        double ipk;
        double rataRata;
        boolean sehatJasmani;
        boolean sehatRohani;

        System.out.println("Masukkan jumlah peserta yang ikut seleksi :");
        jumlahPeserta = sc01.nextInt();
        sc01.nextLine();

        for (int i = 1; i <= jumlahPeserta; i++){
            System.out.print("Input data peserta ke" + i);

            System.out.print("Masukkan nilai akademik :");
            nilaiAkademik = sc01.nextInt();
            System.out.print("Masukkan nilai bahasa :");
            nilaiBahasa = sc01.nextInt();
            System.out.print("Masukkan nilai nasionalisme :");
            nilaiNasionalisme = sc01.nextInt();
            System.out.print("Masukkan IPK anda :");
            ipk = sc01.nextDouble();

            System.out.print("Peserta sehat jasmani? (true/false): ");
            sehatJasmani = sc01.nextBoolean();
            System.out.print("Peserta sehat rohani? (true/false): ");
            sehatRohani = sc01.nextBoolean();

            rataRata = (nilaiAkademik + nilaiBahasa + nilaiNasionalisme) / 3;

            if (rataRata >= 78 && nilaiAkademik >=75 && nilaiBahasa >= 75 && nilaiNasionalisme >=75){
                if (ipk >= 3.25) {
                    if (sehatJasmani && sehatRohani){
                        System.out.println("Selamat, Peserta Lolos Tahap Akhir.");
                    } else {
                        System.out.println("Peserta Tidak Lolos, Karena Tidak Memenuhi Syarat Kesehatan.");
                    }
                } else {
                    System.out.println("Peserta Tidak Lolos, Karena IPK Tidak Memenuhi Persyaratan.");
                }
            }else {
                System.out.println("Peserta Tidak Lolos, Karena Nilai rata-rata Kurang dari Persyaratan.");
            }
        }
    }
}