package exercicio.philippe;

public class exercicio6 {

	public static void main(String[] args) {
		
		int resultado = fatorial(4);
		System.out.println(resultado);
		
	}
	
	public static int fatorial(int n) {
		if (n==0) {
			return 1;
		}
		return n*fatorial(n-1);
	}

}
