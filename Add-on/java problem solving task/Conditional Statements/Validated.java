package conditionalstatement;

import java.util.Scanner;

public class Validated {

	public static void main(String[] args) {
		/*
		 * 7. Validate Date
   Check if the entered date is valid (dd/mm/yyyy).
   Sample Input: 29/02/2020

*/
		Scanner in =new Scanner(System.in);
		
		int dd =in.nextInt();// date
		int mm = in.nextInt();// month
		int yyyy=in.nextInt();//year
		
		if(dd<=31  && mm<=12  && yyyy>0) 
		{
			if(mm>=1 && mm<=12)
	{
							{
				if(dd>1 && dd<=31)
			
		
		
		
		System.out.println(dd +"/"+ mm+"/"+ "/"+ yyyy);
		System.out.println("valid date");
		}
		}}
		else
		{
			System.out.println(dd +"/"+ mm+"/"+ "/"+ yyyy);
			System.out.println("invalid date");
		}
		in.close();

	}
	


	}
