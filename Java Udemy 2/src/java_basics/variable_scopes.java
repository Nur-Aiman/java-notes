package java_basics;

/*
 * -learn about variable scope
 * -learn about code block
 */

public class variable_scopes {
	
	//this is global variable
	//we can use this anywhere in our class
	static int myNewInt = 5; 
	

	public static void main(String[] args) {
		// scope means just a range at which something
		// is available, or where the data exists
		// local variable only available in the method
		// variable in code block just available in code block
		
		int myLocalInt = 10;
		
		{
			int myOtherInt = 20;
			System.out.println("myOtherInt= "+ myOtherInt);
			System.out.println("inCodeBlock myLocalInt= "+myLocalInt);
		}
		
//		System.out.println("myOtherInt= "+ myOtherInt); // compilation error
		System.out.println("myLocalInt= "+myLocalInt);
		System.out.println("myNewInt= " + myNewInt);
		
		int myOtherInt = 30;
		
		System.out.println("myOtherInt= "+myOtherInt);
		
	}
	
	public static void myMethod() {
		
	}

}
