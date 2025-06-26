package aula03;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		int qnt=0, cont=0;
		double somaNotas=0, media=0;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quantos alunos têm na sala?: ");
		qnt = entrada.nextInt();
		while (cont < qnt) {
			System.out.println("Digite a nota do aluno: ");
			somaNotas = entrada.nextDouble();
			cont ++;
		}
		media = somaNotas/qnt;
		System.out.println(media);
		entrada.close();
	}

}
