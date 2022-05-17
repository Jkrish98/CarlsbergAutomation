package test.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.base.BaseClass;

public class CarlsbergPom extends BaseClass {
	public CarlsbergPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Allow all']")
	private WebElement allowcookies;
	@FindBy(xpath = "//input[contains(@name,'cb_age_year')]")
	private List<WebElement> birthYr;
	@FindBy(id = "cbgAge-submit")
	private WebElement enter;
	@FindBy(xpath = "//a[@id='id_investor-relations']")
	private WebElement investrelation;
	@FindBy(xpath = "(//a[text()='Investment Calculator'])[2]")
	private WebElement investcal;
	@FindBy(xpath = "//a[.='Dividend Calculator']")
	private WebElement dividendcal;
	@FindBy(xpath = "(//div[@class='EurolandTools-CommonObjects-Calendar-SelectionIndicator'])[1]")
	private WebElement startdate;
	@FindBy(xpath = "(//*[.='16'])[5]")
	private WebElement date1;
	@FindBy(xpath = "(//div[@class='EurolandTools-CommonObjects-Calendar-SelectionIndicator'])[2]")
	private WebElement enddate;
	@FindBy(xpath = "(//*[.='16'])[7]")
	private WebElement date2;
	@FindBy(xpath = "//label[.='Amount invested']")
	private WebElement amountInvested;
	@FindBy(xpath = "//label[.='Shares purchased']")
	private WebElement share;
	@FindBy(className = "EurolandTools-TotalReturnAndDividends-CalculatorTab-Button")
	private WebElement calBtn;

	public WebElement getAllowcookies() {
		return allowcookies;
	}

	public List<WebElement> getBirthYr() {
		return birthYr;
	}

	public WebElement getEnter() {
		return enter;
	}

	public WebElement getInvestrelation() {
		return investrelation;
	}

	public WebElement getInvestcal() {
		return investcal;
	}

	public WebElement getDividendcal() {
		return dividendcal;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getAmountInvested() {
		return amountInvested;
	}

	public WebElement getShare() {
		return share;
	}

	public WebElement getCalBtn() {
		return calBtn;
	}
	
	

}
