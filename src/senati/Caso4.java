package senati;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese priemr n�mero: ");
		int a = scn.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int b = scn.nextInt();
		
		if (a == b)
			System.out.println("Los dos n�meros son iguales");
		else if (a < b)
			System.out.println("El primer n�mero es menor");
		else
			System.out.println("El segundo n�mero es menor");

	}

}
