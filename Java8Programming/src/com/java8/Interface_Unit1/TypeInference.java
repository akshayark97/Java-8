package com.java8.Interface_Unit1;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		myLambda1 ml = (s) -> s.length();
		System.out.println(ml.getLength("Hello String"));
       // Alternate way to print 
		printLambda1(s -> s.length());
	}
	//Alternate way to print
	public static void printLambda1(myLambda1 l) {
		System.out.println(l.getLength("Hello Lambda"));
	}

}

interface myLambda1 {
	int getLength(String s);
}
