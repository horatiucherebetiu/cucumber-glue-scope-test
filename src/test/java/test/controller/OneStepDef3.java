package test.controller;

import java.io.IOException;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import test.service.ServiceTest2;

public class OneStepDef3 {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneStepDef3.class);

	@Autowired
	private ServiceTest2 serviceTest2;

	@Before("@RequiresBrowser")
	public void buildDriver() throws IOException {
		LOGGER.info("Starting brwser");
	}

	@After("@RequiresBrowser")
	public void destroyDriver() {
		LOGGER.info("Stopping brwser");
	}

	@Given("^StepDef3 injection (.+)")
	public void theStepDef3Injection(String status) {
		LOGGER.info("serviceTest1 = " + serviceTest2.getTest1());
		Assert.assertNotNull(status);
		Assert.assertNotNull(serviceTest2.getTest1());
	}

}
