package class_design;

/*
 * we will learn about : 
 * -difference between abstract class and interface with default method
 * -when to use them
 */

public class abstract_class_vs_interface {
	
	/*
	 * Use Abstract Classes When : 
	 * 
	 * 1) You want to share code among several closely related classes
	 * (Animal - name, age...)
	 * 
	 * 2) You expect that classes that extend your abstract class have many
	 * common methods of fields or required access modifiers other than public
	 * (protected, private)
	 * 
	 * 3) You want to declare non static or non final fields (name, age), this
	 * enables you to define methods that can access and modify the state of object
	 * (getName, setName)
	 */
	
	/*
	 * Use Interfaces When : 
	 * 
	 * 1) You expect that unrelated classes would implement your interface
	 * 
	 * 2) You want to specify the behavior of a specific data type but you are
	 * not concerned about who implements its behavior (Hop)
	 * 
	 * 3) You want to separate different behavior (Carnivore, Herbivore)
	 */
	
	

}
