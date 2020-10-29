package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese primer número: ");
		float num1 = scn.nextInt();
		System.out.print("Ingrese segundo número: ");
		float num2 = scn.nextInt();
		System.out.println("Sean: [1]Suma - [2]Resta - [3]Producto - [4]Division - [5]Resto entero - [6]Promedio");
		System.out.print("Ingrese numero de operación: ");
		int num = scn.nextInt();
		
		if (num >=1 && num <=6) {
		float resultado = 0;
		String nombre = "";
		
		switch (num) {
			case 1:
				resultado = num1 + num2;
				nombre = "Suma";
				break;
			case 2:
				resultado = num1 - num2;
				nombre = "Resta";
				break;
			case 3:
				resultado = num1 * num2;
				nombre = "Producto";
				break;
			case 4:
				
				if (num2 != 0) {
					resultado = num1 / num2;
					nombre = "División";
				}
				else {
					nombre = "No es posible hallar la división";
					resultado = 0;
				}
				break;
			case 5:
				
				if (num2 != 0) {
					nombre = "Resto Entero";
					resultado = num1 % num2;
					}
				else {
					nombre = "No es posible hallar el resto entero";
					resultado = 0;
				}
					
				break;
			case 6:
				resultado = (num1 + num2) / 2;
				nombre = "Promedio";
				break;
			}
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Numero 1............: " + num1);
		System.out.println("Número 2............: " + num2);
		System.out.println("Operación...........: " + nombre);
		System.out.println("Resultado...........: " + df.format(resultado));
		}
		else 
			System.out.println("Operacion Invalida");
	}

}
