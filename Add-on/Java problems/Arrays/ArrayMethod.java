package arrays;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        //sort an array
		int[] arr = {5, 8, 6, 4, 7};
		
		System.out.println("Before sorting: "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
		//BinarySearch
	
		int index = Arrays.binarySearch(arr, 6);
		System.out.println("\n Binary search element index: "+index);
		
		//Copy an array
		
		int[] original = {4, 8, 6, 3, 0};
		
		System.out.println("\n original elements: "+Arrays.toString(original));
		int[] copy = Arrays.copyOf(original, original.length);
		
		System.out.println("\n Copying entire elements: "+Arrays.toString(copy));
		
		
		// copy of Range
		int[] copyRange = Arrays.copyOfRange(original, 0, 3); // des-1
		
		System.out.println("\n Copy based on range:"+Arrays.toString(copyRange));
	
		//Cloning Arrays
		
		int[] arr1 = {25, 45, 78};
		
		System.out.println("\n Original elements: "+Arrays.toString(arr1));
		
		int[] clone = arr.clone();
		
		System.out.println("\n Cloned elements: "+Arrays.toString(clone));
	
	
	
	}
}
		
		


