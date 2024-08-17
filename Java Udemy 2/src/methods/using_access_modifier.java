package methods;

import methods.access_modifiers.Common;

public class using_access_modifier {

	public static void main(String[] args) {
		Common common = new Common();
		
		common.publicPrint();
//		common.protectedPrint(); // cannot access
//		common.defaultPrint();   // cannot access
//		common.privatePrint();   // cannot access
		
		System.out.println("public number = " + common.publicNumber);
//		System.out.println("protected number = " + common.protectedNumber); // cannot access
//		System.out.println("default number = " + common.defaultNumber); // cannot access
//		System.out.println("private number = " + common.privateNumber); // cannot access


	}

}
