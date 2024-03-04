package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdausingJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Person> people = Arrays.asList(
		new Person("charles","antony",35),
		new Person("susan","donald",27),
		new Person("keith","parkinson",60),
		new Person("charles","zoe",43),
		new Person("fred","peters",20)
		);
		
Collections.sort(people, new Comparator<Person>() {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o2.getId()-o1.getId();
	}
});
		
printAll(people);
System.out.println("===============================================");
printConditionally(people,new Condition() {
	
	@Override
	public boolean test(Person p) {
		// TODO Auto-generated method stub
		return p.getLastName().startsWith("p");
	}
});
System.out.println("==========================================");
printConditionally(people,new Condition() {
	
	@Override
	public boolean test(Person p) {
		// TODO Auto-generated method stub
		return p.getFirstName().startsWith("c");
	}
});

	}

	private static void printConditionally(List<Person> people,Condition condition) {
for(Person p:people)
	if(condition.test(p))
System.out.println(p);
	}

	private static void printAll(List<Person> people) {
for(Person p: people)
	System.out.println(p.toString());
	}

	
	interface Condition{
		boolean test(Person p);
	}
	
	
}
