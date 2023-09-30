import java.util.Scanner;
public class Lingkaran01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas;
        double phi=3.14;

        System.out.println("Masukkan jari-jari lingkaran :");
        r=input.nextInt();
        // r = 10

        keliling= 2*phi*r;
        luas=phi*r*r;

        System.out.println(keliling);
        System.out.println(luas);

        //output : keliling = 62.800000000000004
        //output : luas = 314.0
    }
}