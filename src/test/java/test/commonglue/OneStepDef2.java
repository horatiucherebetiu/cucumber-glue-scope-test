package test.commonglue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Given;
import test.beans.Test2;

public class OneStepDef2 {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneStepDef2.class);

	@Autowired
	private Test2 test2;

	@Given("^the StepDef injection2 works$")
	public void the_StepDef_injection_works() {
		LOGGER.info("test2 = " + test2);
	}

}
