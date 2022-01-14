package Assign_string;

public class Palindrome {

	public static void main(String[] args) {
		// * a) Declare A String value as"madam"
		String s = "madam";
	 
	 //b) Declare another String rev value as ""
		String rev ="";
	 //* c) Iterate over the String in reverse order
		for (int i=s.length()-1; i>=0; i--) {
			 //* d) Add the char into rev
			rev = rev+s.charAt(i);
		}
	 //* e) Compare the original String with the reversed String, if it is same then print palinDrome 
		// * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 if(s.equals(rev))
	 {
		 System.out.println("The given string is palindrome");
	 }
	 else {
		 System.out.println("The given string is not palindrome");
	 }
	}

}
