package com.singtel.solution.animalbirdproblem;

import com.singtel.solution.utility.Count;

public interface Fly {

	default public void fly() {
		System.out.println("I am flying");
		Count.countFlying++;
	}
}
