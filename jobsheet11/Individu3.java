import java.util.Scanner; //deklarasi scanner
public class Individu3 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in); //membuat objek scanner untuk membaca inputan

        System.out.print("Inputkan N : "); //menampilkan pesan untuk meng-inputkan N
        int N=sc01.nextInt(); //deklarasi variabel N dengan tipe data int, serta membaca nilai N

        for (int i = 1; i <= N; i++) { //outer loop untuk Baris. berjalan sebanyak N kali
            for (int j = 1; j <= N; j++) { //inner loop untuk Kolom. berjalan sebanyak N kali
            if (i > 1 && i < N && j > 1 && j < N) {  //kondisi untuk bagian tengah persegi
                System.out.print("  "); // agar mencetak bagian tengah kosong
            } else {
                System.out.print(N + " "); // jika bukan bagian tengah, mencetak angka sesuai dengan inputan N
            }
        } 
            System.out.println(); //pindah baris dibawahnya setelah perulangan setiap baris terpenuhi
        }
    }
}
