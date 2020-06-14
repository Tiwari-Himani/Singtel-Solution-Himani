package com.singtel.solution.animalbirdproblem;

import com.singtel.solution.utility.Count;

public interface Swim {

	default void swim() {
		System.out.println("I am swimming");
		Count.countSwim++;
	}
}
