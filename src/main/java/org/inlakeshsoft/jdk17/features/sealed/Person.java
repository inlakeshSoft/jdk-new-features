package org.inlakeshsoft.jdk17.features.sealed;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public sealed class Person permits Employee {
	private String name;

}
