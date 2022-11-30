package org.inlakeshsoft.jdk17.features.sealed;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public final class Employee extends Person {

	private Double salary;

	public Employee(String name, Double salary) {
		super(name);
		this.salary = salary;
	}

}
