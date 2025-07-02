package Cadenes;

import java.util.Scanner;

public class Exercici03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introdueix la cadena de caràcters: ");
		String cadena = sc.nextLine();
		Boolean repetit = false;
		char caracterRepetit =' ';
		int i =0;
		
		while (i< cadena.length() && !repetit)
		{
			char c = cadena.charAt(i);
			int j = i+1;
			while (j< cadena.length() && !repetit)
			{
				if (c == cadena.charAt(j))
				{
					repetit = true;
					caracterRepetit = c;
				}
				else
				{
					j++;
				}
			}
			i++;			
		}
		if (repetit) {
			System.out.println("El caràcter "+caracterRepetit+ " està repetit dins la cadena.");
		}else {
			System.out.println("No existeix cap caràcter repetit dins la cadena");
		}
		
		
		sc.close();
		

	}

}
