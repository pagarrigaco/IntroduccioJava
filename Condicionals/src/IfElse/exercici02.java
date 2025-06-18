package IfElse;

import java.util.Scanner;

public class exercici02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix el número de dia: ");
		int dia = sc.nextInt();
		
		String nom = switch(dia) {
			case 1 -> "Dilluns";
			case 2 -> "Dimarts";
			case 3 -> "Dimecres";
			case 4 -> "Dijous";
			case 5 -> "Divendres";
			case 6 -> "Dissabte";
			case 7 -> "Diumenge";
			default -> "Valor erroni";			
		};
		
		System.out.println("El dia "+dia+" de la setmana, correspon a: "+nom);
		sc.close();

	}

}
