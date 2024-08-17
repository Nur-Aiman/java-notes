package class_design;

/*
 * we will learn about : 
 * -default interface method rules
 * -what are default methods
 * -how to use default methods
 */

public class default_interface_methods {
	
	/*
	 * refer code at class_inheritance.abstract_classes package
	 */
	
	/*
	 * default method is used for
	 * -code development and backward compatibility
	 */
	
	/*
	 * Default Interface Method Rules : 
	 * 
	 * 1) Default methods can only be creating in the interfaces and
	 * not within a class or abstract class
	 * 
	 * 2) Default method must be marked with default keyword and provide
	 * default implementation (needs to have body)
	 * 
	 * 3) Default method is not assumed to be static final or abstract as 
	 * it may be used or overridden in classes that implement the interface
	 * 
	 * 4) Default method is assumed to be public and it will not compile
	 * if marked as private or protected
	 */

}
