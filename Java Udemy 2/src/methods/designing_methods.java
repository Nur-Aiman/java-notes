package methods;

/*
 * we will learn about : 
 * -what is method declaration
 * -parts of method declaration
 * 
 */

public class designing_methods {
	
	public void jump() {}

//	void public jump2() {}  // does not compile
	
//	void public void jump() {}
	
	void jump3() {} // default access modifier : default void jump3() {}
	
	public final void jump4() {} 
	public static final void jump5() {}
	public final static void jump6() {}
	
//	public modifier void jump7() {} // modifier here is like writing '123' 'text'
	
//	public String void jump8() {} // does not compile due to 2 return type
	
//	final public void final jump9() {} // does not compile
	
	final static public void jump10() {} 
	
//	String int public void jump11() {} // not compile due to many return type
	
	
	
		
		/*
		 * access modifier : 
		 * -public
		 * -private
		 * -protected
		 * -default
		 * 
		 * optional specifier : 
		 * -static
		 * -abstract
		 * -final
		 * -synchronize
		 * -native
		 * -strictfp
		 * 
		 */

	

}
