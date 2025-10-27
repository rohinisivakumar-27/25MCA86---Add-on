package arrays;

public class Problem8x {

	public static void main(String[] args) {
	    int[] arr = {7, 1, 5, 3, 9, 2};
	    int min1 = Integer.MAX_VALUE;
	    int min2 = Integer.MAX_VALUE;
	    
	    /**
	     * wrapper class
	     * Autoboxing
	     * -->Converting primitive to object
	     * 
	     * int-->Integer
	     * char-->Character
	     * float-->Float
	     * double-->Double
	     * long-->Long
	     * short-->Short
	     * boolean-->Boolean
	     * byte-->Byte
	     * 
	     * unboxing
	     * -->Converting object to primitive
	     */
         for(int i = 0; i<arr.length; i++) {
        	 if(arr[i] < min1) {
        		 min2 = min1;
        		 min1 = arr[i];
        	 }else if(arr[i] < min2 && arr[i] !=min1) {
        		 min2 = arr[i];
        	 }
         }
         System.out.println("Second smallest number : "+min2);
	}


}
