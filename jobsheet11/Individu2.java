import java.util.Scanner; //deklarasi scanner
public class Individu2 {
    public static void main(String[] args) {
        int N; //deklarasi variabel N dengan tipe data int
        Scanner sc01=new Scanner(System.in); //membuat objek scanner untuk membaca inputan
        System.out.print("Inputkan N : "); //menampilkan pesan untuk meng-inputkan N
        N=sc01.nextInt(); //membaca nilai N
        for (int i=0; i<=N; i++){ //outer loop untuk Baris
            for (int j=N; j>i; j--) //inner loop untuk Kolom
            
            System.out.print("*"); //mencetak * disetiap perulangan 
            System.out.println(); //pindah baris dibawahnya setelah perulangan selesai
        }
    } 
}