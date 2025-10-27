package arrays;

public class CountOccurance {

	public static void main(String[] args) {
		int num = 5564556;
		
		int count5 = 0, count6 = 0;
		int temp = Math.abs(num);
		while(temp>0) {
			int digit = temp % 10;
			if(digit == 5) {
				count5++;
			}else if(digit == 6) {
				count6++;
				
			}
			temp /=10;
		}
	    System.out.println("count of 5: "+count5);
	    System.out.println("count of 6: "+count6);
	    System.out.println("Total (5 or 6):"+(count5+count6));


}
}
