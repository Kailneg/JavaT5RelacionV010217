package Ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {

		String textoBase = "Esto es especificacion una prueba especificacionespecificacion eseses de texto, es es una prueba";
		String textoBuscar = "especificacion";

		System.out.println(MarcaSubCadena(textoBase, textoBuscar));
	}

	public static String MarcaSubCadena(String textoBase, String textoBuscar) {
		textoBase = textoBase.toLowerCase();
		textoBuscar = textoBuscar.toLowerCase();

		char[] aux = textoBuscar.toCharArray();
		aux[0] = '*';

		return textoBase.replaceAll(textoBuscar, String.valueOf(aux));
	}
}
