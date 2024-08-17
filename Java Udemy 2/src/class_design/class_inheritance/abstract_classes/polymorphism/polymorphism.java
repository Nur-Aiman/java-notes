package class_design.class_inheritance.abstract_classes.polymorphism;

import java.util.ArrayList;
import java.util.List;

import class_design.class_inheritance.abstract_classes.CanRun;
import class_design.class_inheritance.abstract_classes.HasTail;
import class_design.class_inheritance.abstract_classes.animal;
import class_design.class_inheritance.abstract_classes.bird;
import class_design.class_inheritance.abstract_classes.cat;
import class_design.class_inheritance.abstract_classes.dog;
import class_design.class_inheritance.abstract_classes.eagle;
import class_design.class_inheritance.abstract_classes.husky;
import class_design.class_inheritance.abstract_classes.rabbit;

public class polymorphism {

	public static void main(String[] args) {
		
		husky husky = new husky(5);
		husky.setName1("Rex");
		
		// create another reference that point to the same object
		// up casting (don't need explicit casting)
		dog dog = husky; // another reference to husky object in memory
		
		/*
		 * reference 1 = husky
		 * reference 2 = dog
		 * both refer to the same husky object
		 */
		
		dog.printDetails1();
		
		// reassign husky to a hasTail interface
		// dog now has parent animal, HasTail, and CanRun
		// husky also implements those interfaces
		HasTail hasTail = husky; // another reference to husky object in memory
		System.out.println("Tail Length= " + hasTail.getTailLength());
		
		CanRun canRun = husky; // another reference to husky object in memory
		canRun.run(5);
		
		animal animal = husky; // another reference to husky object in memory
		animal.printDetails1();
		
		Object object = husky; // another reference to husky object in memory
		
		// the 3 line below should not compile
//		animal.printName();
//		dog.printName();
//		husky.printName();
		
		
		// down casting (need explicit casting)
		dog myDog = (dog)animal;
		myDog.printDetails1();
//		myDog.printName();
		
		husky myDog1 = (husky)animal; // another reference to husky object in memory
		myDog1.printName();
		
		/*
		 * -We can see here, we have 1 object in memory of type husky
		 * -The ability of husky to be used as an instance of interface
		 * or superclass (dog, HasTail, CanRun, Animal), is the nature
		 * of polymorphism
		 * -Once the object has been assign to a new reference, only the methods
		 * and variables available to that reference type are callable on the
		 * object without any explicit cast
		 * 
		 */
		
		animal cat = new cat(2);
//		cat myCat = cat; // won't compile because we try to assign type of 'animal' to the reference type cat
		// we need explicit casting cause we reassign to lower hierarchy type
		cat myCat = (cat)cat;
		((cat)cat).getSpeed();
		myCat.getSpeed();
		
		
//		Bear bear = (Bear) "test"; // compilation error. string and bear are not related in hierarchy
		
//		dog newDog = (dog) cat; // may produce class cast exception. because dog and cat extends animal, which 
		                        // means they are in the same level of hierarchy (sibling)
		
		// bird class is not polymorphic class
		// class is polymorphic when it can be assign to more than 2 types (2 types is itself and object)
		bird bird = new bird();
		Object birdObject = bird;
//		HasTail birdTail = bird; // This would produce a compilation error since bird doesn't implement HasTail

		
		// eagle is polymorphic. to be polymorphic, you need at least 1 parent or child
		eagle eagle = new eagle();
		bird eagleBird = eagle;
		Object eagleObject = eagle;
		
		List<String> list = new ArrayList<>();
		
		// virtual method
		animal rabbitAnimal = new rabbit();
		rabbitAnimal.printDetails1();  // it will call the method inside the rabbit class, not the animal class
		
		/*
		 * -in animal, we have method printDetails1();
		 * -at compile time, the 'rabbitAnimal.printDetails1();' will
		 * refer to the implementation from the animal class
		 * -but, when we run our code, java will virtually/automatically
		 * resolve it and find that there is a method inside a rabbit, since
		 * our animal is a rabbit object in memory (new rabbit();), so it
		 * will call the method that is overridden in the rabbit class
		 */
		
	}

}
