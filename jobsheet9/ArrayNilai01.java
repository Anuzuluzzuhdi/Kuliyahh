import java.util.Scanner;
public class ArrayNilai01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        int[] NilaiAkhir = new int[10];

        for (int i = 0; i< NilaiAkhir.length; i++){
            System.out.println("Masukkan nilai akhir ke-"+ i + " : ");
            NilaiAkhir[i] = sc01.nextInt();
        }

        for (int i =0; i< 10; i++){
            if (NilaiAkhir[i] > 70){
            System.out.println("Mahasiswa ke-"+ i + " lulus! ");
            } else {
                System.out.println("Mahasiswa ke-"+ i + " tidak lulus! ");
            }
        }
    }
}
