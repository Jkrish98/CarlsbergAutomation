package test.pages;

public class CarlsbergUtility extends CarlsbergPom {
	public CarlsbergUtility() {
		super();
	}

	public void allowPage(String a, String b, String c, String d) {
		jsClick(getAllowcookies());
		sendKeys(getBirthYr().get(0), a);
		sendKeys(getBirthYr().get(1), b);
		sendKeys(getBirthYr().get(2), c);
		sendKeys(getBirthYr().get(3), d);
		click(getEnter());
	}

	public void moveInvester() {
		moveToElement(getInvestrelation());
		jsClick(getInvestcal());
	}

	public void selectDividendCalculator() {
		frameSwitch(0);
		jsSD(getDividendcal());
		jsClick(getDividendcal());
	}

	public void dividendCalculation(String invest, String share) {
		click(getStartdate());
		click(getDate1());
		click(getEnddate());
		click(getDate2());
		sendKeys(getAmountInvested(), invest);
		sendKeys(getShare(), share);
		click(getCalBtn());

	}

}
