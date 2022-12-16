package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword_Page {

	public WebDriver driver;

	public ForgotPassword_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By get_Started = By.xpath("//*[contains(@text, 'Started')]");

	By forgot_Pass = By.xpath("//*[contains(@text, 'Forgot password?')]");

	By email = By.xpath("//*[contains(@resource-id, 'forgotemail')]");

	By continue1_Button = By.xpath("//*[contains(@text, 'Continue')]");

	By reset_Link_Send = By.xpath("//*[contains(@text, 'A link to reset your password is sent on your email')]");

	By search_Box = By.xpath("//*[contains(@resource-id, 'com.android.chrome:id/search_box_text')]");
	
	By goTo_email = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2][@index='1']");

	By email_searchBox = By.xpath("//*[contains(@resource-id, 'login')]");

	By search_emailButton = By.xpath("//*[@text='' and @class='android.widget.Button']");

	By select_Email = By.xpath("//*[contains(@text, 'support@medevantage.com Reset your password')]");

	By confirm_Button = By.xpath(
			"(//android.view.View[@content-desc=\"  Confirm \"])[1]/android.view.View/android.view.View/android.view.View");

	By open_medApp = By.xpath("//*[@text='Medevantage']");

	By new_Password = By.xpath("//android.view.View[1]/android.widget.EditText[@index='1']");

	By reEnter_Password = By.xpath("//android.view.View[2]/android.widget.EditText[@index='1']");

	By continue2_Button = By.xpath("//*[@text='Continue']");

	public void get_Started() {
		driver.findElement(get_Started).click();
	}

	public void forgot_Pass() {
		driver.findElement(forgot_Pass).click();
	}

	public void setEmail(String Email) {
		driver.findElement(email).sendKeys(Email);
	}

	public void continue1_Button() {
		driver.findElement(continue1_Button).click();
	}

	public void reset_Link_Send() {
		System.out.println(driver.findElement(reset_Link_Send).getText());
	}

	public void search_Box() {
		driver.findElement(search_Box).sendKeys("https://yopmail.com/en/");
	}
	
	public void goTo_email() {
		driver.findElement(goTo_email).click();
	}

	public void email_searchBox(String Email) {
		WebElement email = driver.findElement(email_searchBox);
		email.clear();
		email.sendKeys(Email);
	}

	public void search_emailButton() {
		driver.findElement(search_emailButton).click();
	}

	public void select_Email() {
		driver.findElement(select_Email).click();
	}

	public void confirm_Button() {
		driver.findElement(confirm_Button).click();
	}

	public void open_medApp() {
		driver.findElement(open_medApp).click();
	}

	public void new_Password() {
		driver.findElement(new_Password).sendKeys("Test@123");
	}

	public void reEnter_Password() {
		driver.findElement(reEnter_Password).sendKeys("Test@123");
	}

	public void continue2_Button() {
		driver.findElement(continue2_Button).click();
	}
}
