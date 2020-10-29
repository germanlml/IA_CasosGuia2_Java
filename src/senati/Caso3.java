package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Ingrese numero 1: ");
		n1 = scn.nextInt();
		System.out.println("Ingrese numero 2: ");
		n2 = scn.nextInt();
		System.out.println("Ingrese numero 3: ");
		n3 = scn.nextInt();
		
		String estado = "";
		
	if (n1 == n2 && n1 == n3)
		estado = "Los tres numero son iguales";
	else if(n1 > n2 && n2 > n3)
		estado = "El primer numero " + n1 + " es mayor";
	else if(n2 > n1 && n2 > n3)
		estado = "El segundo numero " + n2 + " es mayor";
	else
		estado = "El tercer numero " + n3 + " es mayor";
	
	System.out.println("Resultado: " + estado);
	
		

	}

}
