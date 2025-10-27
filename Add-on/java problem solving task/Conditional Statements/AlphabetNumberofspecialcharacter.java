package conditionalstatement;

import java.util.Scanner;

public class AlphabetNumberofspecialcharacter {

	public static void main(String[] args) {
		/*
		 * 3. Alphabet, Number, or Special Character
   Identify the type of the character.
   Sample Input: @
   Sample Output: Special Character

		 * */
		Scanner in = new Scanner(System.in);
System.out.println("Enter the Letter");
		
		char al= in.next().charAt(0);
		if (al>='a' && al<='z' || al>='A' && al<='Z')
		{
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special Charcter");
			
		}
in.close();
	}


	}