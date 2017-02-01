package Ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(EsPalindromo("a"));
	}

	public static boolean EsPalindromo (String texto) {
		boolean palindromo = true;
		char[] charTexto = texto.toCharArray();
		
		for (int i = 0, j = charTexto.length - 1; i < charTexto.length; i++, j--) {
			if (charTexto[i] != charTexto[j])
				palindromo = false;
		}
		
		return palindromo;
	}
}
