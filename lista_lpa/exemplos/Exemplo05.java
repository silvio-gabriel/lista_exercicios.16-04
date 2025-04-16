package lista_lpa.exemplos;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("nota 10 pra otimo, nota 5 pra bom e 0 para regular");
		System.out.print("fala uma nota pro atendente: ");
		int nota = ler.nextInt();

		if (nota == 10) {
			System.out.println("otimo");
		} else if (nota == 5) {
			System.out.println("bonzinho");
		} else {
			System.out.println("regular");
		}
	}

}
