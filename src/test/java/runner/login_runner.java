package runner;

import org.junit.runner.RunWith;
//run the code in simplefom.feature file in form folder of test/resources 
//how to run the code:right click ->run as->1 cucumber feature
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//runwith is used when we have to run specific file (runwith from org.junit.runner  package)
//path from feature file of test\resources
@CucumberOptions(features= {"D:\\selenium_workspace\\Cucumberr\\src\\test\\resources\\form\\simple_form.feature"},//cucumberoptions from the io.cucumber.junit package
glue= {"steps"},
tags="@tag1"
)
//tags="@tag1"


public class login_runner {
	
	

}
