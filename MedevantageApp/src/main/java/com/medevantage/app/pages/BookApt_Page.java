package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookApt_Page {

	public WebDriver driver;

	public BookApt_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By location_Dropdown = By.xpath("//android.widget.Button[@index='2']");
	
	By select_Location = By.xpath("//android.app.Dialog[@index='2']/android.view.View[1]/android.widget.Button[@index='0']");
	
	By reason_Dropdown = By.xpath("//android.widget.ListView/android.widget.TextView[1][@text='Select Reason For Visit']");
	
	By select_Reason_as_Ancillary_and_Vaccination = By.xpath("//*[@text='Ancillary and Vaccination']");
	
	By select_Reason_as_General_Follow_Up = By.xpath("//*[@text='General Follow Up']");
	
	By select_Reason_as_Medicare_Sick_Visit = By.xpath("//*[@text='Medicare Sick Visit']");	
	
	By select_Reason_as_PreOp_Clearance = By.xpath("//*[@text='Pre-Op Clearance']");
	
	By select_Reason_as_Sick_Visit = By.xpath("//*[@text='Sick Visit']");
	
	By select_Concussion = By.xpath("//*[@text='Concussion']");
	
	By select_Concussion_as_Yes = By.xpath("//*[@text='Yes']");
	
	By select_Reason_as_Well_Visit = By.xpath("//*[@text='Well Visit']");
	
	By select_Reason_as_Annual_Physical = By.xpath("//*[@text='Annual Physical']");
	
	By appt_Reason = By.xpath("//android.widget.EditText[@index='0']");
	
	By continue_Button = By.xpath("//*[contains(@text, 'CONTINUE')]");

	public void location_Dropdown() {
		driver.findElement(location_Dropdown).click();
	}

	public void select_Location() {
		driver.findElement(select_Location).click();
	}

	public void reason_Dropdown() {
		driver.findElement(reason_Dropdown).click();
	}

	public void select_Reason_as_Ancillary_and_Vaccination() {
		driver.findElement(select_Reason_as_Ancillary_and_Vaccination).click();
	}
	
	public void select_Reason_as_General_Follow_Up() {
		driver.findElement(select_Reason_as_General_Follow_Up).click();
	}
	
	public void select_Reason_as_Medicare_Sick_Visit() {
		driver.findElement(select_Reason_as_Medicare_Sick_Visit).click();
	}
	
	public void select_Reason_as_PreOp_Clearance() {
		driver.findElement(select_Reason_as_PreOp_Clearance).click();
	}
	
	public void select_Reason_as_Sick_Visit() {
		driver.findElement(select_Reason_as_Sick_Visit).click();
	}
	
	public void select_Concussion() {
		driver.findElement(select_Concussion).click();
	}
	
	public void select_Concussion_as_Yes() {
		driver.findElement(select_Concussion_as_Yes).click();
	}
	
	public void select_Reason_as_Well_Visit() {
		driver.findElement(select_Reason_as_Well_Visit).click();
	}
	
	public void select_Reason_as_Annual_Physical() {
		driver.findElement(select_Reason_as_Annual_Physical).click();
	}

	public void set_Appt_Reason() {
		driver.findElement(appt_Reason).sendKeys("Automated Test Appointment");
	}

	public void continue_Button() {
		driver.findElement(continue_Button).click();
	}

}
