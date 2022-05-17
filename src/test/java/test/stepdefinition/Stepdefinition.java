package test.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.*;
import test.base.BaseClass;
import test.pages.CarlsbergUtility;

public class Stepdefinition extends BaseClass {

	public static CarlsbergUtility c;

	@Given("The user should be in invesment page of carlsberg application")
	public void the_user_should_be_in_invesment_page_of_carlsberg_application() {
		c=new CarlsbergUtility();
		c.allowPage("1", "9", "9", "5");
	}

	@When("Make sure the user is in the Carlsberg homepage")
	public void make_sure_the_user_is_in_the_Carlsberg_homepage() {
		Assert.assertTrue("Homepage", getCurrentUrl().contains("carlsberggroup"));
	}

	@When("User goto investment relations option and select the sub option investment calculator")
	public void user_goto_investment_relations_option_and_select_the_sub_option_investment_calculator() {
		c.moveInvester();
	}

	@When("User should select the dividend calculator option")
	public void user_should_select_the_dividend_calculator_option() {
		c.selectDividendCalculator();
	}

	@When("Fill all the required datas and click calculate button")
	public void fill_all_the_required_datas_and_click_calculate_button() {
		c.dividendCalculation("317643827", "453453");
	}

	@Then("User should view the calculated results")
	public void user_should_view_the_calculated_results() throws IOException {
		

	}

}
