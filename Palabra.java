package Ahorcado;

public class Palabra extends Ahorcado {
	// Para almacenar la palabra que hay que adivinar
	private String p_oculta;
	// Para almacenar la parte que se ha adivinado de la palabra
	private char[] p_visible;

	/**
	 * Constructor que genera una palabra de forma aleatoria (p_oculta) tambi�n
	 * inicializa un Array (p_visible) con "_" en cada una de las letras estos
	 * subrayados se ir�n sustituyendo seg�n se vayan adividando las letras
	 */
	public Palabra() {
		String[] palabras = { "BATMAN", "SUPERMAN", "HULK", "CENICIENTA", "SPIDERMAN", "PINOCHO", "LOBEZNO" };
		int n = (int) Math.floor(Math.random() * palabras.length);
		p_oculta = palabras[n];
		p_visible = new char[p_oculta.length()];
		for (int i = 0; i < p_visible.length; i++) {
			p_visible[i] = '_';
		}
	}

	/**
	 * M�todo que sirve para saber si se ha adivinado la palabra
	 * 
	 * @return devuelve true si la palabra oculta (p_oculta) tiene el mismo
	 *         contenido que la parte visible (p_visible), false en caso contrario
	 */
	public boolean esta_adivinada() {
		if (p_oculta.equals(new String(p_visible))) {
			return true;
		}
		return false;
	}

	/**
	 * M�todo que sirve para mostrar la parte visible de la palabra (p_visible) Se
	 * imprimen las letras separadas por un espacio y un salto de l�nea al final
	 */
	public void mostrar_visible() {
		for (int j = 0; j < p_visible.length; j++) {
			System.out.print(p_visible[j] + " ");
		}
		System.out.println();
	}

	/**
	 * M�todo que busca las letras en la palabra (p_oculta) y adem�s, en caso de
	 * encontrarla la pone en la parte visible (p_visible) en su posici�n correcta
	 * de este modo cuando se imprime la parte visible
	 * 
	 * @param c El car�cter a buscar en la palabra completa (p_oculta)
	 * @return Se devuelve el n�mero de aciertos, es decir, el n�mero de veces que
	 *         aparece c en el palabra (p_oculta)
	 */
	public int buscar(char c) {
		int contador = 0;
		for (int j = 0; j < p_oculta.length(); j++) {
			if (p_oculta.charAt(j) == c) {
				p_visible[j] = c;
				contador++;
			}
		}
		return contador;
	}

	/**
	 * M�todo que cuenta el n�mero de letras diferentes que tiene la palabra
	 * (p_oculta)
	 * 
	 * @return n�mero de letras diferentes
	 */
	public int letras_diferentes() {
		int contadorLetrasDif = 0;

		for (int i = 0; i < p_oculta.length(); i++) {
			contadorLetrasDif++;
		}
		return contadorLetrasDif;
	}
}