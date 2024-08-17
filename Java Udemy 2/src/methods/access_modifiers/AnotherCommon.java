package methods.access_modifiers;

/*
 * we will learn about : 
 * -what are access modifiers
 * -how to use access modifiers
 */

public class AnotherCommon {
	
	// common and anothercommon are inside the same package

	public static void main(String[] args) {
		Common common = new Common();
		
		common.publicPrint();
		common.protectedPrint();
		common.defaultPrint();
//		common.privatePrint();  // cannot access
		
		System.out.println("public number = " + common.publicNumber);
		System.out.println("protected number = " + common.protectedNumber);
		System.out.println("default number = " + common.defaultNumber);
//		System.out.println("private number = " + common.privateNumber); // cannot access

		

	}

}
