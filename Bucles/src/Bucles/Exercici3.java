package Bucles;

import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.println("Introdueix un número: ");
		int valor = sc.nextInt();
		int valorAux = valor;
		int comptador = 0;
		
		while (valorAux !=0)
		{
			valorAux = valorAux/10;
			comptador++;
		}
		System.out.println("El número "+valor+" té un total de "+comptador+" dígits");
		sc.close();
	}

}
