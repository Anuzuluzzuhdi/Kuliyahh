public class test {
    public static void main(String[] args) {
        int bil1 = 24;
        int bil2 = 15;
        int bil3 = 54;

        int bilanganMax = bil1; // asumsi bahwa bil1 itu adalah terbesar

        if (bil2 > bilanganMax){
            bilanganMax = bil2;
        } else if (bil3 > bilanganMax){
            bilanganMax = bil3;
        }

        System.out.println(bilanganMax);
    }
    
}
