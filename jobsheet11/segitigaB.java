import java.util.Scanner;
public class segitigaB {
    public static void main(String[] args) {
        int tinggi;
        Scanner sc01=new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        tinggi=sc01.nextInt();
        for (int i=0; i<=tinggi; i++){ //kolom
            for (int j=0; j<=tinggi; j++) //baris
            if(j>tinggi-i)
            System.out.print("*");
            else
            System.out.print(" ");
            System.out.println();
        }
    }
}