package test.controller;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Given;
import test.service.ServiceTest2;

public class OneStepDef2 {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneStepDef2.class);

	@Autowired
	private ServiceTest2 serviceTest2;

	@Given("^StepDef2 injection (.+)")
	public void theStepDef2Injection(String status) {
		LOGGER.info("serviceTest1 = " + serviceTest2.getTest1());
		Assert.assertNotNull(status);
		Assert.assertNotNull(serviceTest2.getTest1());
	}

}
