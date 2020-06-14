package com.singtel.solution.parrotproblem;

import com.singtel.solution.duckchickenproblem.Duck;
import com.singtel.solution.roosterproblem.Rooster;

public class Parrot {

	private Pdog dog;
	private Pcat cat;
	private Rooster rooster;
	private Duck duck;

	public Parrot(Pdog dog) {
		this.dog = dog;
	}

	public Parrot(Duck duck) {
		this.setDuck(duck);
	}

	public Parrot(Pcat cat) {
		this.setCat(cat);
	}

	public Parrot(Rooster rooster) {
		this.setRooster(rooster);
	}

	public Pdog getDog() {
		return dog;
	}

	public void setDog(Pdog dog) {
		this.dog = dog;
	}

	public Pcat getCat() {
		return cat;
	}

	public void setCat(Pcat cat) {
		this.cat = cat;
	}

	public Rooster getRooster() {
		return rooster;
	}

	public void setRooster(Rooster rooster) {
		this.rooster = rooster;
	}

	public Duck getDuck() {
		return duck;
	}

	public void setDuck(Duck duck) {
		this.duck = duck;
	}

}
