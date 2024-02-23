import java.util.Scanner;

public class Tugas2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Pilih rumus yang ingin dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("4. Keluar");
            System.out.println("=====================================");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    hitungKecepatan();
                    System.out.println("=====================================");
                    break;
                case 2:
                    hitungJarak();
                    System.out.println("=====================================");
                    break;
                case 3:
                    hitungWaktu();
                    System.out.println("=====================================");
                    break;
                case 4:
                    System.out.println("Keluar");
                    System.out.println("=====================================");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println("=====================================");
                
            }
        } while (menu != 4);
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (m): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = scanner.nextDouble();
        double v = s / t;
        System.out.println("Kecepatan: " + v + " m/s");
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = scanner.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = scanner.nextDouble();
        double s = v * t;
        System.out.println("Jarak: " + s + " m");
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (m): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = scanner.nextDouble();
        double t = s / v;
        System.out.println("Waktu: " + t + " s");
    }
}
