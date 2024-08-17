package class_design.class_inheritance.abstract_classes.polyparameters;

import class_design.class_inheritance.abstract_classes.cat;
import class_design.class_inheritance.abstract_classes.husky;
import class_design.class_inheritance.abstract_classes.rabbit;

public class polyparameters {
	
	public static void main(String[] args) {
		
		husky husky = new husky(3);
		husky.setName1("Rex");
		printDetails(husky);
		
		rabbit rabbit = new rabbit();
		rabbit.setName1("Bunny");
		printDetails(rabbit); // compilation error
		
		cat cat = new cat(2);
		cat.setName1("Tom");
		
	}
	
	public static void printDetails(husky husky) {
		husky.printDetails();
	}
	
	// overloaded
	public static void printDetails(rabbit rabbit) {
		rabbit.printDetails1();
	}
}
