package arrays;

public class Problem7x {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 5};
		int element = 2;
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == element) { // arr[0]
				count++;
			}
			
		}
        System.out.println("Count occurance of element 2 is: "+count);
	}

}
