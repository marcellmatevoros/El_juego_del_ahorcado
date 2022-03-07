package Ahorcado;

/**
 * @author Pedro J. Camacho
 * @version 1.0 Prueba final T2
 * @date 23/03/2015
 */
public class Ahorcado {

	public static void main(String[] args) {
		int intentos;
		char letra;

		Palabra miPalabra = new Palabra();
		intentos = miPalabra.letras_diferentes();
		Marcador miMarcador = new Marcador(intentos);
		Mensajes misMensajes = new Mensajes();

		misMensajes.mensaje_inicial();

		// Game Loop
		do {
			miMarcador.mostrarMarcador();
			miMarcador.mostrarAciertoyFallos();
			miPalabra.mostrar_visible();
			letra = misMensajes.pedir_letra();
			if (miPalabra.buscar(letra) > 0) {
				miMarcador.acertar(letra);
				misMensajes.acierto();
			} else {
				miMarcador.fallar(letra);
				misMensajes.fallo();
			}
			System.out.println();
		} while (!miMarcador.finJuego() && !miPalabra.esta_adivinada());
		if (miPalabra.esta_adivinada()) {
			misMensajes.ganar();
			miPalabra.mostrar_visible();
		} else {
			misMensajes.perder();
			miPalabra.mostrar_visible();
		}
	}

}