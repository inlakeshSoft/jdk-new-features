package org.inlakeshsoft.jdk8.features.function;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.function.Function;

import org.inlakeshsoft.jdk17.features.sealed.Employee;

import lombok.extern.slf4j.Slf4j;

/**
 * Representa una funcion que acepta un argumento y produce un resultado
 * 
 * Function<T,V>
 * 
 * @author inlakesh
 *
 */
@Slf4j
public class A_Function {

	static Function<Integer, Integer> multiply = n -> n * 10;
	static Function<Integer, Integer> sum = n -> n + 10;
	static Function<Integer, Integer> multiplyThenSum = multiply.andThen(sum);
	static Function<Integer, Integer> multiplyComposeSum = multiply.compose(sum);
	
	static Function<Employee, ByteArrayOutputStream> serializer = employee -> {
		ByteArrayOutputStream serialized = new ByteArrayOutputStream();
		
		try(ObjectOutputStream outputStream = new ObjectOutputStream(serialized)){
			outputStream.writeObject(employee);
			outputStream.flush();
		}catch (IOException ioe) {
			log.error(ioe.getMessage());
		}
		
		return serialized;
	};

	/**
	 * Aplica la funcion dado un argumento
	 * 
	 * R apply(T t)
	 */
	public Integer applyMultiply(Integer n) {
		return multiply.apply(n);
	}

	/**
	 * Primero aplica la funcion pasada por argumento y despues el metodo apply
	 * 
	 * compose(Function<? super V, ? extends T> before)
	 */
	public Integer compose(Integer n) {
		// primero resuelve sum y el resultado lo toma como argumento para resolver
		// multiply
		return multiplyComposeSum.apply(n);
	}

	/**
	 * Despues de aplicar la funcion apply, aplica la funcion dada por un parametro
	 * 
	 * andThen(Function<? super R, ? extends V> after
	 */
	public Integer andThen(Integer n) {
		// primero resuelve multiply y el resultado lo suma
		return multiplyThenSum.apply(n);
	}
	
	/**
	 * Ejemplo de utilizacion de una funcion para serializar un objeto
	 * @param employee Objeto de ejemplo para serializar
	 * @return
	 */
	public ByteArrayOutputStream serialize(Employee employee) {
		return serializer.apply(employee);
	}

}
