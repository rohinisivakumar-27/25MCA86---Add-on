package arrays;

public class Problem4x {

	public static void main(String[] args) {
		int[]arr = {10, 20, 30, 40, 50};
		
		int start = 0, end = arr.length-1;
		int temp;//Act as Teporary variable
		
		while(start < end) {
			temp = arr[start]; //temp = arr[0]
			arr[start] = arr[end]; //arr[0] = arr[4]
			arr[end] = temp; //arr[4] = arr[0]
			start++; //0(1)
			end--;//4(3)
		}
			/**
			 * 50 20 30 40 10
			 * 50 40 30 20 10
			 */
		System.out.print("Reversed arrays: ");
		for(int val: arr) {
			System.out.print(val+" ");
		}
		}
	}