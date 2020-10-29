package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese alumno: ");
		String alumno = scn.nextLine();
		System.out.print("Ingrese Carrera[DS/RC/DG]: ");
		String carrera = scn.nextLine();
		System.out.print("Ingrese turno [M/T/N]: ");
		String turno = scn.nextLine();
		
		String nombre_carrera = "Carrera desconocida";
		String nombre_turno = "Turno desconocido";
		float monto = 0, descuento = 0;
		
		
		switch (carrera) {
			case "DS":
				nombre_carrera = "Desarrollo de Software";
				monto = 1500;
				break;
			case "RC":
				nombre_carrera = "Redes y Conectividad";
				monto = 1400;
				break;
			case "DG":
				nombre_carrera = "Diseño Gráfico";
				monto = 1300;
				break;
		}
		switch (turno) {
			case "M":
				nombre_turno = "Mañana";
				descuento = 0.10f * monto;
				break;
			case "T":
				nombre_turno = "Tarde";
				descuento = 0.20f * monto;
				break;
			case "N":
				nombre_turno = "Noche";
				descuento = 0.15f * monto;
				break;
		}
		float total = monto - descuento;
		float cambio = total / 3.33f;
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Monto...................: " + monto);
		System.out.println("Nombre del turno........: " + nombre_turno);
		System.out.println("Descuento...............: " + df.format(descuento));
		System.out.println("Total a pagar...........: " + df.format(total));
		System.out.println("Equivalente en dolares..: " + df.format(cambio));
		

	}

}
