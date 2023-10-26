import java.util.Scanner;
public class WhileGaji01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0;
        double TotalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukkkan jumlah karyawan :");
        jumlahKaryawan = scan.nextInt();

        int a = 0;

        while (a < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manajemen, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (a+1) + ":");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = scan.nextInt();
            a++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            else {
                System.out.println("Jabatan tidak valid.Silahkan masukkan jawaban yang valid.");
                a--;
            }

            TotalGajiLembur += gajiLembur;
            
        }
            System.out.println("Total gaji lembur : " + TotalGajiLembur);
    }
}