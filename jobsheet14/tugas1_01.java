import java.util.Scanner;
public class tugas1_01 {
    public static void deretDescendingRekursif(int a) { //Menggunakan fungsi rekursif
        for(int i = a; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void deretDescendingIteratif(int a) { //Menggunakan fungsi iteratif
        if(a >= 0) {
            System.out.print(a + " ");
            deretDescendingIteratif(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Masukkan angka :");
        int a = sc01.nextInt();

        System.out.println("Rekursif :");
        deretDescendingRekursif(a);

        System.out.println("\nIteratif :");
        deretDescendingIteratif(a);
        
    }
}
