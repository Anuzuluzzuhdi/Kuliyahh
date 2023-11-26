import java.util.Scanner;
public class kubus01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        int sisi, v, per;
        System.out.println("Masukkan nilai sisi: ");
        sisi = sc01.nextInt();

        v = hitungVolume(sisi);
        per = hitungPermukaan(sisi);

        System.out.println("Hasil volume: "+v);
        System.out.println("Hasil permukaan: "+per);
    }
    static int hitungVolume(int a){
        int vol = a * a * a;
        return vol;
    }
    static int hitungPermukaan(int b){
        int permukaan = 6 * (b*b);
        return permukaan;
    }
}
