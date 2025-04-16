package lista_exercicio.desafios;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

		int age;
		
		for (int i = 1; i <= 8; i++) { 
			System.out.print("fale seu nome: ");
			String nome = ler.next();
			
			System.out.print("fale sua idade: ");
			age = ler.nextInt(); 
			
			if (age >= 18) {
				System.out.println(nome +" é maior de idade");
			}
		}
		ler.close();
	}
}
