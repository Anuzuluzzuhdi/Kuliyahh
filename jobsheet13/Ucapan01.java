import java.util.Scanner;

public class Ucapan01 {
    public static String PenerimaUcapan() {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin kamu beri ucapan :");
        String namaOrang = sc01.nextLine();
        sc01.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+ nama +"\nMay the force be with you.");
    }
}
