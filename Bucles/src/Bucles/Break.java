package Bucles;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix un nombre enter positiu: ");
		int valor = sc.nextInt();
		
		boolean primer = true;
		
		if (valor <2) {
			primer = false;
		}
		for (int i=2; i<valor; i++)
		{
			if (valor % i == 0) {
				primer = false;
				break;
			}
		}
		if (primer)
		{
			System.out.println("El número "+valor+" és un nombre primer");
		}
		else
		{
			System.out.println("El número "+valor+" no és un nombre primer");		
		}
		
		sc.close();

	}

}
