package test.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"test.beans" })
public class CucumberTestApplicationConfiguration {



}
