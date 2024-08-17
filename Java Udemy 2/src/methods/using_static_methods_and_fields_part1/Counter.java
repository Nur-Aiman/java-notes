package methods.using_static_methods_and_fields_part1;

public class Counter {
	
	public static int count;
	public int anotherCount;
	
	public Counter() {
		count++;
		anotherCount++;
	}
	
	public static void main(String[] args) {
		Counter one = new Counter();
		Counter two = new Counter();
		Counter three = new Counter();
		Counter four = new Counter();
		
		System.out.println(count);
		System.out.println(one.count);
		System.out.println(two.count);
		System.out.println(three.count);
		System.out.println(four.count);
		
		count++;
		
		System.out.println(count);
		System.out.println(one.count);
		System.out.println(two.count);
		System.out.println(three.count);
		System.out.println(four.count);
		
//		System.out.println(anotherCount);
		System.out.println(one.anotherCount);
		System.out.println(two.anotherCount);
		System.out.println(three.anotherCount);
		System.out.println(four.anotherCount);
		
		one.anotherCount = 2;
		two.anotherCount = 3;
		three.anotherCount = 4;
		four.anotherCount = 5;
		
		System.out.println(one.anotherCount);
		System.out.println(two.anotherCount);
		System.out.println(three.anotherCount);
		System.out.println(four.anotherCount);
		
		// instance variable are not shared between instances
		// static variable are shared between each instances
		
	}

}
