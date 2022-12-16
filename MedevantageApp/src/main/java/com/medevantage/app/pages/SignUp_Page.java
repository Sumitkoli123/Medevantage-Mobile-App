package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {

	public WebDriver driver;
	

	public SignUp_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By getStarted = By.xpath("//*[@text='Get Started']");

	By signUp_Link = By.xpath("//*[@text=' Sign up']");

	By first_Name = By.xpath("//*[@resource-id='firstname']");

	By last_Name = By.xpath("//*[@resource-id='lastname']");

	By signUp_Email = By.xpath("//*[@resource-id='signupemail']");

	By phone_No = By.xpath("//*[@resource-id='phoneNumber']");

	By signUp_Pass = By.xpath("//*[@resource-id='signuppassword']");

	By show_SignUp_Pass = By.xpath("//*[contains(@resource-id, 'showsignuppasswordId')]");

	By conf_SignUp_Pass = By.xpath("//*[@resource-id='confirmsignuppassword']");

	By show_Conf_Pass = By.xpath("//*[contains(@resource-id, 'showconfirmsignuppasswordId')]");

	By accept_Terms_Condition = By.xpath("//*[@resource-id='accept']");

	By signUp_Button = By.xpath("//*[@resource-id='btn-signup']");

	By check_Email = By.xpath("//*[contains(@text, 'Check your email to verify')]");

	By chrome_search_Box = By.xpath("//*[contains(@resource-id, 'com.android.chrome:id/search_box_text')]");

	By goTo_email = By.xpath(
			"//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2][@index='1']");

	By email_searchBox = By.xpath("//*[contains(@resource-id, 'login')]");

	By search_email_Button = By.xpath("//*[@text='' and @class='android.widget.Button']");

	By select_Email = By.xpath("//*[contains(@text, 'support@medevantage.com Verify your email')]");

	By verify_User_Email = By.xpath("//android.view.View[@content-desc=\"  Verify Email \"]");

	By open_medApp = By.xpath("//*[@text='Medevantage']");
	
	

	public void getStarted() {
		driver.findElement(getStarted).click();
	}

	public void signUp_Link() {
		driver.findElement(signUp_Link).click();
	}

	public void setFirst_Name(String fName) {
		driver.findElement(first_Name).sendKeys(fName);
	}

	public void setLast_Name(String lName) {
		driver.findElement(last_Name).sendKeys(lName);
	}

	public void setSignUp_Email(String Email) {
		driver.findElement(signUp_Email).sendKeys(Email);
	}

	public void setPhone_No(String pNumber) {
		driver.findElement(phone_No).sendKeys(pNumber);
	}

	public void setSignUp_Pass(String pass) {
		driver.findElement(signUp_Pass).sendKeys(pass);
	}

	public void show_SignUp_Pass() {
		driver.findElement(show_SignUp_Pass).click();
	}

	public void setConf_SignUp_Pass(String conPass) {
		driver.findElement(conf_SignUp_Pass).sendKeys(conPass);
	}

	public void show_Conf_Pass() {
		driver.findElement(show_Conf_Pass).click();
	}

	public void clickAccept_Terms_Condition() {
		driver.findElement(accept_Terms_Condition).click();
	}

	public void signUp_Button() {
		driver.findElement(signUp_Button).click();
	}

	public void check_Email() {
		System.out.println(driver.findElement(check_Email).getText());
	}

	public void chrome_search_Box() {
		driver.findElement(chrome_search_Box).sendKeys("https://yopmail.com/en/");
	}

	public void goTo_email() {
		driver.findElement(goTo_email).click();
	}

	public void email_searchBox(String Email) {
		WebElement email = driver.findElement(email_searchBox);
		email.clear();
		email.sendKeys(Email);
	}

	public void search_email_Button() {
		driver.findElement(search_email_Button).click();
	}

	public void select_Email() {
		driver.findElement(select_Email).click();
	}

	public void verify_User_Email() {
		driver.findElement(verify_User_Email).click();
	}

	public void open_medApp() {
		driver.findElement(open_medApp).click();
	}
}
