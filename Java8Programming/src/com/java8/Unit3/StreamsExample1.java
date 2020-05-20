package com.java8.Unit3;

import java.util.Arrays;
import java.util.List;

import com.java8.LambdaExcercise.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		List<Person> people = Arrays.asList(
		         new Person("Charles", "Dickens", 60),
		         new Person("Lewis", "Carrol", 42),
		         new Person("Thomas", "Carlyle", 51),
		         new Person("Charlatte", "Brante", 45),
		         new Person("Mathew", "Arnold", 39)
		         );
		
/*		people.stream()
		.filter(p -> p.getLastname().startsWith("C"))
		.forEach(p -> System.out.println(p));
		*/
		
//		TODO to print the count
     /*	long count = people.stream()
		.filter(p->p.getLastname().startsWith("C"))
		.count();
		
		System.out.println(count);
		
		*/
		
//		TODO using method parallel stream
		long count = people.parallelStream() 
	    .filter(p->p.getLastname().startsWith("D"))
	    .count();
		
		System.out.println(count);
		
	}

}
