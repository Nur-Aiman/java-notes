package operators;

/*
 * we will talk about : 
 * -char primitive type
 * -arithmetic with char				
 * 
 */

public class character_arithmetic {

	public static void main(String[] args) {
		// char 0 - 65535
		char myCharA = 'A';
		char myCharNum = '1';
		
		System.out.println("myCharA= " + myCharA);
		System.out.println("myCharA isLetter= " + Character.isLetter(myCharA));
		System.out.println("myCharA isDigit= " + Character.isDigit(myCharA));
		
		System.out.println("\nmyCharNum= " + myCharNum);
		System.out.println("myCharNum isLetter= " + Character.isLetter(myCharNum));
		System.out.println("myCharNum isDigit= " + Character.isDigit(myCharNum));
		
		// exam examples
		char letter = 65; // character A
		int myInt = letter + 3;
		char myNewLetter = (char)myInt;
		
		System.out.println("letter= " + letter);       
	    System.out.println("myInt= " + myInt);        
	    System.out.println("myNewLetter= " + myNewLetter); 
	    
	    char myChar = 65; // A
	    char newChar = (char) (myChar + 1);
	    boolean b = newChar == 'B';
	    boolean c = (newChar++ < 'D');
	    
	    System.out.println("myChar= " + myChar);         // Prints the value of myChar
        System.out.println("newChar= " + newChar);       // Prints the value of newChar after post-increment
        System.out.println("b= " + b);                  // Prints the value of b
        System.out.println("c= " + c);                  // Prints the value of c
    
	   
		

	}

}
