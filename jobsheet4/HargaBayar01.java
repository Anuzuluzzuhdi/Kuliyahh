import java.util.Scanner;
public class HargaBayar01 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int harga, jumlah;
        double dis, total, bayar, jmlDis;
        String merk_buku, JmlHalamanBuku;

        System.out.println("Masukkan merk buku yang dibeli ");
        merk_buku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        JmlHalamanBuku=input.nextLine();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah diskon anda ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
        
        //output :
        //Masukkan merk buku yang dibeli 
        //Dongeng Kancil
        
        //Masukkan jumlah halaman buku yang dibeli
        //105

        //Masukkan harga barang yang dibeli 
        //25000

        //Masukkan jumlah barang yang dibeli
        //2

        //Masukkan jumlah diskon anda
        //0.1

        //Diskon yang anda dapatkan adalah 5000.0
        //Jumlah yang harus dibayar adalah 45000.0
    }
}
