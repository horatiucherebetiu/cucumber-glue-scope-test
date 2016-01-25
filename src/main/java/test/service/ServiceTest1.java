/**
 *
 */
package test.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Horatiu.Cherebetiu
 *
 */
@Scope("cucumber-glue")
@Service
public class ServiceTest1 {

	public ServiceTest1() {
		System.out.println("Test1 constructor called");
	}

}
