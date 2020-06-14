package com.singtel.solution.animalbirdproblem;

import com.singtel.solution.utility.Count;

public interface Animal {

	String walkMessage="I am walking";

	default String walk() {
		System.out.println("I am walking");
		Count.countWalk++;
		return walkMessage;

	}

}
