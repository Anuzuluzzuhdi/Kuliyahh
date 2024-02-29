public class ArrayExample {
    public static void main(String[] args) {
        int[] daftarNilai = new int[5];
        daftarNilai[0] = 7;
        daftarNilai[1] = 3;
        daftarNilai[2] = 8;
        daftarNilai[3] = 2;
        daftarNilai[4] = 1;

        //System.out.println("Printing array elements using for-each loop:");
        for (int nilai : daftarNilai) {
            System.out.println(nilai);
        }
    }
}