import java.util.Scanner;

public class Pemilihan01{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nilaiAkhir = 0;
        String nilaiHuruf = "";


        System.out.println("Masukkan Nilai Tugas: ");
        double tugas = sc.nextInt();
        System.out.println("Masukkan Nilai Kuis: ");
        double kuis = sc.nextInt();
        System.out.println("Masukkan Nilai UTS: ");
        double uts = sc.nextInt();
        System.out.println("Masukkan Nilai UAS: ");
        double uas = sc.nextInt();

        if (tugas >= 0 && tugas <= 100 && kuis >=0 && kuis <= 100 && uts >=0 && uts <= 100 && uas >= 0 && uas <= 100){
            double nilai1 = tugas * 0.2;
            double nilai2 = tugas * 0.2;
            double nilai3 = tugas * 0.3;
            double nilai4 = tugas * 0.3;
            nilaiAkhir = nilai1 + nilai2 + nilai3 + nilai4;
        } else {
            System.out.println("Nilai Tidak Valid!");
        }

            if (nilaiAkhir >= 80 && nilaiAkhir <= 100 ){
                nilaiHuruf = "A";
            } else if (nilaiAkhir >=73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >=65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >=60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >=50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >=39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            } 
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("============================");

            if (nilaiHuruf !="D" && nilaiHuruf !="E"){
                System.out.println("Horee, Selamat Anda Lulus");
            }else {
                System.out.println("Tetap Semangat dan Jangan Putus Asa");
            }
    }
}