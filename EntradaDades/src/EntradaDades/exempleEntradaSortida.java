package EntradaDades;

import java.util.Scanner;

public class exempleEntradaSortida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.print("Introdueix un número: ");
		int numero = sc.nextInt();
		
		System.out.print("El número és: ");
		System.out.println(numero);
		
		System.out.print("Introdueix la base del rectangle: ");
		double base = sc.nextDouble();
		System.out.print("Introdueix l'alçada del rectangle: ");
		double alcada = sc.nextDouble();
		System.out.println("El resultat és: " + base * alcada);
		
		System.out.printf("%.1f", base*alcada); //definim el format com volem mostrar el resultat
		
		sc.close();

	}

}
