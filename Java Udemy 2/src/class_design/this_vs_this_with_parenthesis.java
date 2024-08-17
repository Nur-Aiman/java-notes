package class_design;

/*
 * we will learn about : 
 * -difference between this and this() method call
 */

public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person() {
		this("Eric", "Johnson"); // will call 2nd constructor
	}
	
	public Person(String firstName, String last) {
		this.firstName = firstName;
//		this.lastName = last;  // or lastName = last;
//		String firstName = "myName";  // we can't initialize this local variable cause it has been define in the scope
//		String lastName = "myName";
//		this.lastName = last;
		lastName = last;
	}
	
	public void setFirstName(String firstName) {
//		this(); // compilation error because it try to call the first constructor, meanwhile the first constructor is calling the 2nd constructor
		this.firstName = firstName;
	}
	
	public String getFullName() {
//		return this.firstName + this.lastName;
		return firstName + lastName;
	}
	
	public String getFirstName() {
//		this(); // cannot use this inside a method. only can be used inside a constructor
		return firstName;
	}
}


public class this_vs_this_with_parenthesis {

	public static void main(String[] args) {
		
		/*
		 * -this always point to object's own instance
		 * -it's like me, myself, and I
		 */
		

	}

}
