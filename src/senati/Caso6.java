package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = scn.nextFloat();
		
		float impuesto = 0;
		
		if(sueldo > 2800)
			impuesto = 0.05f * sueldo;
		else
			impuesto = 0.02f * sueldo;
			
		
		System.out.println("R E S U L T A D O S");
		System.out.println("===================");
		System.out.println("Impuesto..........: " + df.format(impuesto));
	}
}
