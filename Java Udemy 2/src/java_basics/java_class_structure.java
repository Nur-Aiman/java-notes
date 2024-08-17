/*
 * -Class are just basic building blocks
 * -when defining class, we are describing the characteristics of the class
 * -For example, when we create a person class, we describe a real life person
 * -when we use classes, we have to create new object
 * -classes have 2 main elements, which are fields/variable and methods/functions
 * -variable hold states such as first_name, last_name
 * -method is a function that we can call
 * 
 */

package java_basics;

public class java_class_structure {

	public static void main(String[] args) {
		
	}
	
	public class Person {
		
		private String firstName;
		private String lastName;
		private int age;
		
		/*
		 * -this method return string object
		 * -method like this is called getters
		 * -called as getters cause the method name itself 'get'
		 * -declaration of method is called method signature (public String)
		 * -we can see this method return String 
		 */
		public String getFirstname() {
			return firstName;
		}
		
		
		/*
		 * firstName is called parameter
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
	}

}
