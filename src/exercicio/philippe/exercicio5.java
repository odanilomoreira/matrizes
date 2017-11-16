package exercicio.philippe;

import java.util.Random;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int V[] = new int [20];
		
		preencheVetor(V);
		imprimeVetor(V);
		
		
	}
	
	public static void preencheVetor(int V[]) {
		int i, count;
		Scanner input = new Scanner(System.in);
		for (i=0;i<20;i++) {
			if (i>9) {
				count = i-9;
				System.out.println("Digite o "+count+"º número ímpar.");
				V[i] = input.nextInt();
			}
			
			else {
			count = i+1;
			System.out.println("Digite o "+count+"º número par.");
			V[i] = input.nextInt();
			}
			input.close();
		}
		
		//Random rand = new Random();
		//rand.setSeed(System.currentTimeMillis());
		
		
	}
	
	public static void imprimeVetor(int V[]) {
		int i;
		for (i=0;i<20;i++)
			System.out.print(V[i]+" ");
	}

}
