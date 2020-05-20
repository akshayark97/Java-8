package com.java8.Unit3;

import java.util.Arrays;
import java.util.List;

import com.java8.LambdaExcercise.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
		         new Person("Charles", "Dickens", 60),
		         new Person("Lewis", "Carrol", 42),
		         new Person("Thomas", "Carlyle", 51),
		         new Person("Charlatte", "Brante", 45),
		         new Person("Mathew", "Arnold", 39)
		         );
		
		for(int i=0; i<people.size(); i++)
		{
			System.out.println(people.get(i));
		}
		
//		Using for in loop
        System.out.println("Using for in loop");
		for(Person p : people)
		{
		   System.out.println(p);
		}
//		Using lambda for each loop
		System.out.println("Using lambda for each loop");
		people.forEach(System.out::println); //Instead of using p -> System.out.println(p)
	}
}
