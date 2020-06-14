package com.singtel.solution.fishproblem;

public class Clownfish extends Fish {

	@Override
	public void color() {
		System.out.println("I am of orange color");
	}

	@Override
	public void size() {
		System.out.println("I am small in size");
	}

	public void makeJokes() {
		System.out.println("I make jokes");
	}
}
