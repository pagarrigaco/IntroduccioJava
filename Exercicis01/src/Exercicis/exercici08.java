package Exercicis;

import java.util.Scanner;

public class exercici08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix el primer número: ");
		double valor1 = sc.nextDouble();
		System.out.print("Introdueix el segon número: ");
		double valor2 = sc.nextDouble();
		System.out.print("Introdueix el tercer número: ");
		double valor3 = sc.nextDouble();
		
		double mitjana = (valor1+valor2+valor3)/3;
		
		System.out.print("La mitjana d'aquests valors és: "+mitjana);

	}

}
