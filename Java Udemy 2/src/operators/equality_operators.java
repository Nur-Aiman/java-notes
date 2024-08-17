package operators;

/*
 * we will see : 
 * -equality operators (==, !=)
 * -checking primitive equality
 * -tricky parts
 */

public class equality_operators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		boolean c = a == b; // false
		boolean d = a != b; // true
		
	    System.out.println("a= " + a);  
        System.out.println("b= " + b);  
        System.out.println("c= " + c);   
        System.out.println("d= " + d);  
        
//        boolean g = true == 0; // does not compile 
//        boolean h = false != 'test'; // does not compile
        
        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false);
        boolean w = (y = true) ^ (x = false);
        
        System.out.println("x= " + x);  
        System.out.println("y= " + y);  
        System.out.println("z= " + z);  
        System.out.println("w= " + w); 
   
        
   
		

	}

}
