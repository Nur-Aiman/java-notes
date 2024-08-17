package methods.static_methods_and_fields;

/*
 * Will learn about : 
 * -the keyword static
 * -creating static methods and fields
 */

public class static_methods_and_fields {

	public static void main(String[] args) {
		
		/*
		 * -We create new instance methods and fields
		 * -We use the 'new' keyword to create new instance
		 * -For example : 
		 *  ArrayList array1 = new ArrayList();
		 *  -after we create instance, then only we can use the methods
		 *  
		 *  
		 *  -But, for static method, we don't need to create instance of 
		 *  that class
		 *  
		 */
		
		/*
		 * -We don't need to create : 
		 * static_method_and_fields s = new static_method_and_fields();
		 * -We don't need to create the above instance in 
		 * order to call the myNumber method
		 * -Try to delete the 'static' keyword from the myNumber
		 * method. You will get compilation error
		 */
		
		
		//we can print out this static field directly
		System.out.println(myNumber);
	}
	
	// create a static field
	public static int myNumber = 10;

}
