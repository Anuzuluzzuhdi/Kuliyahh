import java.util.Scanner;
public class tugas3_01 {
    public static boolean primaRekursif(int a, int i) { //Fungsi rekursif untuk menghitung bilangan prima
        if (a <= 1) {
            return false; // Karena menggunakan tipe data boolean maka kita menggunakan true dan false
        } else if (i == 1){
            return true; //Jika sudah mencapai pembagi 1, maka a adalah bilangan prima
        } else {
            if (a % i == 0) { //Jika a habis dibagi oleh i, maka bukan bilangan prima
                return false;
            }
            return primaRekursif(a, i - 1); //melanjutkan ke pembagian selanjutnya
        }
    }

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Masukkan angka :");
        int angka = sc01.nextInt();

        if (primaRekursif(angka, angka - 1)) { //Memanggil fungsi rekursif untuk mengecek apa benar bilangan prima atau bukan
            System.out.println(angka + " Merupakan bilangan prima.");
        } else {
            System.out.println(angka + " Bukan bilangan prima");
        }
    }
}
