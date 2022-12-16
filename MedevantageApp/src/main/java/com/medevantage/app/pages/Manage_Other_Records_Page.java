package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Manage_Other_Records_Page {

	public WebDriver driver;

	public Manage_Other_Records_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By left_Menu = By.xpath("//*[@text='menu']");
	
	By userNameB = By.xpath("//android.view.View[1]/android.widget.TextView[@index='1']");
	
	By manage_Other_Record = By.xpath("//*[@text='Manage Other Records']");
	
	By patient_Name = By.xpath("//android.view.View[2]/android.view.View/android.widget.TextView[@index='1']");
	
	By patient_Email = By.xpath("//android.view.View[2]/android.view.View/android.widget.TextView[@index='2']");
	
	By terms_And_condition_Checkbox = By.xpath("//*[@class='android.widget.Button' and ./parent::*[@text='I accept terms and conditions.']]");
	
	By approve_Req = By.xpath("//*[@text='Approve']");
	
	By reject_Req = By.xpath("//*[@text='Reject']");
	
	By approved_Tab = By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.ToggleButton[@index='0']");
	
	By change_Access = By.xpath("//*[@text='CHANGE ACCESS']");
	
	By no_Access = By.xpath("//*[@text='No access']");
	
	By full_Access = By.xpath("//*[@text='Full access']");
	
	By read_Access = By.xpath("//*[@text='Read access']");
	
	By revoke_Access = By.xpath("//*[@text='Revoke Access']");
	
	By rejected_Tab = By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.ToggleButton[@index='0']");
	
	By req_Rejected = By.xpath("");
	

	public void left_Menu() {
		driver.findElement(left_Menu).click();
	}
	
	public String userNameB() {
		return driver.findElement(userNameB).getText();
	}

	public void manage_Other_Record() {
		driver.findElement(manage_Other_Record).click();
	}

	public void patient_Name() {
		System.out.println("Caregiver request patient name : " + driver.findElement(patient_Name).getText());
	}
	
	public void patient_Email() {
		System.out.println("Caregiver request patient Email : " + driver.findElement(patient_Email).getText());
	}

	public void terms_And_condition_Checkbox() {
		driver.findElement(terms_And_condition_Checkbox).click();
	}

	public void approve_Req() {
		driver.findElement(approve_Req).click();
	}

	public void reject_Req() {
		driver.findElement(reject_Req).click();
	}
	
	public void approved_Tab() {
		driver.findElement(approved_Tab).click();
	}
	
	public void change_Access_Btn() {
		driver.findElement(change_Access).click();
	}
	
	public void no_Access() {
		driver.findElement(no_Access).click();
	}
	
	public void full_Access() {
		driver.findElement(full_Access).click();
	}
	
	public void read_Access() {
		driver.findElement(read_Access).click();
	}
	
	public void revoke_Access_Btn() {
		driver.findElement(revoke_Access).click();
	}
	
	public void rejected_Tab() {
		driver.findElement(rejected_Tab).click();
	}
	
	public void req_Rejected() {
		driver.findElement(req_Rejected).click();
	}
	
}
