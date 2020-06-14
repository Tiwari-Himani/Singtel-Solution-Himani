package com.singtel.solution.test;

import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.mockito.Mockito;

import com.singtel.solution.fishproblem.Fish;

public class TestFish {

	private Fish testFish;

	@Test
	public void testFish() {
		testFish = Mockito.mock(Fish.class);
		testFish.sing();
		testFish.walk();
		testFish.swim();
		verify(testFish).sing();
		verify(testFish).walk();
		verify(testFish).swim();

	}
}
