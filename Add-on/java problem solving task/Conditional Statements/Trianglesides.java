package conditionalstatement;

import java.util.Scanner;

public class Trianglesides {

	public static void main(String[] args) {
/*
 * 6. Check if 3 sides form a Triangle
   Check triangle condition: a + b > c, etc.
   Sample Input: 3 4 5
   Sample Output: Triangle is possible
   
   Problem Statement:
    

*/
		Scanner in =new Scanner(System.in);
		// Declare the variables 
		//User name.nextint()
		int a= in.nextInt();
		int b= in.nextInt();
		int c = in.nextInt();
		
		
		//Using If Condition 
		if (a+b>c) {
			System.out.println("Triangle is Possible ");
			
		}
		else {
			System.out.println("Invaild ");
		}
		in.close();

	}

}
