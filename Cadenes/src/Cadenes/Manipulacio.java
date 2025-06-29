package Cadenes;

public class Manipulacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String missatge = "Hola" + "mon";
		System.out.println(missatge);
		
		String msg2 = "Hola";
		msg2 += " a tots";
		
		System.out.println(msg2);
		
		String msg3 = "Hola";
		msg3 = msg3.concat(" com esteu");
		
		System.out.println(msg3);
		
		String msg4 ="El preu resultant és: ";
		msg4 += 35;
		
		System.out.println(msg4);
		
		String msg5 = String.format("Hola em dia %s i soc de Quart", "Pau");
		System.out.println(msg5);
		
		String nom = "Montse";
		String msg6 = String.format("Hola em dia %s i soc de Quart", nom);
		System.out.println(msg6);
		

	}

}
