package aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		int num = entrada.nextInt();
		System.out.println("Digite a segunda nota: ");
		int num2 = entrada.nextInt();
		
		int result = (num + num2)/2;
		System.out.println(result);
		entrada.close();
		
	}

}
