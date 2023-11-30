import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung :");
        bilangan = sc01.nextInt();
        System.out.print("Pangkat :");
        pangkat = sc01.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
        System.out.println("Deret perhitungan pangkatnya :");
        cetak(pangkat, bilangan, 1);
    }

    static void cetak(int x, int y, int curentt) {
        if (curentt < y ) {
            System.out.print(x + "x");
            cetak(x, y, curentt + 1);
        } else if(curentt==y){
            System.out.print(x + "x1" + " = " +hitungPangkat(x, y));
        }
    } 

}