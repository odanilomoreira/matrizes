package exercicio.philippe;

import java.util.Random;

public class exercicio8 {

	public static void main(String[] args) {
		int V[] = new int [20];
		int maior;
		
		geraVetor(V);
		imprimeVetor(V);
		
		maior = maior(V,0,19);
		System.out.println("\n\n O maior número do vetor acima é: "+maior);
		
	}
	
	

	public static int maior(int V[], int i, int f) {
		if (i==f)
			return V[i];
		else {
			int n1,n2,m;
			
			m = (i+f)/2;
			n1 = maior(V,i,m);
			n2 = maior(V,m+1,f);
			
			if (n1 > n2)
				return n1;
			else
				return n2;
					
		}
	}
		
	
	public static void geraVetor(int V[]) {
		int i,r;
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for (i=0;i<20;i++) {
			r = rand.nextInt(40)+1;
			V[i] = r;
		}
	}
	
	public static void imprimeVetor(int V[]) {
		int i;
		for (i=0;i<20;i++)
			System.out.print(V[i]+" ");
	}
	

}
