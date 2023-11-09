import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc01.nextInt();
        for(int i =1; i <= N; i--) {
            System.out.print("*");
        }
    }
}
