package Cadenes;

import java.util.Scanner;

public class Exercici04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.print("Introdueix la cadena que vols analitzar: ");
		String cadena = sc.nextLine();
		int total = 0;
		
		for (int i=0; i<cadena.length(); i++) {
			char c = cadena.charAt(i);
			switch(c)
			{
				case 'a','e','i','o','u': total+=1; break;
				default: break;
			}
		}
		System.out.println("En aquesta cadena hi ha un total de "+total+" vocals.");
		

	}

}
