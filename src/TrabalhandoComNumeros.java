import java.util.Scanner;

public class TrabalhandoComNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma;
		int subtrai;
		int multiplic;
		double divide;
		System.out.println("Programa Calculadora!");
		System.out.println("Por favor, informe o primeiro valor: ");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, informe o segundo valor: ");
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		subtrai = valor1 -  valor2;
		multiplic = valor1 * valor2;		
		divide = valor1 / (double) valor2;		
		System.out.println("A soma dos valores �: " + soma);
		System.out.println("A subtra��o dos valores �: " + subtrai);
		System.out.println("A multiplica��o valores �: " + multiplic);		
		System.out.println("A divis�o dos valores �: " + divide);
		leitor.close();
	}

}
