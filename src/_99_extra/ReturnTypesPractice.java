package _99_extra;

public class ReturnTypesPractice {
	public static void main(String[] args) {
		// GOAL: Figure out what each of these hidden methods returns
		// 1. Call each method
		
	int one =	method1();
		double two = method2();
		String three = method3();
		char four = method4();
		boolean five = method5();
		
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		
		// 2. Save the return of each method into a variable of the correct type(ex: String,int,etc)
		
		// 3. Print out each variable
		
	}
	
	static int method1() {
		return HiddenTypes.unknown1;
	}
	static double method2() {
		return HiddenTypes.unknown2;
	}
	static String method3() {
		return HiddenTypes.unknown3;
	}
	static char method4() {
		return HiddenTypes.unknown4;
	}
	static boolean method5() {
		return HiddenTypes.unknown5;
	}

}
