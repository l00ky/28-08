package lucas_morgueto_28_08;

import java.util.Scanner;

public class fibonacci_recursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de vezes do processo: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(fib_rec(i) + " ");
        }
        
        scanner.close();
    }
    
    public static int fib_rec(int n) {
        if (n <= 1) {
            return n;
        }
        return fib_rec(n - 1) + fib_rec(n - 2);
    }
}