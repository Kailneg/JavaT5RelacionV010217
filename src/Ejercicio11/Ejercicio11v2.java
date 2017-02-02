package Ejercicio11;

public class Ejercicio11v2 {

	public static void main(String[] args) {

		String textoBase = "Esto es especificacion una prueba especificacionespecificacion eseses de texto, es es una prueba";
		String textoBuscar = "especificacion";

		System.out.println(MarcaSubCadena(textoBase, textoBuscar));
	}

	public static String MarcaSubCadena(String textoBase, String textoBuscar) {
		textoBase = textoBase.toLowerCase();
		textoBuscar = textoBuscar.toLowerCase();
		int contador = 0;

		do {
			if (textoBase.indexOf(textoBuscar) == -1)
				contador++;
			else {
				char[] aux = textoBase.toCharArray();
				int posicionActual = textoBase.indexOf(textoBuscar);
				aux[posicionActual] = '*';
				textoBase = String.valueOf(aux);
				contador = posicionActual + textoBuscar.length();
			}

		} while (contador < textoBase.length());

		return textoBase;
	}
}
