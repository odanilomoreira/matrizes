package exercicio.philippe;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		System.out.println("\nEntre com um valor: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		input.close();
		
		int resultado = fatorial(n);
		System.out.println("\nO fatorial de "+n+" é : "+resultado);
		
	}
	
	public static int fatorial(int n) {
		if (n==0) {
			return 1;
		}
		return n*fatorial(n-1);
	}

}
