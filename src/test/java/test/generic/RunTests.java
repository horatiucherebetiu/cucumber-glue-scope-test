/**
 *
 */
package test.generic;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Horatiu.Cherebetiu
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "json:target/tests-result-cucumber.json" }, glue = { "test.controller"})
public class RunTests {

}
