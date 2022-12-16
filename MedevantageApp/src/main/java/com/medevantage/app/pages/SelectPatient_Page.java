package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelectPatient_Page {

	public WebDriver driver;

	public SelectPatient_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By dropdown_List = By.xpath("//android.view.View[2][@index='1']//android.widget.Button[@index='2']");

	By select_Patient = By.xpath("//*[@text='radio button off Yourself']");

	By next_Button = By.xpath("//*[@text='Next']");	

	public void dropdown_List() {
		driver.findElement(dropdown_List).click();
	}

	public void select_Patient() {
		driver.findElement(select_Patient).click();
	}

	public void next_Button() {
		driver.findElement(next_Button).click();
	}
	
}
