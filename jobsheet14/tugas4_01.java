import java.util.Scanner;
public class tugas4_01 {
    public static int pasangMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
             // karenan pada saat bulan pertama dan kedua, hanya ada satu pasangan marmut
        } else {
            return pasangMarmut(bulan - 1) + pasangMarmut(bulan - 2); 
            // Jumlah pasangan marmut pada bulan ke-n adalah jumlah pasangan pada bulan ke-(n-1) dan ke-(n-2). rumus FIBONANCI
        }
    }

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Masukkan Bulan Yang Ingin diHitung :"); 
        //Input bulan yang ingin dihitung
        int bulan = sc01.nextInt();

        int totalPasangan = pasangMarmut(bulan); 
        //Hitung jumlah pasangan marmut dengan memanggil fungsi 'pasangMarmut'

        System.out.println("Pada Bulan ke-" + bulan + ", terdapat " + totalPasangan + " Pasangan Marmut."); 
        //Menampilkan jumlah pasangan marmut dan bulan yang telah di input sebelumnya
    }
}
