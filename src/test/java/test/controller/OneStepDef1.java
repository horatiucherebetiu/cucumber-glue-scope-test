package test.controller;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import test.configuration.CucumberTestApplicationConfiguration;
import test.service.ServiceTest2;

@ContextConfiguration(classes = CucumberTestApplicationConfiguration.class)
public class OneStepDef1 {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneStepDef1.class);

	@Autowired
	private ServiceTest2 serviceTest2;

	@Given("^StepDef1 injection (.+)")
	public void theStepDef1Injection(String status) {
		LOGGER.info("serviceTest1 = " + serviceTest2.getTest1());
		Assert.assertNotNull(status);
		Assert.assertNotNull(serviceTest2.getTest1());
		// blank
	}

}
