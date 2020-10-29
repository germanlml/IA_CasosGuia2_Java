package senati;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String escala = "Nota fuera de rango";
		System.out.println("Ingrese nota: ");
		int nota = scn.nextInt();
		
		if (nota >= 0 && nota <= 7)
			escala = "Sin Palabras";
		else if(nota >= 8  && nota <= 10)
			escala = "Malo";
		else if(nota >= 11  && nota <= 14)
			escala = "Regular";
		else if(nota >= 15  && nota <= 17)
			escala = "Notable";
		else if(nota >= 18  && nota <= 20)
			escala = "Excelente";
		
		System.out.println("Estado Obtenido: " + escala);

	}

}
