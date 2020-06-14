package com.singtel.solution.butterflyproblem;

import com.singtel.solution.animalbirdproblem.Animal;
import com.singtel.solution.animalbirdproblem.Fly;
import com.singtel.solution.animalbirdproblem.Sound;

public interface Insect extends Fly, Sound, Animal {

	@Override
	default boolean produceSound() {
		System.out.println("I don't make a sound");
		return false;
	}
}
