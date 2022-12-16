package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Book_Appt_as_caregiverPatient_Page {

	public WebDriver driver;

	public Book_Appt_as_caregiverPatient_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By searchProvider_byName = By.xpath("//*[@class='android.widget.EditText']");

	By selectProvider = By.xpath("//android.view.View[2][@index='1']/android.view.View[1][@index='0']");

	By bookAptButton = By.xpath("//android.widget.Button[@text='Book Appointment']");

	public void searchProvider_byName() {
		driver.findElement(searchProvider_byName).sendKeys("B");
	}

	public void selectProvider() {
		driver.findElement(selectProvider).click();
	}

	public void bookAptButton() {
		driver.findElement(bookAptButton).click();
	}
}
