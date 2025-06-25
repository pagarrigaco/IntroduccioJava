package Bucles;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner (System.in);
		int valor;
		
		do {
			System.out.println("Introdueix un valor: ");
			valor = sc.nextInt();			
		} while (valor<1 || valor >10);
		System.out.println("Final del programa");
		sc.close();

	}

}
