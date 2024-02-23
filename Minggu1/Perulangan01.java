import java.util.Scanner;

public class Perulangan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input NIM: ");
        long nim = sc.nextLong();
        long lastDigit = 0;

        lastDigit = Math.abs(nim % 100);
        System.out.println("======================");

        for (int i = 1; i <= lastDigit; i++)
        {
            if (i != 6 && i != 10)
            {
                if (i % 2 == 0)
                {
                    System.out.print(i + " ");
                }
                else {
                    //System.out.println("======================");
                    System.out.print("* ");
                }
            }
        }
    }
}
