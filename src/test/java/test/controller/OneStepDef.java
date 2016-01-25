package test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import test.configuration.CucumberTestApplicationConfiguration;
import test.service.ServiceTest2;

@ContextConfiguration(classes = CucumberTestApplicationConfiguration.class)
public class OneStepDef {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneStepDef.class);

	@Autowired
	private ServiceTest2 serviceTest2;

	@Given("^the StepDef injection works$")
	public void theStepDefInjectionWorks() {
		LOGGER.info("serviceTest1 = " + serviceTest2.getTest1());

		// blank
	}

}
