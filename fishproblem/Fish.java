package com.singtel.solution.fishproblem;

import com.singtel.solution.animalbirdproblem.Animal;
import com.singtel.solution.animalbirdproblem.Bird;
import com.singtel.solution.animalbirdproblem.Swim;

public class Fish extends Bird implements Swim, Animal {

	@Override
	public void sing() {
		System.out.println("I can not sing");
	}

	@Override
	public String walk() {
		System.out.println("I can not walk");
		return walkMessage;
	}

	public void color() {
		System.out.println("I am of grey color");
	}

	public void size() {
		System.out.println("I am large in size");
	}
}
