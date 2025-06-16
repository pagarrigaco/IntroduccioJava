package Exercicis;

import java.util.Scanner;

public class exercici09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix el primer valor: ");
		double valor1 = sc.nextDouble();
		System.out.print("Introdueix el segon valor: ");
		double valor2 = sc.nextDouble();
		
		double valorAux = valor2;
		valor2 = valor1;
		valor1 = valorAux;
		
		System.out.print("Ara el valor1 correspon a "+valor1+" i el valor2 a "+valor2);
		

	}

}
