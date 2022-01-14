package Assign_string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//*Declare a String 
		String text1 = "stops";
	 //*Declare another String
		String text2 = "potss"; 
	// * a) Check length of the strings are same then (Use A Condition)
		if(text1.length()==text2.length()) {
			System.out.println("The given string is same length");
		}
	 //* b) Convert both Strings in to characters
		char[] char1 = text1.toCharArray();
		char[] char2 = text2.toCharArray();
	 //* c) Sort Both the arrays
		
		Arrays.sort(char1);
		Arrays.sort(char2);
	 //* d) Check both the arrays has same value
		if(Arrays.equals(char1, char2)) {
			System.out.println("The given two string are anagram with each other");
		}
		else {
			System.out.println("The given two string are not anagram with each other");

		}
	}

}
