package lista_lpa.exemplos;

public class Exemplo04_soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double a, b, som;

		System.out.print("informe o primeiro valor: ");
		a = ler.nextDouble();

		System.out.print("informe o segundo numero: ");
		b = ler.nextDouble();

		som = a + b;

		System.out.println("a soma é: " + som);
	}

}
