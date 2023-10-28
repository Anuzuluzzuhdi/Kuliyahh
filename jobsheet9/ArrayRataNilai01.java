import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataLulus, rataTidakLulus;
        int jumlahMhs;
        int countLulus = 0;
        int countTidakLulus = 0;

        System.out.println("Masukkan jumlah mahasiswa :");
        jumlahMhs = sc01.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc01.nextInt();
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                countLulus++;
            }else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        rataLulus = totalLulus/countLulus;
        rataTidakLulus = totalTidakLulus/countTidakLulus;
        System.out.println("Rata-rata nilai lulus = "+ rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ rataTidakLulus);
    }
}
