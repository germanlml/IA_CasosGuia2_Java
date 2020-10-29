package senati;

import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int edad = 0;
		System.out.print("Ingrese edad: ");
		edad = scn.nextInt();
		
		if (edad >= 18)
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");

	}

}
