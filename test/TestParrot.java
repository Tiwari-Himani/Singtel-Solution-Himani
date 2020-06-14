package com.singtel.solution.test;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import com.singtel.solution.parrotproblem.Pcat;
import com.singtel.solution.parrotproblem.Pdog;

public class TestParrot {

	private Pcat testPcat;
	private Pdog testPdog;

	@Test
	public void testPcat() {
		testPcat = Mockito.mock(Pcat.class);
		testPcat.produceSound();
		verify(testPcat).produceSound();

	}

	@Test
	public void testPdog() {
		testPdog = Mockito.mock(Pdog.class);
		testPdog.produceSound();
		verify(testPdog).produceSound();

	}
}
