package test.commonglue;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import test.beans.Test2;

public class OneStepDef3 {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneStepDef3.class);

	@Autowired
	private Test2 test2;

	@Before("@RequiresBrowser")
	public void buildDriver() throws IOException {
		LOGGER.info("Starting brwser");
	}

	@After("@RequiresBrowser")
	public void destroyDriver() {
		LOGGER.info("Stopping brwser");
	}

	@Given("^the StepDef injection3 works$")
	public void the_StepDef_injection_works() throws Throwable {
		LOGGER.info("test3 = " + test2);
	}

}
