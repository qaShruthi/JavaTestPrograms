package JavaTestPrograms;

import java.util.Arrays;

public class BubbleSortRotateArray {
	
	public static void rotate(int[] arr, int order)
	{
		for(int i =0; i< order; i++)
		{
			for(int j= arr.length - 1; j>0 ; j--)
			{
				int temp = arr[j];
				arr[j]= arr[j-1];
				arr[j-1]= temp;
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		int[] arrb = {0,1,2,3,4,5};
		System.out.println("Original array: " + Arrays.toString(arrb));
		//Bubble Sort
		BubbleSortRotateArray bSort = new BubbleSortRotateArray();
		bSort.rotate(arrb, 5);
		
	}
	
}


 
