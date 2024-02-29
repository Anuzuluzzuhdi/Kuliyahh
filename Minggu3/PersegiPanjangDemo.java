import java.util.Scanner;

public class PersegiPanjangDemo {
    public int panjang;
    public int lebar;

    public PersegiPanjangDemo(int p, int l) {
        panjang = p;
        lebar = l;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PersegiPanjangDemo[] arrayOfPersegiPanjangDemo = new PersegiPanjangDemo[3];
    int panjang, lebar;

    for (int i = 0; i < 3; i++) {
        //arrayOfPersegiPanjangDemo[i] = new PersegiPanjangDemo();
        System.out.println("Persegi panjanga ke-"+(i + 1));
        System.out.print("Masukkan panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = sc.nextInt();

        arrayOfPersegiPanjangDemo[i] = new PersegiPanjangDemo(panjang, lebar);
    }
    for (int i = 0; i < 3; i++){
        arrayOfPersegiPanjangDemo[i].cetakInfo(i);
    }
    }
    public void cetakInfo(int i){
        System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang : " + panjang + ", lebar : " + lebar);
    }
}
