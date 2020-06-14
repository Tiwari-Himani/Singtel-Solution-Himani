package com.singtel.solution.fishproblem;

public class Shark extends Fish {

	Fish fish = new Fish();

	public void sharkColor() {
		fish.color();
	}

	public void sharkSize() {
		fish.size();
	}

	public void eatOtherFish() {
		System.out.println("I eat other fish");
	}
}
