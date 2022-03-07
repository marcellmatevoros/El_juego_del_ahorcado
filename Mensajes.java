package Ahorcado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mensajes extends Ahorcado {

	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Se imprime: ---- PERSONAJE DE FICCI�N ----
	 */
	public void mensaje_inicial() {
		System.out.println("---- PERSONAJE DE FICCI�N ----");
	}

	/**
	 * M�todo que solicita al jugador una nueva letra con el mensaje: Introduzca una
	 * letra:
	 * 
	 * @return devuelve el car�cter que ha introducido el usuario. En caso de
	 *         introducir m�s de un car�cter, el juego SOLO se quedar� con la
	 *         primera de ellas, despreciando el resto
	 */
	public char pedir_letra() {
		System.out.println("Introduzca una letra: ");
		String variable = "";
		try {
			variable = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		variable = variable.toUpperCase();
		char caracter;
		caracter = variable.charAt(0);
		return caracter;
	}

	/**
	 * Se imprime: ACIERTO!
	 */
	public void acierto() {
		System.out.println("ACIERTO!");
	}

	/**
	 * Se imprime: FALLO!
	 */
	public void fallo() {
		System.out.println("FALLO!");
	}

	/**
	 * Se imprime: GANASTE !!!!!!!
	 */
	public void ganar() {
		System.out.println("GANASTE !!!!!!!");
	}

	/**
	 * Se imprime: PERDISTE !!!!!!!
	 */
	public void perder() {
		System.out.println("PERDISTE !!!!!!!");
	}
}
