import java.util.Scanner;
public class Tugas1_01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        char [] kode = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char [][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        System.out.print("Masukkan kode yang dicari (GUNAKAN HURUF KAPITAL !): ");
        char cariKode = input01.next().charAt(0);

        int indeksKode = -1;
        boolean kodeTemu = false;
        for(int i =0; i < kode.length; i++){
            if(kode[i]== cariKode){
                kodeTemu = true;
                indeksKode = i;
                for(int j =0; j < kota[i].length; j++){
                    System.out.print(kota[i][j]);
                }
            }
        }
        if(!kodeTemu){
            System.out.println("Kode tidak ditemukan!");
        }
    }
}
