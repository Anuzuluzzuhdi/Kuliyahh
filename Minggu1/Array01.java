import java.util.Scanner;    
    
    public class Array01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] matkul = new String[8];
        matkul[0] = "Agama Islam";
        matkul[1] = "Konsep Teknologi Informasi";
        matkul[2] = "CTPS";
        matkul[3] = "Matematika Dasar";
        matkul[4] = "Bahasa Inggris";
        matkul[5] = "Bahasa Indonesia";
        matkul[6] = "Dasar Pemograman";
        matkul[7] = "Praktikum Dasar Pemograman";
        double [] nilaiAngka = new double[8];
        String [] nilaiHuruf = new String[8];
        double [] bobotNilai = new double[8];
        float nilaiSetara = 0, bobotSks = 2;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < matkul.length; i++){
            System.out.print("Masukan nilai angka untuk Matkul " + matkul[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
        }

        for (int i = 0; i < nilaiHuruf.length; i++){
            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100){
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] >= 73 && nilaiAngka[i] <= 80){
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] <= 73){
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] <= 65){
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50 && nilaiAngka[i] <= 60){
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] >= 39 && nilaiAngka[i] <= 50){
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }

            nilaiSetara += bobotNilai[i];
        }
        
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.printf("%-40s %-20s %-20s %-20s %n", "Matkul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < bobotNilai.length; i++) {
            System.out.printf("%-40s %-20s %-20s %-20s %n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            
        }
        float ip = nilaiSetara * bobotSks / 16;
        System.out.printf("\nIP = %.2f\n" , ip);
        sc.close();
}

}