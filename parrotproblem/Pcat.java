package com.singtel.solution.parrotproblem;

import com.singtel.solution.animalbirdproblem.Sound;

public class Pcat implements Sound {

	@Override
	public boolean produceSound() {
		System.out.println("Meow");
		return true;
	}

}
