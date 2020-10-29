package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre: ");
		String nombre = scn.nextLine();
		System.out.print("Ingrese horas trabajadas: ");
		float horas = scn.nextInt();
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = scn.nextFloat();
		System.out.print("Ingrese minutos de tardanza: ");
		float tardanza = scn.nextFloat();
		
		float importe = horas * tarifa;
		float bono = 0, dsct = 0, meta = 100;
		
		if (horas > 60)
			bono = 0.13f * importe;
		else
			bono = 0.04f * importe;
		
		if(horas <= 70)
			meta = horas / 70 * 100;
		
		
		if(tardanza > 15)
			dsct = 0.03f * importe;
		
		
		System.out.println("----------");
		System.out.println("Resultado");
		System.out.println("----------");
		System.out.println("Trabajador........: " + nombre);
		System.out.println("Horas trabajadas..: " + horas);
		System.out.println("Tarifa por horas..: " + tarifa);
		System.out.println("Importe...........: " + df.format(importe));
		System.out.println("Bono..............: " + df.format(bono));
		System.out.println("Descuento.........: " + df.format(dsct));
		System.out.println("Meta alcanzada....: " + df.format(meta) + "%");
		
		
		
		
		

	}

}
