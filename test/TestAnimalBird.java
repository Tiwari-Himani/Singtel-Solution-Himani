package com.singtel.solution.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.mockito.Mockito;

import com.singtel.solution.animalbirdproblem.Animal;
import com.singtel.solution.animalbirdproblem.Bird;

public class TestAnimalBird {

	public String message = "I am walking";
	private Bird testBird;

	Animal testAnimal = new Animal() {
	};

	@Test
	public void testJUnitMessage() {
		assertEquals(message, testAnimal.walk());

	}

	@Test
	public void testAnimal() {
		testAnimal = Mockito.mock(Animal.class);
		testAnimal.walk();
		verify(testAnimal).walk();
	}

	@Test
	public void testBird() {
		testBird = Mockito.mock(Bird.class);
		testBird.sing();
		verify(testBird).sing();
	}

}
