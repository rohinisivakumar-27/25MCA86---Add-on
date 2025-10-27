package conditionalstatement;

import java.util.Scanner;

public class Maximumnumbers {

	public static void main(String[] args) {
		/*
		 * 2. Find maximum of 2, 3, 4 numbers
   Use if-else ladder or nested if to find the maximum.
   Sample Input: 7 15 3 9
   Sample Output: Maximum: 15

*/
		// Condition "Using if-else or Nested if 
		
		
		//declare the variable
		 Scanner in =new Scanner(System.in);
		 //
		 System.out.println("enter");
		 int a=in.nextInt();
		 int b =in.nextInt();
		 int c =in.nextInt();
		 int d = in.nextInt();
		 // Condition if {if{}}
		 if (a>b) {
			 if((a>c)& (a>d)) {
				 System.out.println(a);
			 }}
			 else if(b>c) {
				 if (b>d) {
					 System.out.println(b);
				 }}
				 else if (c>d) {
					 System.out.println(c);
				 }
				 else
				 {
					 System.out.println(d);
				 }
		 in.close();
			 }
	
		

	}