package lista_lpa.exemplos;

import java.util.Scanner;

public class Exemplo01_tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int resultado, n;
		
		System.out.print("informa o numero: ");
		n = ler.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			resultado = n*i;
			System.out.println(n + " X " + i + " = " + resultado);
		}
		ler.close();
	}
}
