package IfElse;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 8;
		String missatge = switch(nota) {
			case 10, 9 -> "Excel·lent";
			case 8,7 -> "Notable";
			case 6,5 -> "Suficient";
			case 4,3,2,1 -> "Suspès";
			case 0 -> "Molt deficient";
			default -> "No avaluat";
		};
		
		System.out.print(missatge);

	}

}
