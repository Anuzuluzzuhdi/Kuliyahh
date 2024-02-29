import java.util.Scanner;

public class PersegiPanjangDemo {
    public int panjang;
    public int lebar;

    // public PersegiPanjangDemo(){

    // }
    public PersegiPanjangDemo(int p, int l) {
        panjang = p;
        lebar = l;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan jumlah persegi panjang : ");
    int jumlahPersegiPanjang = sc.nextInt();
    PersegiPanjangDemo[] arrayOfPersegiPanjangDemo = new PersegiPanjangDemo[jumlahPersegiPanjang];
    int panjang, lebar;

    for (int i = 0; i < jumlahPersegiPanjang; i++) {
        //arrayOfPersegiPanjangDemo[i] = new PersegiPanjangDemo();
        System.out.println("Persegi panjang ke-"+(i + 1));
        System.out.print("Masukkan panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = sc.nextInt();

        arrayOfPersegiPanjangDemo[i] = new PersegiPanjangDemo(panjang, lebar);
    }
    for (int i = 0; i < jumlahPersegiPanjang; i++){
        // System.out.print("Persegi Panjang ke-" + (i+1) + ", ");
        arrayOfPersegiPanjangDemo[i].cetakInfo(i);
        arrayOfPersegiPanjangDemo[i].hitungLuas();
        arrayOfPersegiPanjangDemo[i].hitungKeliling();
    }
    }
    public void cetakInfo(int i){
        System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang : " + panjang + ", lebar : " + lebar+",luas : "+ hitungLuas() + ",keliling : "+ hitungKeliling());
    }

    public int hitungLuas(){
        return panjang * lebar;
    }

    public int hitungKeliling(){
        return 2 * (panjang+lebar);
    }
}
