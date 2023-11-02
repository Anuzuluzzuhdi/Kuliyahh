import java.util.Scanner;
public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Masukkan nama: ");
            nama = sc01.nextLine();
            System.out.println("Masukkan baris: ");
            baris = sc01.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = sc01.nextInt();
            sc01.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = sc01.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }    
    }
}
