package java_basics;

/*
 * -learn how to use literals with char and boolean
 * -learn how to use unicode characters with char datatype
 */

public class primitive_char_and_boolean {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		char ch = 'a';
//		char ch1 = 'ab'; // can't compile because too many character in character literals
		char ch1 = '1';
		char uniChar = '\u0389'; // uppercase greek omega character
		char romanNumber = '\u216C'; // roman 50 number
		
		System.out.println("Char value of ch: " + ch);
        System.out.println("Char value of ch1: " + ch1);
        System.out.println("Unicode character '\u0389' corresponds to: " + uniChar);
        System.out.println("Roman numeral for 50: " + romanNumber);
 
        // Boolean literals
        boolean trueVal = true;
        boolean falseVal = false;

        // Print boolean values with proper labeling
        System.out.println("Boolean value of trueVal: " + trueVal);
        System.out.println("Boolean value of falseVal: " + falseVal);
   

	}

}
