package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	public WebDriver driver;

	public SignIn_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	By getStarted = By.xpath("//*[@text='Get Started']");

	By signIn_Email = By.xpath("//*[@resource-id='signinemail']");

	By signIn_Pass = By.xpath("//*[@resource-id='signinpassword']");

	By signIn_Button = By.xpath("//*[@resource-id='btn-login']");   
	
	//By exp_Title = By.xpath("//*[@id='errormessage' and @nodeName='DIV']");
	


	public void getStarted() {
		driver.findElement(getStarted).click();
	}

	public void setSignIn_Email(String Email) {
		driver.findElement(signIn_Email).sendKeys(Email);
	}
	
	public void setSignIn_Pass(String Pass) {
		driver.findElement(signIn_Pass).sendKeys(Pass);
	}

	public void signIn_Button() {
		driver.findElement(signIn_Button).click();
	}
	
	/*
	public String exp_Title() {
		return driver.findElement(exp_Title).getText();
		}
	*/

}