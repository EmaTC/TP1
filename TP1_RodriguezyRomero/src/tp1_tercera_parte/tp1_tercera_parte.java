package tp1_tercera_parte;

import java.util.Scanner;

public class tp1_tercera_parte {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char talle;
		
		int cantidad;
		
		int descuento;
		
		int desc;
		System.out.println("\tIngrese su talle de remera (S, M o L) ");
		talle = entrada.next().charAt(0);
		
		
		
		switch(talle) {
		
		case 'S':
			
			System.out.println("cuantas remeras desea comprar?" );
			cantidad = entrada.nextInt();
			
			if(cantidad > 30) {
				System.out.println("no hay el suficiente stock" );
			}
			else if(cantidad >= 15 && cantidad<=30) {
				
				cantidad = cantidad*5500;
				
				descuento = cantidad/100*15;//50
				
				desc = cantidad - descuento;//800068-50
				
				System.out.println("\nprecio remeras: "+ cantidad +"\ntotal del descuento: "+ descuento +"\nel precio total es: "+desc );
			}
			
			else if(cantidad < 15) {
				
					cantidad = cantidad*5500;
				
					System.out.println("\nel precio total es: "+ cantidad);
			
			}
			else {
			
				System.out.println("el valor ingresado es incorrecto intente de nuevo");
			}
			
		break;	
		  
		case 'M': 
			System.out.println("cuantas remeras desea comprar?" );
			cantidad = entrada.nextInt();
			
			
			if(cantidad > 40) {
				System.out.println("no hay el suficiente stock" );
			}
			else if(cantidad >= 22 && cantidad<=40) {
				
				cantidad = cantidad*5500;
				
				descuento = cantidad/100*15;
				
				desc = cantidad - descuento;
				
				System.out.println("\nprecio remeras: "+ cantidad +"\ntotal del descuento: "+ descuento +"\nel precio total es: "+desc );
			}
			
			else if(cantidad < 22) {
				
					cantidad = cantidad*5500;
				
					System.out.println("\nel precio total es: "+ cantidad);
			
			}
			else {
			
				System.out.println("el valor ingresado es incorrecto intente de nuevo");
			}
			
			break;
		case 'L':
			System.out.println("cuantas remeras desea comprar?" );
			cantidad = entrada.nextInt();
			if(cantidad > 50) {
				System.out.println("no hay el suficiente stock" );
			}
			else if(cantidad >= 35 && cantidad<=50) {
				
				cantidad = cantidad*5500;
				
				descuento = cantidad/100*15;
				
				desc = cantidad - descuento;
				
				System.out.println("\nprecio remeras: "+ cantidad +"\ntotal del descuento: "+ descuento +"\nel precio total es: "+desc );
			}
			
			else if(cantidad < 35) {
				
					cantidad = cantidad*5500;
				
					System.out.println("\nel precio total es: "+ cantidad);
			
			}
			else {
			
				System.out.println("el valor ingresado es incorrecto intente de nuevo");
			}
			System.out.println("cuantas remeras desea comprar?" );	
			
			break;
			
		default:
			System.out.println("Error, empiece de nuevo.");
		break;
}
 }
}
