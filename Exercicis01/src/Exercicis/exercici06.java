package Exercicis;

import java.util.Scanner;

public class exercici06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix un valor: ");
		int valor = sc.nextInt();
		
		String resultat = (valor%2 == 0) ? "PARELL" : "IMPARELL";
		
		System.out.print("El número "+valor+" és un número "+resultat);

	}

}
