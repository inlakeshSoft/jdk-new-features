package org.inlakeshsoft.jdk17.features;

import org.inlakeshsoft.jdk17.features.sealed.Employee;
import org.inlakeshsoft.jdk17.features.sealed.Person;

public class InstanceOf {

	private void instanceOf() {
		Employee employee = new Employee("employee's name", 0.0);
		if (employee instanceof Person) {
			// Person person = (Person)employee; --Ya no es necesario el cast
			Person person = employee;
			System.out.println(person.getName());
		}
	}

	public static void main(String[] args) {
		InstanceOf instanceOf = new InstanceOf();
		instanceOf.instanceOf();
	}

}
