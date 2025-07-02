package Cadenes;

import java.util.Scanner;

public class Exercici02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			var sc = new Scanner(System.in);
			boolean teMajuscules = false;
			boolean teMinuscules = false;
			boolean teNumeros = false;
			boolean teCaractersDiferents = false;
			boolean longitudCorrecte = false;
			int i = 0;
			
			System.out.print("Introdueix la contrasenya a analitzar: ");
			String password = sc.nextLine();
			//comprovem la longitud
			if (password.length()>=8 && password.length()<=20) {
				longitudCorrecte = true;
				
				while (!teMajuscules && !teMinuscules && !teNumeros && !teCaractersDiferents && (i<password.length()))
				{				
					for (int j=0; j<password.length(); j++) {
						char c = password.charAt(j);
						
						if (Character.isUpperCase(c)) {
							teMajuscules = true;
						}
						if (Character.isLowerCase(c)) {
							teMinuscules = true;
						}
						if (Character.isDigit(c)) {
							teNumeros = true;
						}
						if (((int)c >=58 && (int)c<=64) ||((int)c >=33 && (int)c<=47) || ((int)c >=91 && (int)c<=96) || ((int)c >=123 && (int)c<=126) ){
							teCaractersDiferents = true;
						}
					}
				}
				if (teMajuscules && teMinuscules && teNumeros && teCaractersDiferents) {
					System.out.println("Aquesta contrasenya compleix tots els requisits");
				}else {
					System.out.println("Aquesta contrasenya no compleix algun dels requisits");
				}
			
			
			}else {
				System.out.println("Aquesta contrasenya no compleix la llargada exigida");
			}
			
			
			
	}

}
