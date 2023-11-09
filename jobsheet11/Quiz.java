import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random01 = new Random();
        Scanner input01 = new Scanner(System.in);

        char menu='y';
        do {
                int number = random01.nextInt(10) + 1;
                boolean success = false;
                do {
                        System.out.print("Tebak angka (1-10):");
                        int answer = input01.nextInt();
                        input01.nextLine();
                        success = (answer == number);

                        if (answer < number) {
                            System.out.println("Angka terlalu kecil. Coba lagi.");
                        } else if (answer > number) {
                            System.out.println("Angka terlalu besar. Coba lagi.");
                        } else {
                            success = true;
                            System.out.println("Selamat, tebakan Anda benar!");
                        }
                } while(!success);
                System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
                menu = input01.nextLine().charAt(0);
        } while(menu=='y'|| menu=='Y');
    }
}
