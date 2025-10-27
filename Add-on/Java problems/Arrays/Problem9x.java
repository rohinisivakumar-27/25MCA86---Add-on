package arrays;

import java.util.Scanner;

public class Problem9x {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   //Getting element in user defined format
	   
	   System.out.print("Enter the size of array: ");
	   int n = sc.nextInt();
	   
	   int[] arr = new int[n];
	   
	   System.out.println("Enter the array elements");
	   for(int i = 0; i<n; i++) {
		   arr[i] = sc.nextInt();
		  
	   }
       System.out.print("\n original array: ");
       for(int i = 0; i<n; i++) {
    	   System.out.print(arr[i]+" ");
       }
       //To remove duplicate elements
       int[] temp = new int[n];
       int newLength = 0;
       
       for(int i = 0; i<n; i++) {
    	   boolean isDuplicate = false;
    	   for(int j = 0; j<newLength; j++) {
    		   if(arr[i] == temp[j]) {
    			   isDuplicate = true;
    			   break;
    		   }
    	   }
    	   if(!isDuplicate ) {
    		   temp[newLength++] = arr[i];
    	   }
    		  
       }
        System.out.print("\n Removed Duplicate elements: ");
        for(int i = 0; 1<newLength; i++) {
        	System.out.print(temp[i]+"  ");
        }
       sc.close();
	}

}
