package com.singtel.solution.duckchickenproblem;

import com.singtel.solution.animalbirdproblem.Sound;
import com.singtel.solution.animalbirdproblem.Swim;

public class Duck implements Sound, Swim {

	@Override
	public boolean produceSound() {
		System.out.println("Quack, quack");
		return true;

	}

}
