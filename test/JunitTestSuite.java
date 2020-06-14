package com.singtel.solution.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({ TestAnimalBird.class, TestButterfly.class, TestDuckChicken.class, TestFish.class, TestParrot.class,
		TestRooster.class })

public class JunitTestSuite {

}
