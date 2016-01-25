/**
 *
 */
package test.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Horatiu.Cherebetiu
 *
 */
@Scope("cucumber-glue")
@Service
public class Test1 {

	public Test1() {
		System.out.println("Test1 constructor called");
	}

}
