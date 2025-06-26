package aula02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int contador = 0;
		System.out.println("Telefonou para a vítima? ");
		char resp1 = entrada.next().charAt(0);
		if (resp1 == 's') {
			contador ++;
		}
		System.out.println("Esteve no local do crime? ");
		char resp2 = entrada.next().charAt(0);
		if (resp1 == 's') {
			contador ++;
		}
		
		System.out.println("Mora perto da vítima? ");
		char resp3 = entrada.next().charAt(0);
		if (resp1 == 's') {
			contador ++;
		}
		
		System.out.println("Devia para a vítima? ");
		char resp4 = entrada.next().charAt(0);
		if (resp1 == 's') {
			contador ++;
		}
		
		System.out.println("Já trabalhou com a vítima? ");
		char resp5 = entrada.next().charAt(0);
		if (resp1 == 's') {
			contador ++;
		}
		
		if (contador == 2) {
			System.out.println("Suspeita");
		} else if (contador == 3 || contador == 4) {
			System.out.println("Cúmplice");
		} else if (contador == 5) {
			System.out.println("Assasino");
		} else {
			System.out.println("Inocente");
		}
		entrada.close();
	}

}
