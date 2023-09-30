import java.util.Scanner;
public class PemilihanPercobaan1_01 {
    public static void main(String[]args) {
        Scanner input00 = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int angka = input00.nextInt(); 
        //Masukkan Angka: 7

        String jenisAngka = (angka % 2 == 0 ) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + "adalah bilangan " + jenisAngka);
        //output : Angka 7 bilangan ganjil
    }
}