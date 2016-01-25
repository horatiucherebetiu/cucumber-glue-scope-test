package test.commonglue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import test.beans.Test2;
import test.configuration.CucumberTestApplicationConfiguration;

@ContextConfiguration(classes = CucumberTestApplicationConfiguration.class)
public class OneStepDef {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneStepDef.class);

	@Autowired
	private Test2 test2;

	@Given("^the StepDef injection works$")
	public void the_StepDef_injection_works() {
		LOGGER.info("test = " + test2);

		// blank
	}

}
