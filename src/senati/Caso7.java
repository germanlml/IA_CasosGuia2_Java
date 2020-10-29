package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = scn.nextFloat();
		
		float impuesto = 0;
		
		if(sueldo <= 1500)
			impuesto = 0.03f * sueldo;
		// y -> && ; | -> o  alt + 124
		else if (sueldo > 1500 && sueldo <= 3000)
			impuesto = 0.8f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		System.out.println("R E S U L T A D O S");
		System.out.println("===================");
		System.out.println("Impuesto..........: " + df.format(impuesto));
		

		

	}

}
