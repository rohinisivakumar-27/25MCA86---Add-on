package conditionalstatement;

import java.util.Scanner;

public class Validtime {

	public static void main(String[] args) {
		
		/*
		 * 8. Validate Time
   Check if time is valid in HH\:MM format.
   Sample Input: 13:45
   Sample Output: Valid Time
*/
		Scanner in =new Scanner(System.in);
		
		int hours =in.nextInt();
		int mins = in.nextInt();
		
		if (hours<=24) {
			if (mins<60) {
				
				System.out.println(hours+":"+mins );
			}
			else {
				System.out.println("Invaild");
			}
		}
		in.close();
		
	}

}