public class PersegiPanjang01 {
    public int panjang;
    public int lebar;
    
    public static void main(String[] args) {
        PersegiPanjang01[] arrayOfPersegiPanjang01 = new PersegiPanjang01[3];

        arrayOfPersegiPanjang01[0] = new PersegiPanjang01();
        arrayOfPersegiPanjang01[0].panjang = 110;
        arrayOfPersegiPanjang01[0].lebar = 30;

        arrayOfPersegiPanjang01[1] = new PersegiPanjang01();
        arrayOfPersegiPanjang01[1].panjang = 80;
        arrayOfPersegiPanjang01[1].lebar = 40;

        arrayOfPersegiPanjang01[2] = new PersegiPanjang01();
        arrayOfPersegiPanjang01[2].panjang = 100;
        arrayOfPersegiPanjang01[2].lebar = 20;

        System.out.println("Persegi Panjang ke-1, panjang : "+arrayOfPersegiPanjang01[0].panjang+", lebar : "+arrayOfPersegiPanjang01[0].lebar);
        System.out.println("Persegi Panjang ke-2, panjang : "+arrayOfPersegiPanjang01[1].panjang+", lebar : "+arrayOfPersegiPanjang01[1].lebar);
        System.out.println("Persegi Panjang ke-3, panjang : "+arrayOfPersegiPanjang01[2].panjang+", lebar : "+arrayOfPersegiPanjang01[2].lebar);
    }

    
}

