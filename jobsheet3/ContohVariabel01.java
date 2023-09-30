public class ContohVariabel01 {

    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain sepak bola";
        boolean isPandai = true ;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 18;
        double $ipk = 3.64, tinggi = 178;
        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah saya pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}