package test.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (BrowserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		return driver;
	}

	public static void launchUrl(String Url) {
		driver.get(Url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicityWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void quit() {
		driver.quit();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static void sendKeys(WebElement w, String value) {
		w.sendKeys(value);
	}

	public static void click(WebElement w) {
		w.click();
	}

	public static void moveToElement(WebElement w) {
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
	}

	public static void jsClick(WebElement w) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", w);
	}

	public static void jsSD(WebElement w) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", w);
	}

	public static void frameSwitch(int index) {
		driver.switchTo().frame(index);
	}
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots\\" + name + ".png");
		FileUtils.copyFile(scr, des);

	}

}