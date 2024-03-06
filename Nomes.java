package vetores;

import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {

		ClasseListaNomes lista = new ClasseListaNomes();
		String aux[] = new String[10];

		Scanner input = new Scanner(System.in);

		System.out.println("Digite os nomes que serão listados: ");

		for (int i = 0; i < 10; i++) {

			aux[i] = input.nextLine();
			lista.setN(aux);

		}

		System.out.println("\nLista de nomes em ordem alfabética: \n\n");

		lista.ImprimirNomes();

	}

}
