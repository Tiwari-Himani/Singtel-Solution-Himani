package com.singtel.solution;

import com.singtel.solution.animalbirdproblem.Bird;
import com.singtel.solution.butterflyproblem.Insect;
import com.singtel.solution.butterflyproblem.InsectState;
import com.singtel.solution.duckchickenproblem.Chicken;
import com.singtel.solution.duckchickenproblem.Duck;
import com.singtel.solution.fishproblem.Clownfish;
import com.singtel.solution.fishproblem.Dolphin;
import com.singtel.solution.fishproblem.Fish;
import com.singtel.solution.fishproblem.Shark;
import com.singtel.solution.parrotproblem.Parrot;
import com.singtel.solution.parrotproblem.Pcat;
import com.singtel.solution.parrotproblem.Pdog;
import com.singtel.solution.roosterproblem.Rooster;
//import com.singtel.solution.utility.RoosterLanguage;
import com.singtel.solution.utility.Count;

/**
 * @author Himani
 *
 */
public class Solution {

	public static void getAllDetails() {

		System.out.println("*************AnimalBirdProblem*************");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		System.out.println("*************DuckChickenProblem*************");
		Duck duck = new Duck();
		Chicken chicken = new Chicken();
		duck.produceSound();
		duck.swim();
		chicken.produceSound();
		chicken.fly();

		System.out.println("*************RoosterProblem*************");
		Rooster rooster = new Rooster();
		rooster.getRooster();
		rooster.produceSound();

		System.out.println("*************ParrotProblem*************");
		Parrot pdog = new Parrot(new Pdog());
		pdog.getDog().produceSound();
		Parrot pcat = new Parrot(new Pcat());
		pcat.getCat().produceSound();
		Parrot roost = new Parrot(new Rooster());
		roost.getRooster().produceSound();
		Parrot pduck = new Parrot(new Duck());
		pduck.getDuck().produceSound();

		System.out.println("*************FishProblem*************");
		Fish fish = new Fish();
		fish.swim();
		fish.walk();
		fish.sing();
		System.out.println("-------SharkDetails-------");
		Shark shark = new Shark();
		shark.sharkColor();
		shark.sharkSize();
		shark.eatOtherFish();
		System.out.println("-------ClownFishDetails-------=");
		Clownfish clownfish = new Clownfish();
		clownfish.color();
		clownfish.size();
		clownfish.makeJokes();
		System.out.println("-------DolphinDetails-------");
		Dolphin dolphin = new Dolphin();
		dolphin.swim();

		System.out.println("*************ButterflyProblem*************");
		InsectState insectState = new InsectState();
		System.out.println("-------Caterpillar-------");
		Insect caterpillar = insectState.getInsect(5);
		caterpillar.fly();
		caterpillar.walk();
		System.out.println("-------Butterfly-------");
		Insect butterfly = insectState.getInsect(12);
		butterfly.fly();
		butterfly.produceSound();

		System.out.println("*************Counting*************");
		Count.countAnimals();

		System.out.println("**********************************");
	}

}
