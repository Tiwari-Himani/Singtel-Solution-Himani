package com.singtel.solution.roosterproblem;

import com.singtel.solution.animalbirdproblem.Sound;
import com.singtel.solution.duckchickenproblem.Chicken;

public class Rooster implements Sound {

	public void getRooster() {
		Chicken.checkIfRooster();
	}

	@Override
	public boolean produceSound() {
		System.out.println("Cock-a-doodle-do");
		return true;
	}
	
	public void speakLang() {
		System.out.println("I speak different languages");
	}
}
