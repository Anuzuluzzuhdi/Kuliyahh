import java.util.Scanner;

public class BismillahUTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai Harian :");
        float harian = sc.nextFloat();
        System.out.println("Masukkan nilai UTS :");
        float uts = sc.nextFloat();
        System.out.println("Masukkan nilai UAS :");
        float uas = sc.nextFloat();
        System.out.println("Masukkan nilai QUIZ :");
        float quiz = sc.nextFloat();

        float total = (harian * 0.25F) + (uts * 0.30F) + (uas * 0.40F) + (quiz * 0.05F);

        System.out.println("Rata rata nilai yang didapat :" + total);
    }
}
