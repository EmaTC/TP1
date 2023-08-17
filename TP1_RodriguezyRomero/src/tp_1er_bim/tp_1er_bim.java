package tp_1er_bim; 

import java.util.Scanner; 

public class tp_1er_bim { 
	public static void main(String[] args) {
	
		int opc; /* declara una variable entera llamada "opc" */
		
		Scanner datos = new Scanner(System.in); // una declaracion que se usa para que se puedan leer datos
		
		System.out.println("\tEste programa te permite resolver algunos problemas");
		System.out.println("\t Elegi una opcion: ");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println( "3. Jugar al bingo.");
        //system.out.println sirve para generar una salida con texto que el usuario pueda ver en la pantalla
		opc = datos.nextInt();
        /* sirve para generar una entrada de datos, en este caso entero (Int), 
		en la cual el usuario pueda ingresar un dato que se guardara en "opc"*/
		switch (opc) {/*una declaracion switch permite al usuario elegir entre diferentes casos,
		cada uno con una accion distinta */   
         
			case 1://sirve para inicializar una accion que se realizara si el usuario ingreso en la opcion 1
				int num_raiz;/* declara una variable entera llamada "num_raiz" */
				System.out.println("Ingresa un numero para calcular su raiz cuadrada: ");

				num_raiz = datos.nextInt();
				/* sirve para generar una entrada de datos, en este caso entero (Int), 
				en la cual el usuario pueda ingresar un dato que se guardara en "num_raiz"*/

				if (num_raiz >= 0) {// una sentencia if sirve para generar una condicion basada en la respuesta ingresada por el usuario.

					//la funcion (num_raiz >= 0) pregunta si el valor de "num_raiz" es mayor o igual a cero
					int raiz_cuadrada = (int) Math.sqrt(num_raiz);// iguala el valor de "raiz_cuadrada"a el valor de la raiz cuadrada de num_raiz a travez de la funcion (int) Math.sqrt(num_raiz) 
					System.out.println("El resultado es: " + raiz_cuadrada);
					//"+" agrega el valor de una variable o texto que fue ingresado a la respectiva salida, en este caso lo que guardo "raiz_cuadrada"
				}
				else {// es la opcion restante de una sentencia if, cuando el caso es diferente a todas las otras condiciones, o si ingresaste cualquier cosa
					System.out.println("No se puede calcular la raiz de un negativo.");
				}
				break;
			
			case 2://sirve para inicializar una accion que se realizara si el usuario ingreso en la opcion 2
				System.out.println("Ingresa un numero: ");

				int num_signo;/* declara una variable entera llamada "num_signo" */
				num_signo = datos.nextInt(); 
				/* sirve para generar una entrada de datos, en este caso entero (Int), 
				en la cual el usuario pueda ingresar un dato que se guardara en "num_signo"*/
				if (num_signo == 0) {// una sentencia if sirve para generar una condicion basada en la respuesta ingresada por el usuario.
					System.out.println("El numero es cero");
				} else if (num_signo > 0) {// sirve para generar una condicion extra
					//la funcion (num_signo > 0) pregunta si el valor de "num_signo" es mayor que cero
					System.out.println("El numero es positivo");
				} else {// es la opcion restante de una sentencia if, cuando el caso es diferente a todas las otras condiciones
					System.out.println("El numero es negativo");
				}

			break;

			case 3://sirve para inicializar una accion que se realizara si el usuario ingreso en la opcion 3
				System.out.println("Ingresa un numero entre 0 y 9");

				int num_bingo;
				num_bingo = datos.nextInt();

				double num_ganador_double = Math.random() * 9;//el comando "Math.random()" sirve para generar un numero de manera procedural entre 0 y 1
				/* double declara una variable doble llamada "num_ganador_double" */
				//"* 9" hace que el numero de se genere por el comando "Math.random()" puede ser en un rango de 0 y 9  
				int num_ganador = (int) num_ganador_double;// iguala el valor de "num_ganador"que es una variable entera a el valor de "num_ganador_double"

				if (num_bingo == num_ganador) //la funcion (num_bingo == 0) pregunta si el valor de "num_bingo" es igual al valor de "num_ganador"
					{
					System.out.println("Ganaste!");
				} 
				else {
					System.out.println("Perdiste :(");
					System.out.println("El numero ganador es: " + num_ganador);
				}
				break;

			default://sirve para inicializar una accion que se realizara si el usuario ingreso un dato que no esta en ninguno de los casos 
				System.out.println("Opcion incorrecta.");
				break;// detiene el avance del caso para que no salgan las demas opciones accidentalmente y, al final, termina el funcionamiento del caso para no entrar en un bucle 

		}
	}

}

