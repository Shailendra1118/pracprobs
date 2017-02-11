package com.java8.pracs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEx {

	public static void main(String[] args) {
		Person p1 = new Person("Shailendra","Bhopal");
		Person p2 = new Person("Avin","Indore");
		Person p3 = new Person("Rajesh","Indore");
		Person p4 = new Person("Abhinav","Bhopal");
		List<Person> list = new ArrayList<>();
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		Map<String, List<Person>> map = list.stream().collect(Collectors.groupingBy(Person::getCity));
		map.entrySet().forEach( name -> {
											List<Person> l = name.getValue();
											System.out.print(name.getKey()+":");
											l.forEach(val -> System.out.print(val.getName()+" "));
											System.out.println();
										});
		
	}
	
	
	

}

class Person{
	String name;
	String city;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	Person(String n, String c){
		this.name = n;
		this.city = c;
	}
}

