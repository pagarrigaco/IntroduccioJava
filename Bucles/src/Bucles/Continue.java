package Bucles;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		for (int i=1; i<=10; i++)
		{
			if (i==7)
				continue; //es salta una iteració
			suma +=i;
		}
		
		System.out.print("La suma total excepte el 7 és de: "+suma);

	}

}
