package arrays;

public class Sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5}; // initializing the value to array
		
		int sum = 0; //Local Variable initialization
		
		//Iterating using  for each loop
        for(int num:arr) {
        	sum+=num; // sum = sum+num
        }
        
        System.out.println("The sum of array: "+sum);	
        }

}
