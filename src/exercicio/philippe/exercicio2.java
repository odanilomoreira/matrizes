package exercicio.philippe;

import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {

		int M[][] = new int [3][3];
		int Mt[][] = new int [3][3];
		int mRes[][] = new int [3][3];
		int valida;

		geraMatriz(M);
		System.out.print("\nMatriz (M): \n");
		imprimeMatriz(M);
		
		Mt = M;
		matrizTrans(Mt);
		System.out.println();
		System.out.print("\nMatriz Transposta (Mt): \n");
		imprimeMatriz(Mt);
		
		System.out.println();
		
		mRes = multiplicaMat(M,Mt);
		System.out.print("\nMatriz Resultado (mRes = M x Mt): \n");
		imprimeMatriz(mRes);
		
		valida = verificaOrtogonal(mRes);
		
		if (valida==1)
			System.out.println("\nA matriz é Ortogonal");
		else
			System.out.println("\nA matriz não é Ortogonal");
	
	}
	
	public static void imprimeMatriz(int M[][]){
		int i,j;
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
					System.out.print(M[i][j]+"\t");
			}
			System.out.println();
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

	
