package lista_exercicio.desafios;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o numero do dia da semana"); // pergunta o numero do dia da semana que o usuario deseja saber
		int dia = ler.nextInt(); // recebe o valor informado pelo usuario e atribui à variável dia

		if (dia == 1) {
			System.out.print("domingo"); // checa se variável dia, infromada pelo usuário corresponde ao numero 1, que é o domingo
		} else if (dia == 2) {
			System.out.print("segunda"); // se o valor de dia não corresponder ao valor anterior, o sistema checa novamente e verifica se é igual a 2
		} else if (dia == 3) {
			System.out.print("terça"); // se repete o processo até ser encontrado o valor correspondente
		} else if (dia == 4) {
			System.out.print("quarta");
		} else if (dia == 5) {
			System.out.print("quinta");
		} else if (dia == 6) {
			System.out.print("sexta");
		} else if (dia == 7) {
			System.out.print("sábado");
		} else {
			System.out.print("dia inválido"); // caso o valor de dia não seja nenhum número entre 1 e 7, o sistema apresentará uma mensagem informando que o número é inválido
		}
		ler.close();

	}

}
