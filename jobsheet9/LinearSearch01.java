import java.util.Scanner;
public class LinearSearch01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array :");
        int jumlahElemen = sc01.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i <arrayInt.length; i++){
            System.out.println("Masukkan elemen array ke-"+i);
            arrayInt[i] = sc01.nextInt();
        }
        System.out.println("Masukkan key yang ingin dicari : ");
        int key = sc01.nextInt();

        int hasil = -1;
        for (int i = 0; i < jumlahElemen; i++){
            if (arrayInt[i] == key){
                hasil = i;
                break;
            }
        }
        if (hasil != -1){
            System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}
