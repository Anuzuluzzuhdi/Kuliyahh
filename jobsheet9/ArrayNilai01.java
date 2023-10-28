import java.util.Scanner;
public class ArrayNilai01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        int[] NilaiAkhir = new int[10];

        for (int i = 0; i< 10; i++){
            System.out.println("Masukkan nilai akhir ke-"+ i + " : ");
            NilaiAkhir[i] = sc01.nextInt();
        }

        for (int i =0; i< 10; i++){
            System.out.println("Nilai akhir ke-"+ i + " adalah "+NilaiAkhir[i]);
        }
    }
}
