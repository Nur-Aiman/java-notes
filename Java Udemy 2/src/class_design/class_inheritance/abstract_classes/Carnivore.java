package class_design.class_inheritance.abstract_classes;

public interface Carnivore {
	
//	void eatMeat();
	
	// default interface method
		default void eatMeat() {
			System.out.println("Eating meat");
		}

}
