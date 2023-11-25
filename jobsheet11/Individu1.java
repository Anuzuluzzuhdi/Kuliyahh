import java.util.Scanner; //deklarasi scanner
public class Individu1 {
    public static void main(String[] args) {
        int N; //deklarasi variabel N dengan tipe data int
        Scanner sc01=new Scanner(System.in); //membuat objek scanner untuk membaca inputan
        System.out.print("Masukkan jumlah baris : "); //menampilkan pesan untuk meng-inputkan jumlah baris
        N=sc01.nextInt(); //membaca nilai N
        for (int i=0; i<=N; i++){ //outer loop untuk mengcontrol baris. loop berjalan sebanyak N + 1kali
            int number=1; // urutan angka setiap baris, di inisialisasi dengan nilai 1
            for (int j=0; j<=N; j++) { //inner loop untuk mengcontrol kolom. loop berjalan sebanyak N + 1kali
            if (j > N - i) { //kondisi hanya jika J lebih besar dari N - i maka akan mencetak angka
                System.out.print(number); // memunculkan number
                number++; //menambah nilai angka setiap perulangan bertambah
            } else {
                System.out.print(" "); //membuat bagian kosong agar menjorok kekanan membentuk segitiga
            }
        }
        System.out.println();//pindah baris dibawahnya setelah perulangan setiap baris terpenuhi
        }
    } 
}