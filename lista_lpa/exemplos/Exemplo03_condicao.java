package lista_lpa.exemplos;

import java.util.Scanner;

public class Exemplo03_condicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("informe o numero ai pai: ");
		int num = ler.nextInt(); //atribuição de valor da variável

		if (num > 10) { // checagem do valor se for verdadeiro
			System.out.println("maior ou igual a 10");
		} else { // se for falso
			System.out.println("numero menor que 10");
		}
		ler.close();
	}

}
