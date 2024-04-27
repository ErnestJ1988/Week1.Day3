package wee1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int[] a = {1,4,3,2,8,6,7};
		Arrays.sort(a);
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			
			if ((i+1) != a[i]) {
				
				j =i+1;
				System.out.println("The missing number is " + j);
				break;
			}
			
		}
		

	}

}
