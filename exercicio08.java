package aula03;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[5];
		double soma=0, media=0;
		
		for(int x=0; x<notas.length; x++) {
			System.out.println("Digite a nota: ");
			notas[x]=entrada.nextDouble();
		}
		for(double i : notas) {
			soma+=1;
		}
		media=soma/notas.length;
		System.out.printf("A média da turma é %.2f", media);
		entrada.close();
	}

}
