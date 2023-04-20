package fr.isika.javadevops.model;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
//		builder.append("Person [");
		builder.append(name);
//		builder.append("]");
		return builder.toString();
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person() {
	}
	
}
