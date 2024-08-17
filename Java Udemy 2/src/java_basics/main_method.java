package java_basics;

/*
 * - we will learn about main method
 * - we will learn about command line parameters
 * - we will learn to pass parameters using IDE
 */

public class main_method {

	//this is signature of main method
	//String[] args is string array
	public static void main(String[] args) {
		System.out.println("args-size= " + args.length);
		//output : args-size= 0
		//0 because currently we don't pass any argument/parameter
		//we can add program argument manually through configuration in IDE
		//main method is entry point for our program
		//in order to allow our program to run, we need at least 1 main method
		
		
		//printing the argument
		for (int i = 1; i < args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
		
		

	}

}
