package com.vp.learning;

/**
 * The Class BuilderDesignOfInterheritanceDemo.
 */
public class BuilderDesignOfInterheritanceDemo {

	public static void main(String[] args) {
		PersonA p = new EmployementBuilder()
					.withName("Noeik")
					.position("Founder")
					.build();
		
		System.out.println(p);
	}
	
	
}
class PersonA{
	private String name;
	
//	Employement Builder will fill the value
	private String position;
	
	
	public PersonA() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public String toString() {
		return "PersonA [name=" + name + ", position=" + position + "]";
	}
	
}

class PersonBuilderA<T extends PersonBuilderA<T>>
{
	PersonA p = new PersonA ();
	
	
	public T withName(String name) {
		p.setName(name);
		return self();
	}
	public PersonA build() {
		return p;
	}
	public T self() {
		return (T)this;
	}
}

class EmployementBuilder extends PersonBuilderA<EmployementBuilder>
{
	public EmployementBuilder position(String position) {
		p.setPosition(position);
		return self();
	}
	
	@Override
	public EmployementBuilder self() {
		return this;
	}
	
}
