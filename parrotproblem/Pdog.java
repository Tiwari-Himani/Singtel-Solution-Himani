package com.singtel.solution.parrotproblem;

import com.singtel.solution.animalbirdproblem.Sound;

public class Pdog implements Sound {

	@Override
	public boolean produceSound() {
		System.out.println("Woof, woof");
		return true;
	}

}
