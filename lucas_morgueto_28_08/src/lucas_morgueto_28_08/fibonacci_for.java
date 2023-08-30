package lucas_morgueto_28_08;

import java.util.Scanner;

public class fibonacci_for {

public static void main(String[] args) {
	int valor1 = 1;
	int valor2 = 0; 
	int fib;

	 Scanner scanner = new Scanner(System.in);
     System.out.print("Digite o número de vezes do processo: ");
     int n = scanner.nextInt();
	
		for (int i = 0; i < n; i++) {

			System.out.print(valor2 + " ");
			fib = valor1;
			valor1 = valor1 + valor2;
			valor2 = fib;

		}
		
		scanner.close();
	}
}	

