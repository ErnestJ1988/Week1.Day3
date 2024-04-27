package wee1.day3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] testchar = test.toCharArray();
		
		for (int i = 0; i < testchar.length; i++) {
			
			if (i%2 !=0) {
				
				testchar[i] = Character.toUpperCase(testchar[i]);
			}
			
			System.out.print(testchar[i]);
			
			
		}
			
		}

}
