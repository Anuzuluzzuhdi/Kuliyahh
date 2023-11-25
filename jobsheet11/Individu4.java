import java.util.ArrayList; //deklarasi arrayList
import java.util.Collections; 
import java.util.Scanner; //deklarasi scanner

public class Individu4 {
    public static void main(String[] args) {
        ArrayList<String> dataAtlet = new ArrayList<>(); // Membuat ArrayList untuk menyimpan data atlet

        Scanner scanner = new Scanner(System.in); // Membaca input dari pengguna untuk setiap cabang olahraga
        for (int i = 0; i < 5; i++) { //perulangan dimulai dari 0 hingga kurang dari 5
            System.out.println("Cabang olahraga ke-" + (i + 1) + ": "); //menampilkan pesan cabang olahraga ke 1-5

            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet " + (j + 1) + ": "); //menampilkan pesan untuk meng-inputkan nama atlet
                String namaAtlet = scanner.nextLine();
                dataAtlet.add(namaAtlet);
            }
        }
        Collections.sort(dataAtlet);  //Mengurutkan nama atlet secara ascending

        System.out.println("\nDaftar nama atlet setelah diurutkan secara ascending:");   // Menampilkan hasil
        for (String atlet : dataAtlet) {
            System.out.println(atlet);
        }
    }
}
