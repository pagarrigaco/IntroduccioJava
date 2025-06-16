package Exercicis;

import java.util.Scanner;

public class exercici010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix la velocitat a la que es desplaça l'objecte: ");
		double velocitat = sc.nextDouble();
		System.out.print("Introdueix el temps que està en moviment l'objecte: ");
		int temps = sc.nextInt();
		
		double distancia = velocitat * temps;
		
		System.out.print("L'objecte ha recorregut un total de "+distancia+" kilometres");
		

	}

}
