package class_design.class_inheritance.abstract_classes;

public interface Herbivore {
	
//	void eatPlants();
	
	// default interface method
	default void eatPlants() {
		System.out.println("Eating plants");
	}
	
	
//	default int getRequiredPlantAmount(); // compilation error. default method must have a body
	
	
	
//	public int getRequiredPlantAmount() { // compilation error. must have default keyword
//		return
//	}
	
	

}
