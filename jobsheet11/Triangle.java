import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc01.nextInt();
        int i = 0;
        while (i <= N) { 
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); //Ditambahkan agar pindah ke baris dibawahnya
            i++;
        }
    }
}
