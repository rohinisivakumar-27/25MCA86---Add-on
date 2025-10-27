package arrays;

public class Problem3 {

	public static void main(String[] args) {
		int[] arr = {4, 7, 9, 10, 5};
		int search = 7;
		boolean found = false;
		
		for(int num: arr) {
			if(num == search) {
				found = true;
				break;
			}
		}
 if(found) {
	 System.out.println("present");	 
 }else {
	 System.out.println("Not present");	 
 }
	}

}
