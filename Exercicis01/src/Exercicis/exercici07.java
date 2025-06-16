package Exercicis;

import java.util.Scanner;

public class exercici07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix el primer número: ");
		int valor1 = sc.nextInt();
		System.out.print("Introdueix el segon número: ");
		int valor2 = sc.nextInt();
		
		int suma = valor1+valor2;
		int resta = valor1-valor2;
		int multiplicacio = valor1*valor2;
		int divisio = valor1/valor2;
		int resto = valor1%valor2;
		
		System.out.println("Suma:  "+suma);
		System.out.println("Resta:  "+resta);
		System.out.println("Multiplicació:  "+multiplicacio);
		System.out.println("Divisió:  "+divisio);
		System.out.println("Resto:  "+resto);
		

	}

}
