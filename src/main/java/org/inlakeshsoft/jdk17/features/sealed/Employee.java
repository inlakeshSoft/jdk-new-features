package org.inlakeshsoft.jdk17.features.sealed;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public final class Employee extends Person implements Serializable{

	private static final long serialVersionUID = -4520914250497529489L;
	private Double salary;

	public Employee(String name, Double salary) {
		super(name);
		this.salary = salary;
	}

}
