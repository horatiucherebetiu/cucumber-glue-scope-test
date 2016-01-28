package test.controller;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Then;
import test.service.ServiceTest1;

public class AnnotationStepDefinition {

	private static final Logger LOGGER = LoggerFactory.getLogger(AnnotationStepDefinition.class);

	@Autowired
	private ServiceTest1 serviceTest1;

	@Then("^Service is annotated with (.+)")
	public void annotation(String annotation) {
		LOGGER.info("Annotation = " + annotation);
		LOGGER.info("serviceTest1 = " + serviceTest1);
		Assert.assertNotNull(annotation);

		Assert.assertNotNull(serviceTest1);
	}

}
