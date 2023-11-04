import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;
public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        int baris, kolom, loop;
        String nama, next;

        String[][] penonton = new String[4][2];

        loop = 0;
        while (loop == 0) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton:");
            System.out.println("2. Tampilkan daftar penonton:");
            System.out.println("3. Exit:");

            System.out.println("Pilih menu (1/2/3): ");
            int menu = sc01.nextInt();
            sc01.nextLine();

            switch (menu){
                case 1:
                    System.out.println("Masukkan nama: ");
                    nama = sc01.nextLine();
                    System.out.println("Masukkan baris: ");
                    baris = sc01.nextInt();
                    System.out.println("Masukkan kolom: ");
                    kolom = sc01.nextInt();
                    sc01.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                        } 
                        else {
                            System.out.println("Maaf, Kursi sudah ditempati oleh penonton lain.");
                        }
                    } 
                    else 
                    {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) 
                        {
                            if (penonton[i][j] != null) 
                            {
                                System.out.print(penonton[i][j] + " ");
                            } 
                            else 
                            {
                                System.out.print(" *** ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terimakasih.");
                    loop = 1;
                    break;

                default:
                    System.out.println("Menu tidak valid.");
                }

            System.out.println("Pilih Menu Lagi? (y/n): ");
            next = sc01.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;

            }
        }    
    }
}