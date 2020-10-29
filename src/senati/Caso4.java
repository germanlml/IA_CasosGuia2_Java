package senati;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese priemr número: ");
		int a = scn.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		int b = scn.nextInt();
		
		if (a == b)
			System.out.println("Los dos números son iguales");
		else if (a < b)
			System.out.println("El primer número es menor");
		else
			System.out.println("El segundo número es menor");

	}

}
