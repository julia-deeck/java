package aula03;

public class exercicio06 {

	public static void main(String[] args) {
		int soma3=0,soma5=0,somatotal=0;
		for (int i=1; i <=20; i++) {
			soma3+=i%3==0? i : 0;
			soma5+=i%5==0? i : 0;
		}
		somatotal=soma3+soma5;
		System.out.println(soma3+" "+ soma5 + " "+ somatotal);
	}
}
