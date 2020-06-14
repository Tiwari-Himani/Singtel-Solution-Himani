package com.singtel.solution.animalbirdproblem;

import com.singtel.solution.utility.Count;

public class Bird implements Animal,Fly{

	public void sing() {
		System.out.println("I am singing");
		Count.countSing++;
	}
}
