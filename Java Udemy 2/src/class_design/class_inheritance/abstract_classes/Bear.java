package class_design.class_inheritance.abstract_classes;

public class Bear extends animal implements Omnivore {
	
	@Override
	public void eatPlants() {
		System.out.println("Bear eating plants");
	}
	
	@Override
	public void eatMeat() {
		System.out.println("Bear eating meats");
	}
	
	
	
	
	
	@Override
    protected int getWeight() {
		return 2000;
	}
	
	@Override
	protected void printName() {
		System.out.println("Bear");
	}

}
