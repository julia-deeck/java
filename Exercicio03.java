package aula02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		String result = num == 1 ? "Domingo" : num == 2 ? "Segunda" : num == 3 ? "Terça" : num == 4 ? "Quarta" : num == 5 ? "Quinta" : num == 6 ? "Sexta" : num == 7 ? "Sábado" : "Valor inválido";
		System.out.println(result);
		entrada.close();
	}

}
