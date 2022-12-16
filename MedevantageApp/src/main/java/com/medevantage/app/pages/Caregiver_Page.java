package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Caregiver_Page {

	public WebDriver driver;

	public Caregiver_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By req_to_other_record = By.xpath("//*[contains(@text, 'Request To Other Record')]");
	
	By access_Type = By.xpath("//*[contains(@text, 'Access Type :')]");
	
	By full_Access = By.xpath("//android.view.View[@index='0']//android.widget.Button[@text='Full access']");
	
    By no_Access = By.xpath("//*[@text='No access']");
	
	By read_Access = By.xpath("//*[@text='Read access']");
	
	By username = By.xpath("//android.view.View[@index='1']//android.widget.EditText[@index='0']");
	
	By relationship = By.xpath("//*[contains(@text, 'Relationship :')]");
	
	By relationship_Friend = By.xpath("//android.view.View[@index='0']//android.widget.Button[@text='friend']");
	
	By request_Button = By.xpath("//android.widget.Button[@text='Request']");
	
	By left_Menu = By.xpath("//*[@text='menu']");
	
	By close = By.xpath("//*[@text='menu']");
	
	By logout = By.xpath("//*[@text='Log Out']");
	
	By click_Yes = By.xpath("//*[@text='YES']");
	
	public void req_to_other_record() {
		driver.findElement(req_to_other_record).click();
	}
	
	public void access_Type() {
		driver.findElement(access_Type).click();
	}
	
	public void full_Access() {
		driver.findElement(full_Access).click();
	}
	
	public void no_Access() {
		driver.findElement(no_Access).click();
	}
	
	public void read_Access() {
		driver.findElement(read_Access).click();
	}
	
	public void setusername(String userName) {
		driver.findElement(username).sendKeys(userName);
	}
	
	public void relationship() {
		driver.findElement(relationship).click();
	}
	
	public void relationship_Friend() {
		driver.findElement(relationship_Friend).click();
	}
	
	public void request_Button() {
		driver.findElement(request_Button).click();
	}
	
	public void left_Menu() {
		driver.findElement(left_Menu).click();
	}
	
	public void close() {
		driver.findElement(close).click();
	}
	
	public void logout() {
		driver.findElement(logout).click();
	}
	
	public void click_Yes() {
		driver.findElement(click_Yes).click();
	}
	
}
