package com.test.app.guava.basic;

import com.google.common.base.Objects;

public class GuavaObjectsExample {
	public void showObjects() {
		Person p1 = new Person(1, "Jack", "Johnson");
		Person p2 = new Person(2, "Joe", null);

		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
	}
}

class Person {

	public Person(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private int id;
	private String firstName;
	private String lastName;

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Person) || object == null) {
			return false;
		}
		Person person = (Person) object;
		// no need to handle null here
		// Objects.equal("test", "test") == true
		// Objects.equal("test", null) == false
		// Objects.equal(null, null) == true
		return Objects.equal(id, person.id) // id can be null
				&& Objects.equal(firstName, person.firstName) // first name can be null
				&& Objects.equal(lastName, person.lastName); // last name can be null
	}

	@Override
	public int hashCode() {
		// no need to compute hashCode by self
		return Objects.hashCode(id);
	}

}