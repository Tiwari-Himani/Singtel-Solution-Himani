package com.singtel.solution.test;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import com.singtel.solution.roosterproblem.Rooster;

public class TestRooster {

	private Rooster testRooster;

	@Test
	public void testFish() {
		testRooster = Mockito.mock(Rooster.class);
		testRooster.produceSound();
		verify(testRooster).produceSound();

	}
}
