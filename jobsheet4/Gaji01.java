import java.util.Scanner;
public class Gaji01 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
        //int gaji=40000, potGaji=25000;

        System.out.println("Masukkan Gaji Anda Bulan Ini :");
        gaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

        //output :
        //Masukkan Gaji Anda Bulan Ini :
        //5000000

        //Masukkan Jumlah Hari Masuk Kerja Anda
        //25

        //Masukkan Jumlah Hari Tidak Masuk Kerja Anda
        //2

        //Masukkan Potongan Gaji Anda
        //25000
        
        //Gaji yang anda terima adalah 124950000
    }
}
