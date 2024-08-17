package class_design.class_inheritance;

public class rabbit extends animal {

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
}
