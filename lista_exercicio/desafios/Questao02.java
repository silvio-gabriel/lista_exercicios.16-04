package lista_exercicio.desafios;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); // biblioteca usada para receber o que o usuário digita

		System.out.print("informe a base triangulo: ");
		int b = ler.nextInt(); // usuário informa o valor da base, então ele é atribuido à variável int b

		System.out.print("informe a altura do triangulo: ");
		int h = ler.nextInt(); // usuario informa o valor da altura, sendo atribuido à variável int h

		int area = (b * h) / 2; // declara-se a variavel area, atribuindo a ela o valor da fórmula feita com os
								// valores de b e h

		System.out.println("a área do triangulo é: " + area); // sistema entrega uma mensagem informando o valor da área do triângulo

		ler.close(); // encerra o scanner
	}

}
