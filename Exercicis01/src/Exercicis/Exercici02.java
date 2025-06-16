package Exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner (System.in);
		//var sc2 = new Scanner (System.in).useLocale(Locale.US); Si volem utilitzar el sistema de puntació americà
		
		System.out.print("Introdueix la nota del primer trimestre: ");
		double nota1 = sc.nextDouble();
		System.out.print("Introdueix la nota del segon trimestre: ");
		double nota2 = sc.nextDouble();
		System.out.print("Introdueix la nota del tercer trimestre: ");
		double nota3 = sc.nextDouble();
		
		double notaMitja = (nota1+nota2+nota3) / 3;
		double notaArrodonida = Math.round(notaMitja);
		
		System.out.println("La nota mitjana de l'alumne és de " + notaMitja);
		System.out.println("La nota mitjana de l'alumne un cop arrodonida és de " + notaArrodonida);
		String resultat = (notaArrodonida>=5) ? "APROVAT" : "SUSPÈS";
		System.out.println("Amb aquesta qualificació l'alumne està " + resultat);
		
	}

}
