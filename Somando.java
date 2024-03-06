package vetores;

import java.util.Scanner;

public class Somando {

	public static void main(String[] args) {

		ClasseCalculoSoma somando = new ClasseCalculoSoma();
		float numero[] = new float[10];

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite os números 10 que serão somados: ");

		for (int i = 0; i < 10; i++) {

			numero[i] = input.nextFloat();
			somando.setN(numero);

		}

		somando.imprimirSoma();

	}
}
