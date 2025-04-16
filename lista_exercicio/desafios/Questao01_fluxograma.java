package lista_exercicio.desafios;

import java.util.Scanner;

public class Questao01_fluxograma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("informe o primeiro numero: ");
		int a = ler.nextInt(); // declaração do primeiro valor, que é atribuido à variavel int a

		System.out.print("informe o segundo numero: ");
		int b = ler.nextInt(); // declaração do segundo valor, que é atribuido à variável int b

		int resultado = a + b; // declara-se a variavel int resultado, na qual se atribui o valor da soma de a e b

		System.out.println("o resultado da soma é: " + resultado); // mensagem do sistema exibe o resultado

		ler.close();
	}

}
