package org.inlakeshsoft.jdk11.features;

import java.util.stream.Collectors;

public class Strings {

	public void isEmpty() {
		String notIsEmpty = "Not is empty text";
		String isEmpty = "  ";

		System.out.println(notIsEmpty.isBlank());
		System.out.println(isEmpty.isBlank());
	}

	public void repeat() {
		String repeated = "repeated ".repeat(5);
		System.out.println(repeated);
	}

	public void convertToList() {
		String toList = "1,2,3,4,5";
		System.out.println(toList.lines().collect(Collectors.toList()));
	}

	public void removeBlaks() {
		String blanksRemoved = " removed ";
		System.out.println(blanksRemoved.strip());
		System.out.println(blanksRemoved.stripLeading());
		System.out.println(blanksRemoved.stripTrailing());
	}

	public static void main(String[] args) {
		Strings strings = new Strings();
		strings.isEmpty();
		strings.repeat();
		strings.convertToList();
		strings.removeBlaks();
	}

}
