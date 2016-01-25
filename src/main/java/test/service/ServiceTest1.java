/**
 *
 */
package test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Horatiu.Cherebetiu
 *
 */
@Scope("cucumber-glue")
@Service
public class ServiceTest1 {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceTest1.class);

	public ServiceTest1() {
		LOGGER.info("Test1 constructor called");
	}

}
