package Arrays;

public class exercici01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 10, 9, 15, 25, 6, 3};
		int max = array[0];
		
		for (int i=1; i<array.length;i++){
			if (max<array[i])
			{
				max = array[i];
			}
		}
		
		System.out.println("El valor màxim d'aquest array és: "+max);

	}

}
