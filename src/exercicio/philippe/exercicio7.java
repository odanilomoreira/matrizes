package exercicio.philippe;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		int a,b,exp;
		
		System.out.println("\nEntre com o valor de a: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		System.out.println("\nEntre com o valor de b: ");
		b = input.nextInt();
		
		input.close();
		
		System.out.println("\nResultado de a^b: ");
		exp = exponencial(a,b);
		System.out.println(exp);
	}
	
	
	public static int exponencial(int a, int b) {
		if (b==0)
			return 1;
		else {
			int aux = exponencial(a,b/2);
			if (b % 2 == 0)
				return aux * aux;
			else 
				return aux * aux * a;
		}
	}

}
