package com.java8.TypeInference;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		myLambda ml = (s) -> s.length();
		System.out.println(ml.getLength("Hello String"));
       // Alternate way to print 
		printLambda(s -> s.length());
	}
	//Alternate way to print
	public static void printLambda(myLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}

}

interface myLambda {
	int getLength(String s);
}
