package arrays;

public class Problem5 {

	public static void main(String[] args) {
		int[] arr = {15, 2, 7, 20, 9};
		
		int max = arr[0]; //15
		
		for (int i = 1; i<arr.length; i++) {
				if(arr[1]>max) {
					max = arr[1];
				}
	}
    System.out.println("Largest elements: "+max);
}
}
