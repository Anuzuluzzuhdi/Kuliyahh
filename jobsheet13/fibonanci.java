public class fibonanci {
    public static void main(String[] args) {
        int n = 13;  // Ubah nilai n sesuai dengan jumlah angka Fibonacci yang ingin ditampilkan
        System.out.println("Deret Fibonacci:");

        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
