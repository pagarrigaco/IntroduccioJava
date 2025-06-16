package Exercicis;

import java.util.Scanner;

public class exercici01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix el preu de fabricació del portàtil: ");
		double preuBase = sc.nextDouble();
		
		double margeBenefici = 0.3;
		double impostos = 0.21;
		
		double preuAmbBeneficis = preuBase + (preuBase*margeBenefici);
		double impostosAplicats = preuAmbBeneficis * impostos;
		double preuFinal = preuAmbBeneficis + impostosAplicats;
		
		System.out.println("Preu final del portàtil: " + preuFinal + " euros");
		
		String tipusPreu = (preuFinal <=600) ? "NORMAL" : "DE LUXE";
		System.out.println("El portàtil és de tipus " + tipusPreu);
		sc.close();
	}

}
