package java_basics;

/*
 * learn about : 
 * - literals
 * - default interpretation of numbers
 * - using hexadecimal, octal and binary numbers
 */

public class whole_numeric_primitives {

	public static void main(String[] args) {
		
		/*
		 * -literal are syntatic representation of primitives
		 * -when you see number in code, that you is called literal
		 * -when you assign literals to variables, they can sometimes be
		 * tricky and you have to understand default literals
		 * 
		 * 
		 * long max = 32132132372193; // compilation error (integer number is too large)
		 * -we declare long max, but why java identify it as integer?
		 * -in java, whole number are interpreted as integers
		 * 
		 * to fix, add 'L' letter after the number
		 * that 'L' letter represents long
		 * long max = 32132132372193L; // no more compilation error
		 * 
		 * 
		 */
		
		long max = 32_123_456_789L;
		long n = 2_300;
		
		// octal (0-7)
		int oct = 07;
		int firstOct = 010; // 8 in decimal
		int secondOct = 022; // 18 in decimal
		
		int sumOct = firstOct + secondOct; // 26 decimal, 32 octal
		System.out.println("first "+firstOct+"second "+secondOct);
		System.out.println("decimal sum= "+sumOct+" oct sum= " + Integer.toOctalString(sumOct));
		
		
		// hexadecimal (0 - 9 and A - F)
		int firstHex = 0xF;
		int secondHex = 0x1E;
		int sumHex = firstHex + secondHex; // 45 in decimal, 2D in hexadecimal
		  System.out.println("first: " + firstHex + " second: " + secondHex);
	        System.out.println("decimal sum = " + sumHex + " hex sum = " + Integer.toHexString(sumHex).toUpperCase());
	   
	     
	        
	        int firstBin = 0b1001;  // 9 in decimal
	        int secondBin = 0b0111; // 7 in decimal

	        int sumBin = firstBin + secondBin; // 16 in decimal, 10000 in binary
	        System.out.println("first: " + firstBin + " second: " + secondBin);
	        System.out.println("decimal sum = " + sumBin + " binary sum = " + Integer.toBinaryString(sumBin));
	    
	}

}
