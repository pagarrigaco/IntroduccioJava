package Bucles;

import java.util.Scanner;

public class Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.print("Introdueix el total de números que vols sumar: ");
		int total = sc.nextInt();
		int suma = 0;
		
		for(int i=0; i<=total;i++)
		{
			suma = suma+i;
		}
		System.out.println("La suma dels "+total+" primers números és de: "+suma);
		sc.close();
	}

}
