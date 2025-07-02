package Cadenes;

import java.util.Scanner;

public class Exercici01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.println("Introdueix la frase o paraula que vols analitzar: ");
		String entrada = sc.nextLine();
		
		String minuscules = entrada.toLowerCase();
		String entradaNeta = minuscules.trim();
		String entradaFinal ="";
		
		int longitud =entradaNeta.length();
		
		for (int i=0; i<longitud; i++)
		{
			String sub = entradaNeta.substring(i, i+1);
			if (!sub.isBlank()) {
				sub = switch(sub) {
					case "à","á" -> "a";
					case "è","é" -> "e";
					case "ò","ó" -> "e";
					case "ú" -> "u";
					case "í" -> "i";
					default -> sub;				
				};
				entradaFinal += sub;
			}
		}
		String inversa ="";
		for (int i= entradaFinal.length()-1; i>=0;i--)
		{
			inversa += entradaFinal.charAt(i);
		}
		
		if (entradaFinal.equals(inversa))
		{
			System.out.println("És un palíndrom");
		}else {
			System.out.println("No és un palíndrom");
		}
		sc.close();

	}

}
