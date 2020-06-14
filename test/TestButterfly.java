package com.singtel.solution.test;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import com.singtel.solution.butterflyproblem.Butterfly;
import com.singtel.solution.butterflyproblem.Caterpillar;

public class TestButterfly {

	private Butterfly testButterfly;
	private Caterpillar testCaterpillar;

	@Test
	public void testButterfly() {
		testButterfly = Mockito.mock(Butterfly.class);
		testButterfly.fly();
		testButterfly.produceSound();
		verify(testButterfly).produceSound();
		verify(testButterfly).fly();

	}

	@Test
	public void testCaterpillar() {
		testCaterpillar = Mockito.mock(Caterpillar.class);
		testCaterpillar.fly();
		testCaterpillar.walk();
		verify(testCaterpillar).fly();
		verify(testCaterpillar).walk();

	}
}
