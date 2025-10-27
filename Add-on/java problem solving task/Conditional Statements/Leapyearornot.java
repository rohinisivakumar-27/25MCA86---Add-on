package conditionalstatement;

import java.util.Scanner;

public class Leapyearornot {

	public static void main(String[] args) {
		/*
		 * Leap Year Logic
*4. Check Leap Year or Not
   Check if a given year is a leap year.
   Sample Input: 2024
   Sample Output: Leap Year
*/
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Year");
		 // User Input 
		int year = in.nextInt();
		
		//Logic : Year % 4 years
		 
		if (year % 4==0)
		{
			System.out.println("year:"+ year);
		}
		else {
			System.out.println("Not Leap Year");
		}
		in.close();

	}

}