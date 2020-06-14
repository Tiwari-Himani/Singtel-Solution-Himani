package com.singtel.solution.test;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import com.singtel.solution.duckchickenproblem.Chicken;
import com.singtel.solution.duckchickenproblem.Duck;

public class TestDuckChicken {

	private Chicken testChicken;
	private Duck testDuck;

	@Test
	public void testChicken() {
		testChicken = Mockito.mock(Chicken.class);
		testChicken.fly();
		testChicken.produceSound();
		verify(testChicken).fly();
		verify(testChicken).produceSound();

	}

	@Test
	public void testDuck() {
		testDuck = Mockito.mock(Duck.class);
		testDuck.produceSound();
		testDuck.swim();
		verify(testDuck).produceSound();
		verify(testDuck).swim();

	}
}
