package conditionalstatement;

import java.util.Scanner;

public class Dayofweek {

	public static void main(String[] args) {
		/*
		 * 5. Print Day based on input (1-7)
   Map numbers 1-7 to days of the week.
   Sample Input: 3
   Sample Output: Wednesday
*/
		Scanner in =new Scanner(System.in);
		//User Input 
		int n =in.nextInt();
		
		// Condition "Switch Statement"
		
		switch(n){
		case 1:{
			System.out.println("Monday");
			break;//Condition is Break
		}
		case 2:{
			System.out.println("Tuesday");
			break;
			
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thusday");
			break;
		}
		case 5:{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
			break;
		}
		case 7:
		{System.out.println("Sunday");
		break;
		}
		//default 
		default:
		{
			System.out.println("Invaild");
		}
		}
		in.close();

	}

	}
