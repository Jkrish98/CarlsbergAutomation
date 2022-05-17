package test.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import test.base.BaseClass;

public class Hooks extends BaseClass {
	@Before
	public void beforeSenario() {
		browserLaunch("chrome");
		launchUrl("https://www.carlsberggroup.com/");
		implicityWait(10);
		maximize();
	}

	@After
	public void afterSenario(Scenario s) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] bt = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(bt, "image/png");
		quit();
	}

}
