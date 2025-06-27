package IfElse;

import java.util.Scanner;

public class exercici04 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			var sc = new Scanner(System.in);
			System.out.print("Introdueix la nota de l'estudiant: ");
			int nota = sc.nextInt();
			
			String literal="";
			
			switch(nota)
			{
				case 9,10 : literal="Excel·lent"; break;
				case 7,8 : literal="Notable"; break;
				case 5,6 : literal="Suficient"; break;
				case 2,3,4 : literal="Insuficient"; break;
				case 0,1 : literal ="Molt deficient"; break;
				default: literal ="Nota incorrecte"; break;
			}
			System.out.println("El resultat d'aquest alumne és: "+literal);
			sc.close();
		}
}

