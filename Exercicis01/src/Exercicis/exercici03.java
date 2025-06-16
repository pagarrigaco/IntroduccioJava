package Exercicis;

import java.util.Scanner;

public class exercici03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner (System.in);
		
		System.out.print("Introdueix l'alçada del rectangle: ");
		double alcada = sc.nextDouble();
		System.out.print("Introdueix l'amplada del rectangle: ");
		double amplada = sc.nextDouble();
		
		double area = alcada*amplada;
		double perimetre = (alcada*2) + (amplada*2);
		
		System.out.println("L'àrea del rectangle és de: " + area);
		System.out.println("El perímetre del rectangle és de: " + perimetre);
	
		
	}

}
