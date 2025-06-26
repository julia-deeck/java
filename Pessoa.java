package JavaPOO;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	String genero;
	
	public void comer(String comida) {
		System.out.printf("%s começou a comer %s", nome, comida);
	}
}