package vetores;

public class ClasseCalculoSoma {

	private float n[] = new float[10];
	private float resultado = 0;

	public float[] getN() {
		return n;
	}

	public void setN(float[] n) {
		this.n = n;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	public void imprimirSoma() {

		for (int i = 0; i < 10; i++) {

			resultado = n[i] + resultado;

		}

		System.out.println("\n\nResultado: " + resultado);

	}

}
