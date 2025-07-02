package Arrays;

import java.util.Arrays;

public class Exercici02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,4,5,6,6,6,7,8,8,9};
		int length = array.length;
		
		for (int i=0; i<length; i++)
		{
			for (int j=i+1; j<length;j++)
			{
				if (array[i] == array[j])
				{
					array[j] =array[length-1];
					//Després de primera iteracio {1,2,3,4,9,5,6,6,6,7,7,8,9,9,9};
					// length -> 13 -> 12
					length--;
					j--;
				}
			}
		}
		
		int[] nouArray = Arrays.copyOf(array, length);
		for (var elem:nouArray)
		{
			System.out.print(elem+", ");
		}
		
	}

}
