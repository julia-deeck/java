package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A[] = new int[4];
		int B[] = new int[4];
		int C[] = new int[4];
		int D[] = new int[4];
		
		for(int x=0; x<A.length;x++) {
			System.out.printf("Digite o %d número array A: ", x+1);
			A[x]=entrada.nextInt();
	
			System.out.printf("Digite o %d número array B: ", x+1);
			B[x]=entrada.nextInt();

			System.out.printf("Digite o %d número array C: ", x+1);
			C[x]=entrada.nextInt();
		
			System.out.printf("Digite o %d número array D: ", x+1);
			D[x]=entrada.nextInt();
		}
			System.out.println(Arrays.toString(A));
			System.out.println(Arrays.toString(B));
			System.out.println(Arrays.toString(C));
			System.out.println(Arrays.toString(D));
			
			entrada.close();
		}
	}