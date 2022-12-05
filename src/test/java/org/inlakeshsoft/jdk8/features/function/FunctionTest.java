package org.inlakeshsoft.jdk8.features.function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;

import org.inlakeshsoft.jdk17.features.sealed.Employee;
import org.junit.jupiter.api.Test;

public class FunctionTest {

	private final A_Function function = new A_Function();

	/**
	 * Given: multiply = n -> n * 10; 
	 * When: n = 5 and multiply is applied
	 * Then: get 50
	 */
	@Test
	void applyMultiply() {
		assertEquals(function.applyMultiply(5), 50);
	}

	/**
	 * Given: multiply = n -> n *10, sum = n -> n + 10; 
	 * When: n = 5 and multiply.compose(sum) is applied
	 * Then: First solve sum (n = 15) before compose multiply (15 * 10) getting 150
	 */
	@Test
	void compose() {
		assertEquals(function.compose(5), 150);
	}
	
	/**
	 * Given: multiply = n -> n *10, sum = n -> n + 10; 
	 * When: n = 5 and multiply.andThen(sum) is applied
	 * Then: First solve multiply (n = 50) and then sum (50 + 10) getting 60
	 */
	@Test
	void andThen() {
		assertEquals(function.andThen(5), 60);
	}
	
	/**
	 * Given: An Object Employee type
	 * When: serialize is applied
	 * Then: get a serialized object
	 */
	@Test
	void serialize() {
		ByteArrayOutputStream serialized = function.serialize(new Employee("Employee name", 0.0));
		System.out.println(serialized.toString());
		assertEquals(serialized.getClass(), ByteArrayOutputStream.class);
		assertNotNull(serialized);
	}

}
