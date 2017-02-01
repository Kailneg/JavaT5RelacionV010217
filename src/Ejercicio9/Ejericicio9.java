package Ejercicio9;

public class Ejericicio9 {

	public static void main(String[] args) {

		String txt = "Esto es un texto, esto lo es, esto lo otro, esto esto. Esto ESTO";
		String clave = "eStO";
		System.out.println("Número de veces que aparece la palabra '" + clave + "': " + VecesPalabra(txt, clave));
	}

	public static int VecesPalabra(String texto, String palabra) {
		texto = texto.toLowerCase();
		palabra = palabra.toLowerCase();
		int totalOcurrencias = 0;
		int index = 0;

		do {
			if (texto.indexOf(palabra, index) < 0)
				break;
			else {
				index = texto.indexOf(palabra, index);
				index++;
				totalOcurrencias++;
			}

		} while (index < texto.length());

		return totalOcurrencias;
	}
}
