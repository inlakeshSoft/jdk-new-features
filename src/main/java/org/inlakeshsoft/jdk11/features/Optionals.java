package org.inlakeshsoft.jdk11.features;

import java.util.Optional;

public class Optionals {

	private void isEmpty(String string) {
		Optional<String> optional = Optional.ofNullable(string);
		if (optional.isEmpty()) {
			System.out.println("The string content is empty");
		} else {
			System.out.println("The string content is not empty");
		}
	}
	
	private void isPresent(String string) {

		Optional<String> optional = Optional.ofNullable(string);
		if (optional.isPresent()) {
			System.out.println("The string content is present");
		} else {
			System.out.println("The string content is not present");
		}
	}

	public static void main(String[] args) {
		Optionals optionals = new Optionals();
		optionals.isEmpty("not is empty");
		optionals.isEmpty(null);
		
		optionals.isPresent("is present");
		optionals.isPresent(null);
	}

}
