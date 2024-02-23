public class Fungsi01 {
    public static void main(String[] args) {
        int [][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
            int [] pendapatanCabang = new int[4];
            pendapatan(stock, pendapatanCabang);
            penguranganStock(stock);
            }
        
            static void pendapatan(int[][] stock, int[] pendapatanCabang) {
                int aglonema = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;
        
                for (int i = 0; i < stock.length; i++) {
                    for (int j = 0; j < stock[i].length; j++) {
                        pendapatanCabang[i] = aglonema * stock[i][0] + keladi * stock[i][1] + alocasia * stock[i][2] + mawar * stock[i][3];
                    }
                }
        
                System.out.println("=======================");
                System.out.println("Pendapatan");
                
                for (int i = 0; i < stock.length; i++) {
                    System.out.println("Royal Garden " + (i + 1) + ": " + pendapatanCabang[i]);
                }
                System.out.println("=======================");
                
                System.out.println("");
            }
        
            static void penguranganStock(int[][] stock) {
                System.out.println("=======================================================================");
                System.out.println("Sisa stock pada Royal Garden 4");
                System.out.println("");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "", "Aglonema", "Keladi", "Alocasia", "Mawar");
                int bungaMati[] = { 1, 2, 0, 5 };
                for (int i = 3; i < stock.length; i++) {
                    System.out.print("RoyalGarden 4   ");
                    for (int j = 0; j < stock[i].length; j++) {
                        stock[i][j] = stock[i][j] - bungaMati[j];
                        System.out.printf("%-16s", stock[i][j]);
                }
            }
            System.out.println("");
            System.out.println("=======================================================================");
        }
    }