package Bucles;

import java.util.Scanner;

public class exercici05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		int taula;
		 do {
			 System.out.println("Quina taula de multiplicar vols veure? ");
			 	taula = sc.nextInt();
	        } while (taula < 1 || taula > 10);
		
		
		System.out.println("La taula de multiplicar del "+taula+" és la següent");
		for (int i=1; i<=10;i++)
		{
			System.out.println(taula+"x"+i+" = "+(i*taula));
		}		
		sc.close();

	}

}
