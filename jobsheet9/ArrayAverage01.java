import java.util.Scanner;

public class ArrayAverage01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen : ");
        int jumlah = sc01.nextInt();
        int[] array = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan elemen array ke-"+(i+1)+" : ");
            array[i] = sc01.nextInt();
        }

        int max = array[0];
        int min = array[0];
        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            total += array[i];
        }

        double avg = total / jumlah;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("NIlai terendah: " + min);
        System.out.println("Nilai rata-rata: " + avg);
    }
}