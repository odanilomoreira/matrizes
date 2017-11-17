package exercicio.philippe;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class exercicio2 {
	public static FileWriter arq;
	public static PrintWriter gravarArq;
	
	
	public static void main(String[] args) throws IOException {

		int M[][] = new int [3][3];
		int Mt[][] = new int [3][3];
		int mRes[][] = new int [3][3];
		int valida;
		
		arq = new FileWriter("C:\\Users\\Isabela\\eclipse-workspace\\Matrizes\\exercicio2.txt");
	    gravarArq = new PrintWriter(arq);

		geraMatriz(M);
		gravarArq.printf("\nMatriz (M): \n");
		imprimeMatriz(M);
		
		Mt = M;
		matrizTrans(Mt);
		gravarArq.println();
		gravarArq.printf("\nMatriz Transposta (Mt): \n");
		imprimeMatriz(Mt);
		
		gravarArq.println();
		
		mRes = multiplicaMat(M,Mt);
		gravarArq.printf("\nMatriz Resultado (mRes = M x Mt): \n");
		imprimeMatriz(mRes);
		
		valida = verificaOrtogonal(mRes);
		
		if (valida==1)
			gravarArq.println("\nA matriz é Ortogonal");
		else
			gravarArq.println("\nA matriz não é Ortogonal");
	
		System.out.print("Arquivo Gerado com Sucesso!");
		
		arq.close();
	}
	
	public static void imprimeMatriz(int M[][]){
		int i,j;
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				gravarArq.printf(M[i][j]+"\t");
			}
			gravarArq.println();
		}
	}
	
	public static void geraMatriz(int M[][]) {
		int i,j;
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
					Integer r = rand.nextInt(30)+1;
					M[i][j] = r;
			}
		}
	}
	
	public static void matrizTrans(int M[][]) {
		int i,j;
		int mAux[][] = new int [3][3];
		
		for (i=0;i<3;i++) 
			for (j=0;j<3;j++) 
				mAux[i][j] = M[j][i];
			
		for (i=0;i<3;i++) 
			for (j=0;j<3;j++) 
			  M[i][j]=mAux[i][j];
		
	}

	public static int[][] multiplicaMat(int M[][], int Mt[][]) {
		int i,k1,k2, aux;
		int mRes[][] = new int [3][3];
		
		for (k1=0; k1<3; k1++) {
			for (k2=0; k2<3; k2++) {
				aux=0;
				for(i=0; i<3; i++) {
					aux+= M[k1][i]*Mt[i][k2];
					mRes[k1][k2]=aux;
				}
			}
		}
		
		return mRes;
	}
	
	public static int verificaOrtogonal(int M[][]) {
		int i,j;
		for (i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if ( (i==j && M[i][j] != 1) || (i!=j && M[i][j] != 0) ) {
						return 0;	
				}
			}
		}
		return 1;				
	}
			
}

	
