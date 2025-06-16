package Exercicis;

import java.util.Scanner;

public class exercici05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sc = new Scanner(System.in);
		System.out.print("Introdueix el valor actual de l'euro respecte el dolar: ");
		double valor = sc.nextDouble();
		System.out.print("Quantitat d'euros: ");
		double euros = sc.nextDouble();
		
		double dolars = valor * euros;
		
		System.out.print("Amb el canvi actual "+euros+" equivalen a "+dolars+" dolars");
		
		
		
	}

}
