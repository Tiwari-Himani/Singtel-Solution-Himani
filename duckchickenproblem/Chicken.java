package com.singtel.solution.duckchickenproblem;

import com.singtel.solution.animalbirdproblem.Bird;
import com.singtel.solution.animalbirdproblem.Sound;

public class Chicken extends Bird implements Sound {

	@Override
	public boolean produceSound() {
		System.out.println("Cluck, cluck");
		return true;
	}

	@Override
	public void fly() {
		System.out.println("I can not fly");
	}

	public static boolean checkIfRooster() {
		System.out.println("I am a Rooster");
		return true;
	}
}
