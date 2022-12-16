package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookSlot_Page {

	public WebDriver driver;

	public BookSlot_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By next_Day = By.xpath("//android.view.View[4][@index='3']");

	By Next_Availability = By.xpath("//*[contains(@text,'Next Availability On')]");
	
	By morning_Slot = By.xpath("//*[contains(@text, '7:30 AM')]");
		
	By afternoon_Slot = By.xpath("//*[contains(@text, '2:30 PM')]");

	By evening_Slot = By.xpath("//*[contains(@text, '05:00 PM')]");

	By book_Btn = By.xpath("//*[@text='BOOK']");

	By continue_Button = By.xpath("//*[contains(@text, 'CONTINUE')]");

	public void click_next_Day() {
		driver.findElement(next_Day).click();
	}

	public void click_Next_Availability() {
		driver.findElement(Next_Availability).click();
	}
	
	public void select_morning_Slot() {
		driver.findElement(morning_Slot).click();
	}
	
	public void select_afternoon_Slot() {
		driver.findElement(afternoon_Slot).click();
	}

	public void select_evening_Slot() {
		driver.findElement(evening_Slot).click();
	}

	public void book_Btn() {
		driver.findElement(book_Btn).click();
	}

	public void continue_Button() {
		driver.findElement(continue_Button).click();
	}

}
