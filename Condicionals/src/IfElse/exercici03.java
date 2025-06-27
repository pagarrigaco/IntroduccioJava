package IfElse;

import java.util.Scanner;

public class exercici03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.print("Introdueix la nota de l'estudiant: ");
		int nota = sc.nextInt();
		
		String literal = switch(nota)
		{
		case 10,9 -> "Excel·lent";
		case 8,7 -> "Notable";
		case 5,6 -> "Suficient";
		case 2,3,4 -> "Insuficient";
		case 0,1 -> "Molt deficient";
		default -> "Nota incorrecte";
		};
		System.out.println("El resultat d'aquest alumne és: "+literal);
		sc.close();
	}

}
