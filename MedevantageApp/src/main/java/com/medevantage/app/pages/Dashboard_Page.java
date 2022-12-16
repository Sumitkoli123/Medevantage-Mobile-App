package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Page {

	public WebDriver driver;

	public Dashboard_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By patient_Name = By.xpath("//*[contains(@text, 'Welcome')]");
	By menu = By.xpath("//*[contains(@text, 'menu')]");
	By book_Appt = By.xpath("//*[contains(@text, 'Book Appointment')]");
	
	//android.view.View[2][@index='1']//android.widget.TextView[@text='Book Appointment']

	public void patient_Name() {
		System.out.println(" Patient Name : " + driver.findElement(patient_Name).getText());
	}
	
	public void leftMenu() {
		driver.findElement(menu).click();
	}

	public void book_Appt() {
		driver.findElement(book_Appt).click();
	}

}
