package lista_exercicio.desafios;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma = 0; // declara a variável int soma, atribuindo a ela o valor 0. ela será usada para ser colocado o resultado da soma dos 10 valores
		
		for (int i = 1; i <= 10; i++) { // é criada a variável i dentro da estrutura for, que serve para repetirmos instruções
			System.out.print("informe um valor: "); // sistema exibe uma mensagem exigindo os valores
			int a = ler.nextInt(); // assim que delarada, atribui-se o valor digitado pelo usuário à variável a
			soma = soma + a; // na variável soma, é calculada a soma com o próximo valor de a
			// exemplo: se o usuário informa 1, será somado o valor de soma (que começa em zero) com o valor de a (nesse caso 1)
		}
		System.out.println("o total da soma é: " + soma); // sistema apresenta uma mensagem com o resultado da soma de todos os valores
		ler.close();
	}

}
