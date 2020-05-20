package com.java8.Unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.LambdaExcercise.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), 
				                            new Person("Lewis", "Carrol", 42),
				                            new Person("Thomas", "Carlyle", 51), 
				                            new Person("Charlatte", "Brante", 45),
				                            new Person("Mathew", "Arnold", 39)
				                            );


//		step2: create a method that prints all element in the list
		System.out.println("Print all person");
		perfromConditionally(people, p -> true, System.out::println); //p -> method(p)
	}

	private static void perfromConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		// TODO Auto-generated method stub
//		System.out.println("Last name starts with C");
		for (Person p : people) {
			if (predicate.test(p)) {

				consumer.accept(p);
			}
		}

	}

}
