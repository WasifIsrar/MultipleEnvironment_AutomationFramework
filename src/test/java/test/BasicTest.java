package test;


import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import envConfig.Environment;


public class BasicTest {

	String environment;
	String pin;
	
	@Test
	@Parameters({"environment"})
	public void getEnvironment(String environment) {
		this.environment=environment;
		ConfigFactory.setProperty("env", environment);
		Environment testEnvironment=ConfigFactory.create(Environment.class);
		System.out.println(testEnvironment.pin());
	}
}
