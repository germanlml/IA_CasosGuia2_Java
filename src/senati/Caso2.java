package senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero = 0;
		System.out.print("Ingrese numero: ");
		numero = scn.nextInt();
		
		String estado = "Número es impar";
		
		if (numero % 2 == 0)
			estado = "Numero es par";
		
		System.out.println("El numero " + numero + "es " + estado);

	}

}
