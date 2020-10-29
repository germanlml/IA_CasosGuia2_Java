package senati;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Nombre del empleado: ");
		String nombre = scn.nextLine();
		System.out.println("Nivel [1-4]: ");
		int nivel = scn.nextInt();
		System.out.println("Sueldo: ");
		float sueldo = scn.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
		case 1:
			incremento = 0.045f; break;
		case 2:
			incremento = 0.06f; break;
		case 3:
			incremento = 0.085f; break;
		case 4:
			incremento = 0.11f; break;
		
		}
		
		float nuevo_sueldo = sueldo * (1 + incremento);
		
		System.out.println("\nResultados");
		System.out.println("===========");
		System.out.println("Empleado.........: " + nombre);
		System.out.println("Nivel............: " + nivel);
		System.out.println("Sueldo...........: " + sueldo);
		System.out.println("Incremento.......: " + incremento * 100 + "%");
		
	}

}
