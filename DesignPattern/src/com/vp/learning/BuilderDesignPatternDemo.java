package com.vp.learning;

/**
 * The Class BuilderDesignPatternDemo.
 */
public class BuilderDesignPatternDemo {
	
	public static void main(String[] args) {
		Person p = new PersonBuilder()
				.name("Noeik")
				.age(25)
				.location("India")
				.build();
		
		System.out.println(p.toString());
	}

}

class Person{
	
	private String name;
	private int age;
	private String location;
	
	Person(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
}

class PersonBuilder{
	
	private Person p = new Person();
	
	public PersonBuilder name(String name) {
		p.setName(name);
		return this;
	}
	public PersonBuilder age(int age) {
		p.setAge(age);
		return this;
	}
	public PersonBuilder location (String location) {
		p.setLocation(location);
		return this;
	}
	public Person build() {
		return p;
	}
	
	public PersonBuilder() {
		
	}
}
