package vetores;

import java.util.Arrays;

public class ClasseListaNomes {

	private String n[] = new String[10];
	private String nomes = "a";

	public String[] getN() {
		return n;
	}

	public void setN(String[] n) {
		this.n = n;
	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public void ImprimirNomes() {

		for (int i = 0; i < 10; i++) {

			nomes = n[i];

		}

		Arrays.sort(n);

		for (String auxNumero : n) {

			System.out.println(auxNumero);

		}

	}

}
