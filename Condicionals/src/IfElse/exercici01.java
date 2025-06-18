package IfElse;

import java.util.Scanner;

public class exercici01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.print("Introdueix el dia (1-31): ");
		int dia = sc.nextInt();
		System.out.print("Introdueix el mes (1-12): ");
		int mes = sc.nextInt();
		
		String estacio = "";
		
		if (mes ==1 || mes ==2 || (mes == 3 && dia <=20) || (mes == 12 && dia >=21))
		{
			estacio = "hivern";
		} else if (mes == 4 || mes == 5 || (mes ==3 && dia >20) || (mes == 6 && dia <21)) {
			estacio = "primavera";
		} else if (mes ==7 || mes == 8 || (mes == 6 && dia >=21) || (mes ==9 && dia <21) ) {
			estacio = "estiu";
		} else if (mes == 10 || mes == 11 || (mes == 9 && dia >=21) || (mes == 12 && dia <21)) {
			estacio ="tardor";
		}
		
		System.out.println("L'estació corresponent del dia indicat és: " + estacio);
		sc.close();

	}

}
