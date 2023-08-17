package tp;

import java.util.Scanner;

public class tp {
	public static void main(String[] args) {
		// en esta parte se definen tres cadenas para comparar
		String str1 = "Hola";
		String str2 = "Hola";
		String str3 = "Mundo";

		// se utiliza el método equals() para comparar cadenas
		boolean areStr1AndStr2Equal = str1.equals(str2);
		boolean areStr1AndStr3Equal = str1.equals(str3);

		/*
		 * En este ejemplo, estamos comparando cadenas utilizando el método equals().
		 * Hemos definido tres cadenas str1, str2 y str3. Luego, utilizamos el método
		 * equals() para comparar str1 con str2 y str1 con str3. Las comparaciones se
		 * basan en el contenido de las cadenas.
		 */

		// se muestran los resultados de las comparaciones
		if (areStr1AndStr2Equal) {
			System.out.println("Las cadenas str1 y str2 son iguales.");
		} else {
			System.out.println("Las cadenas str1 y str2 no son iguales.");
		}

		if (areStr1AndStr3Equal) {
			System.out.println("Las cadenas str1 y str3 son iguales.");
		} else {
			System.out.println("Las cadenas str1 y str3 no son iguales.");
		}
	}
}
