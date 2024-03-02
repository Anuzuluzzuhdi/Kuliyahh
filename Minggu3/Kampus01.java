import java.util.Scanner;

public class Kampus01 {
    public String nama;
    public String nim;
    public String gender;
    public double ipk;

    public Kampus01(String nama, String nim, String gen, double ipk) {
        this.nama = nama;
        this.nim = nim;
        gender = gen;
        this.ipk = ipk;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //System.out.println("Masukkan jumlah persegi panjang : ");
    //int jumlahPersegiPanjang = sc.nextInt();
    Kampus01[] Mahasiswa = new Kampus01[3];
    String nama, nim, gender;
    double ipk;
    double totalIPK = 0;

    for (int i = 0; i < 3; i++) {
        //arrayOfPersegiPanjangDemo[i] = new PersegiPanjangDemo();
        System.out.println("Masukkan data Mahasiswa ke-"+(i + 1));
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan jenis kelamin : ");
        gender = sc.nextLine();
        System.out.print("Masukkan IPK : ");
        ipk = sc.nextDouble();
        sc.nextLine();

        Mahasiswa[i] = new Kampus01(nama, nim, gender, ipk);
        totalIPK += ipk;
    }
    for (int i = 0; i < 3; i++){
        // System.out.print("Persegi Panjang ke-" + (i+1) + ", ");
        Mahasiswa[i].cetakInfo(i);
        //System.out.println();
        //Mahasiswa[i].hitungKeliling();
    } double rataRata = totalIPK / Mahasiswa.length;
    System.out.println("\nRata-rata IPK : " + rataRata);
    }
    public void cetakInfo(int i){
        System.out.println("Data Mahasiswa ke-" + (i + 1) + ", Nama : " + nama + ", NIM : " + nim+",Jenis Kelamin : "+gender + ", Nilai IPK : "+ ipk);
    }

}
