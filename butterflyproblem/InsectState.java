package com.singtel.solution.butterflyproblem;

/**
 * @author Himani
 *
 */
public class InsectState {

	public InsectState() {

	}

	/**
	 * The below check has been done to show the transformation form caterpillar to
	 * Butterfly. Assumption: Age < 10-->Caterpillar,Age > 10-->Butterfly
	 **/
	public Insect getInsect(int age) {
		if (age < 10) {
			return new Caterpillar();
		} else {
			return new Butterfly();
		}
	}

}
