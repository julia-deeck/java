package aula02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = entrada.nextInt();
		System.out.println("Digite o terceiro número: ");
		int n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1);
		} else if (n2 > n1 && n2 > n3){
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}
		
		int resultado = n1 > n2 && n1 > n3? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
		System.out.println(resultado);
		int resultado2 = Math.max(n1, Math.max(n2, n3));
		System.out.println(resultado2);
		entrada.close();
	}

}
