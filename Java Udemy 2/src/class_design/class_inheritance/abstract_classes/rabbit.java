package class_design.class_inheritance.abstract_classes;

public class rabbit extends animal implements Herbivore, Hop {

		public rabbit() {
//			super; // not compile because this is not a statement
//			super.aaa(); // will compile
			
			super();  // compile
//			super().setAge();  // does not compile
			this.setAge(3);  // compile
			setAge(5);
			
		}
		
		public rabbit(int age) {
//			this(age);  // compilation error. recursive call
			
//			super(); // will call animal class
//			this(); // will call rabbit class, and it will also call 'super()' (refer rabbit class above)
//			setAge(3);
			super(3);
		}

		@Override
		protected void printName() {
			// TODO Auto-generated method stub
			
		}
		
//		@Override
//		public void printDetails1() {
//			System.out.println("Rabbit average jump height is= " + getAverageJumpHeight()); // compilation error cause we try to call static method as an instance
//		}
		
		@Override
		public void printDetails1() {
			System.out.println("Rabbit average jump height is= " + Hop.getAverageJumpHeight()); 
		}
}
