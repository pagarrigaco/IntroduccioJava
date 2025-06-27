package Bucles;

import java.util.Scanner;

public class exercici06 {

	 public static void main(String[] args) {
	        var sc = new Scanner(System.in);

	        System.out.print("Introdueix el primer número: ");
	        int num1 = sc.nextInt();

	        System.out.print("Introdueix el segon número: ");
	        int num2 = sc.nextInt();

	        int a = num1;
	        int b = num2;

	        while (b != 0) {
	            int r = a % b;
	            a = b;
	            b = r;
	        }

	        System.out.println("El màxim comú divisor de " + num1 + " i " + num2 + " és: " + a);
	        sc.close();
	    }
	}