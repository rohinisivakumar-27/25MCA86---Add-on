package conditionalstatement;

import java.util.Scanner;

public class OddorEven {

		public static void main(String[] args) {
				/*
				 * . Odd or Even
		   Check whether the number is odd or even.
		   Sample Input: 10
		   Sample Output: Even
		*/
		Scanner in=new Scanner(System.in);
		int a = in.nextInt();
		if (a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		in.close();
			}
			


	}


