package Assign_string;

public class CharOccurance {

	public static void main(String[] args) {
		
					String str = "welcome to chennai";
					int count = 0;
					char[] char1 = str.toCharArray();
					for(int i=0; i<char1.length-1; i++) {
						if('e' == char1[i]) 
							count++;
					}
					System.out.println("Number of occurances 'e' in the given string is "+count);
						
	}

}
