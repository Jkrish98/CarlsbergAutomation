package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import jvm.report.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "test.stepdefinition", dryRun = false, monochrome = true, 
                 plugin = {"pretty", "json:src\\test\\resources\\Reports\\JsonReport\\jsonreport.json" })
public class RunnerClass {
	@AfterClass
	public static void afterClassSenario() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\jsonreport.json");
		System.out.println("----done----");
	}

}
