package basic_control_flow;

import java.util.Random;

/*
 * learn about : 
 * -what is switch statement
 * -how to use it
 * -what are the supported data types in switch statement
 */

public class switch_statement {

	public static void main(String[] args) {
		
		/*
		 * data types supported by switch statement : 
		 * -primitive int, short, char, byte
		 * -wrapper int, short, char byte, string, enum values
		 * -long and boolean are not supported
		 */
		
		
		int dayOfWeek = 0;
		
		/*
		 * -if 'break' was not put, the following case will
		 * also be executed until 'break' is found
		 */
		
		switch (dayOfWeek) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
			break;
		case 2:
			System.out.println("Wednesday");
			break;
		case 3:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekend");
			break;
		}
		
		
		Random rand = new Random();
		int c = rand.nextInt(26) + 'a'; // adding offset to produce lower case letters
		System.out.println((char )c + ", " + c + ": ");
		
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		case 'y':
		case 'w':
			System.out.println("sometimes a vowel");
			break;
		default:
			System.out.println("consonant");
			break;
			}
		
		int x = 4;
		switch(x) {
		case 4:
//		case x: // won't compile
		case 'K': 
//		case "Test": // won't compile
		   
		}
	}

}
