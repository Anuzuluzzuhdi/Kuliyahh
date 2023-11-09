import java.util.Scanner;
public class segitigaA {
    public static void main(String[] args) {
        int tinggi;
        Scanner sc01=new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        tinggi=sc01.nextInt();
        for (int i=0; i<=tinggi; i++){
            for (int j=tinggi; j>i; j--)
            //if(j>=i)
            System.out.print("*");
            System.out.println();
        }
    }
}