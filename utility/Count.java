package com.singtel.solution.utility;

public class Count {
	public static int countFlying = 0;
	public static int countWalk = 0;
	public static int countSing = 0;
	public static int countSwim = 0;

	public static void countAnimals() {
		System.out.println("Number of Animals that can fly: " + countFlying);
		System.out.println("Number of Animals that can walk: " + countWalk);
		System.out.println("Number of Animals that can sing: " + countSing);
		System.out.println("Number of Animals that can swim: " + countSwim);
	}
}
