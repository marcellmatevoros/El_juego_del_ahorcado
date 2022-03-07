package Ahorcado;

import java.util.ArrayList;

public class Marcador extends Ahorcado {
	private int numAciertos, numFallos, intentos, puntos;
	private ArrayList<Character> listaAciertos, listaFallos;

	/**
	 * Constructor que inicializa el juego del ahorcado
	 * 
	 * @param intentos n�mero de fallos permitidos para adivinar la palabra
	 */
	public Marcador(int intentos) {

		this.numAciertos = 0;
		this.numFallos = 0;
		this.intentos = intentos;
		this.puntos = 0;
		this.listaAciertos = new ArrayList<Character>();
		this.listaFallos = new ArrayList<Character>();
	}

	/**
	 * M�todo de tipo set que actualiza la puntuaci�n del marcador con la f�rmula: 5
	 * puntos por cada acierto y 1 punto menos por cada fallo
	 */
	public void actualizar() {
		puntos = (5 * numAciertos) - numFallos;
	}

	/**
	 * M�todo que sirve para indicarle al jugador qu� letras ha acertado y qu�
	 * letras ha fallado Cada una de ellas s�lo se imprime en caso de que haya
	 * elementos dentro. La sintaxis es la siguiente: -> Letras acertadas: A B C...
	 * en caso de que el jugador haya indicado esas letras y se encuentren en la
	 * palabra -> Letras falladas: X Y Z... en caso de que el jugador haya indicado
	 * esas letras y se NO encuentren en la palabra
	 */
	public void mostrarAciertoyFallos() {
		System.out.println("-> Letras acertadas: ");
		for (Character characterAcierto : listaAciertos) {
			System.out.print(characterAcierto + " ");
		}
		System.out.println();

		System.out.println("-> Letras falladas: ");
		for (Character characterMal : listaFallos) {
			System.out.print(characterMal + " ");
		}
		System.out.println();
	}

	/**
	 * M�todo que dibuja el Marcador, que incluye los aciertos y fallos (en caso de
	 * que existan), el n�mero de intentos que quedan con la siguiente sintaxis: ->
	 * Intentos restantes = X, siendo X el n�mero de intentos (posibles fallos) que
	 * quedan y los puntos, con la siguiente sintaxis: -> PUNTOS = Y, siendo Y el
	 * n�mero total de puntos
	 */
	public void mostrarMarcador() {
		System.out.println("*****************************************");
		System.out.println("********** MARCADOR *********************");
		System.out.println("*****************************************");
		System.out.println("-> Intentos restantes: " + intentos);
		System.out.println("-> Puntos: " + puntos);
	}

	/**
	 * M�todo que incrementa el n�mero de aciertos, actualiza los puntos y a�ade la
	 * letra a la lista de Aciertos
	 * 
	 * @param letra que ha introducido el jugador
	 * @see listaAciertos
	 * @see actualizar()
	 */
	public void acertar(char letra) {
		numAciertos++;
		listaAciertos.add(letra);
		actualizar();
	}

	/**
	 * M�todo que incrementa el n�mero de fallos, disminuye el n�mero de intentos,
	 * actualiza los puntos y a�ade la letra a la lista de Fallos
	 * 
	 * @param letra que ha introducido el jugador
	 * @see listaFallos
	 * @see actualizar()
	 */
	public void fallar(char letra) {
		intentos -= 1;
		numFallos++;
		listaFallos.add(letra);
		actualizar();
	}

	/**
	 * M�todo que sirve para saber si el juego se ha terminado por haber agotado el
	 * n�mero de intentos disponibles
	 * 
	 * @return true cuando se han agotado el n�mero de intentos posibles (es igual a
	 *         cero)
	 */
	public boolean finJuego() {
		if (intentos == 0) {
			System.out.println("Fin de juego");
			return true;
		}
		return false;
	}
}
