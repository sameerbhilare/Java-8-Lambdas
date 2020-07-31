package io.javabrains.unit1;

public class TypeInferenceExample {

	public static void main(String[] args) {
		/**
		 * type inference - compiler figures out what your return type is, input argument type is, etc.
		 *
		 * Functional Inteface - interface with only one abstract method.
		 * @FunctionalInterface
 		 */

		printLambda(s -> s.length());
		printLambda((s) -> s.length());
		printLambda((String s) -> s.length());

		StringLengthLambda myLambda = s -> s.length();
		printLambda(myLambda);
		
	}
	
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}
	
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
	

}
