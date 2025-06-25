package Bucles;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 1;
		
		while (cont <=10) {
			System.out.println(cont);
			cont++;
		}
		
		var sc = new Scanner(System.in);
		System.out.print("Introdueix un nombre enter positiu: ");
		int valor = sc.nextInt();
		boolean primer = true;
		
		int divisor = 2;
		
		if (valor <2) {
			primer = false;
		}
		while ((divisor <= valor /2) && (primer)) {
			if (valor%divisor == 0)
			{
				primer = false;
			}
			divisor++;
		}
		if (primer) 
		{
			System.out.println("El número "+valor+" és un nombre primer");
		}else {
			System.out.println("El número "+valor+" no és un nombre primer");			
		}
		sc.close();

	}

}
