import java.util.Scanner;


public class fps {
    public static void main(String[]args) {
        Scanner sc00 = new Scanner(System.in);

        System.out.print("Masukkan Jarak :");
        int jarak = sc00.nextInt();

        if (jarak<=5){
            System.out.println("Gunakan melee weapon untuk pertarungan jarak dekat");    
        }
        // if (jarak>5){
        //     System.out.println("Gunakan ranged weapon untuk pertarungan jarak jauh");
        // }
        else {
            System.out.println("Gunakan ranged weapon untuk pertarungan jarak jauh");
        }
    }
}