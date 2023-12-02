import java.util.Scanner;
public class tugas2_01 {
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n untuk menghitung penjumlahan: ");
        int n = scanner.nextInt();
        int hasil = penjumlahanRekursif(n);
        System.out.println("Penjumlahan 1+2+3+...+" + n + " = " + hasil);
    }
}
