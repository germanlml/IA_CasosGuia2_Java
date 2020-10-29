package senati;

import java.util.Scanner;
public class Caso15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Cliente: ");
		String nombre = scn.nextLine();
		System.out.println("Producto [TB/LT/MN/IM]: ");
		String cod_producto = scn.nextLine();
		System.out.println("Cantidad: ");
		int cantidad = scn.nextInt();
		
		
		scn.nextLine();//reiniciar la lectura de string
		
		System.out.println("Forma de pago [C1/C2]: ");
		String cod_forma = scn.nextLine();
		
		float precio = 0;
		String nombre_producto = "";
		switch (cod_producto) {
			case "TB":
				precio = 350; 
				nombre_producto = "Tablet";
				break;
			case "LT":
				precio = 2300;
				nombre_producto = "Laptop Core I5 8GB RAM";
				break;
			case "MN":
				precio = 850;
				nombre_producto = "MonitorM";
				break;
			case "IM":
				precio = 680;
				nombre_producto = "Impresora";
				break;
		}
		
		float importe = cantidad * precio;
		float valor = 0;
		String forma_pago = "Forma de pago desconocido";
		switch (cod_forma) {
			case "C1":
				valor = importe - importe * 0.05f;
				forma_pago = "Contado";
				break;
			case "C2":
				valor = importe + importe * 0.12f;
				forma_pago = "Crédito";
				break;
		}
		System.out.println("\nResultados");
		System.out.println("===========");
		System.out.println("Cliente..........: " + nombre);
		System.out.println("Producto.........: " + nombre_producto);
		System.out.println("Precio...........: " + precio);
		System.out.println("cantidad.........: " + cantidad);
		System.out.println("Importe..........: " + importe);
		System.out.println("Forma de pago....: " + forma_pago);
		System.out.println("Descuento........: " + valor);
		if (cod_forma.equals("C1")) {
			System.out.println("Descuento........: " + (importe - valor));
			System.out.println("Total a pagar....: " + valor);
		}
		else if (cod_forma.equals("C2")) {
			System.out.println("Incremento.....: " + importe + valor);
			System.out.println("Total a pagar..: " + valor);
		}
	}

}
