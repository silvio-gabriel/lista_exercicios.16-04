package lista_exercicio.desafios;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in); // biblioteca que lerá o que o usuário escrever

		int age; // declara-se a variável idade, que será em seguida usada na estrutura for
		
		for (int i = 1; i <= 8; i++) { // a variável 'i' sairá do valor 1 até o valor 8, repetindo o que estiver dentro da estrutura 8 vezes
			System.out.print("fale seu nome: "); // sistema envia mensagem pedindo o nome do usuário
			String nome = ler.next(); // declara-se a variável nome, na qual será atribuido o que o usuário digitar
			
			System.out.print("fale sua idade: "); // sistema envia mensagem pedindo a idade do usuário
			age = ler.nextInt(); // variável age recebe o valor que o usuário informou
			
			if (age >= 18) { // estrutura de decisão que checa se o valor de idade é maior ou igual a 18
				System.out.println(nome +" é maior de idade"); // se age for igual ou maior a 18, sistema apresenta a mensagem com o nome da pessoa
			}
		}
		ler.close(); // encerra o scanner
	}
}
