import java.util.Scanner;

public class UcapanTerimaKasih_01 {
    public static String PenerimaUcapan(){
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin kamu beri ucapan :");
        String namaOrang = sc01.nextLine();
        sc01.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best mother in the world.\n"+
        "You support me for everything and always wish me the best.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
