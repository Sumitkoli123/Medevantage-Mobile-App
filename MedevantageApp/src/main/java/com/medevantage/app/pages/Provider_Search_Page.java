package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Provider_Search_Page {

	public WebDriver driver;

	public Provider_Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By searchSpeciality = By.xpath("//*[@text='Select Speciality']");

	By selectSpeciality = By.xpath("//*[contains(@text,'patient Family Practice')]");

	By searchLocation = By.xpath("//*[@text='Select Location']");

	By selectLocation = By.xpath("//*[@text='Middletown 155']");

	By clickSearchBtn = By.xpath("//android.widget.Button[@text='Search']");

	By clickBookApt = By.xpath("//*[contains(@text,'Book Appointment')]");

	public void searchSpeciality() {
		driver.findElement(searchSpeciality).click();
	}

	public void selectSpeciality() {
		driver.findElement(selectSpeciality).click();
	}

	public void searchLocation() {
		driver.findElement(searchLocation).click();
	}

	public void selectLocation() {
		driver.findElement(selectLocation).click();
	}

	public void clickSearchBtn() {
		driver.findElement(clickSearchBtn).click();
	}

	public void clickBookApt() {
		driver.findElement(clickBookApt).click();
	}

}
