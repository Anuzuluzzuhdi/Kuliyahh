import java.util.Scanner;

public class ModifikasiPercobaan2_01 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int nilai = input.nextInt();
        String nilaiHuruf = "";
        double nilaiSetara = 0;
        String kualifikasi = "";

        if (nilai >= 80) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat baik";

        } else if (nilai >= 73) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari baik";

        } else if (nilai >= 65) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";

        } else if (nilai >= 60) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";

        } else if (nilai >= 50) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";

        } else if (nilai >= 39) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
            
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }

        System.out.printf("Nilai huruf = %s\nNilai setara = %s\nNilai kualifikasi = %s\n", nilaiHuruf, nilaiSetara, kualifikasi);
    }
}