package com.java8.FunctionalInterface_Unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int key = 2;
		process(arr, key, wrapperLambda((v, k) -> System.out.println(v/k)));

	}

	private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		// TODO Auto-generated method stub
	     for(int i : arr)
	     {
	    	 consumer.accept(i, key);
	    	
	     }
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception caught in wrapper lambda");
				
			}
			
		};
	}

}
