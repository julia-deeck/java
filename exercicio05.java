package aula03;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		int qnt=0, cont=0;
		double somaNotas=0, media=0;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quantos alunos têm na sala? ");
		qnt = entrada.nextInt();
		for (cont=0; cont < qnt; cont++) {
			System.out.println("Digite a nota do aluno: ");
			somaNotas = entrada.nextDouble();
		}
		media = somaNotas/qnt;
		System.out.println(media);
		entrada.close();

	}

}
