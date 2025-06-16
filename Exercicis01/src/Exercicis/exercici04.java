package Exercicis;

import java.util.Scanner;

public class exercici04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner (System.in);
		System.out.print("Introdueix el radi del cercle: ");
		double radi = sc.nextDouble();
		
		double area = Math.pow(radi,2) * Math.PI;
		double perimetre = 2 * Math.PI * radi; 
		
		System.out.println(area);
		System.out.println(perimetre);
		
	}

}
