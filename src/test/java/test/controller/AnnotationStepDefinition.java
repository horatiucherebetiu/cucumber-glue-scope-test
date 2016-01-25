package test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.Given;

public class AnnotationStepDefinition {

	private static final Logger LOGGER = LoggerFactory.getLogger(AnnotationStepDefinition.class);

	@Given("^the service is annotated with (.+)")
	public void annotation(String annotation) {
		LOGGER.info("Annotation = " + annotation);
	}

}
