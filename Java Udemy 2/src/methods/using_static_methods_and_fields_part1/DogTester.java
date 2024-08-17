package methods.using_static_methods_and_fields_part1;

public class DogTester {
	
	public static void main(String[] args) {
		Dog husky = new Dog();
		
		System.out.println(husky.count); // 0  // for static variable we don't need to create instance
		System.out.println(Dog.count); // 0
		
		Dog anotherDog = new Dog();
		anotherDog.incrementCounter(); // 1 // warning. we don't need to create instance for static variable in order to call the method
		
		Dog.incrementCounter();  // 2
		
		System.out.println(Dog.count);
		
		husky = null;
		anotherDog = null;
		
		// a static variable is shared between all the instances
		
		System.out.println(Dog.count);
		System.out.println(husky.count);
		System.out.println(anotherDog.count);
		
		Dog.count = 10;
		Dog newDog = new Dog();  // instance 1
		Dog dog2 = new Dog();  // instance 2
		newDog.count = 5;
		
		System.out.println(Dog.count);
		System.out.println(newDog.count);
		System.out.println(dog2.count);
		
		
		newDog.count = 11;
		
	
		// instance 1 and 2 or more will share the same static variable value
		// if we change static variable value for 1 instances, all other instance's static variable value will also change
		
		System.out.println(Dog.count);  // 11
		System.out.println(newDog.count);
		System.out.println(dog2.count);
		
	}

}
