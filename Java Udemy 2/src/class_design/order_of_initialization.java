package class_design;

/*
 * we will learn about : 
 * -order of initialization
 * -rules for order of initialization
 * -what are instance initializers
 */

class Example {
	private String name = "dog";
	
	// instance initializer
	{
		System.out.println(name);
	}
	
	private static int COUNT = 0;
	
	// static initializer
	static {
		System.out.println(COUNT);
	}
	
	// instance initializer
	{
		COUNT += 10;
		System.out.println(COUNT);
	}
	
	public Example() {
		System.out.println("constructor");
	}
}

class Demo {
	
	// 1) static initializer
	static {
		add(2);
	}
	
	static void add(int number) {
		System.out.print(number + " ");
	}
	
	// 5) constructor
	Demo() {
		add(5);
	}
	
	// 2) static initializer
	static {
		add(4);
	}
	
	// 3) instance initializer
	{
		add(6);
	}
	
	// static initializer that call constructor
	static {
		new Demo();
	}
	
	// 4) instance initializer
	{
		add(8);
	}
}

public class order_of_initialization {

	public static void main(String[] args) {
		
		/*
		 * order of initialization
		 * 1) if there is superclass initialize it first
		 * 2) static variable declarations and static initializers in
		 * order they appear in the file
		 * 3) instance variable declarations and instance initializers in order
		 * they appear in the file
		 * 4) the constructor 
		 */
		
//		Example example = new Example();
		new Example();
		new Demo();
		
		

	}

}
