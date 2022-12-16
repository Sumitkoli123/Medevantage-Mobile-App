package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AppointmentConfm_Page {

	public WebDriver driver;

	public AppointmentConfm_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By booked_Successfully = By.xpath("//android.widget.TextView[1][@index='1']");
	
	By add_To_Calender = By.xpath("//*[@text='calendar outline Add To Calendar']");
	
	By allow_Access_to_calender = By.xpath("//*[@text='ALLOW']");
	
	By return_To_Appt_List = By.xpath("//*[@text='Return To Appointment List']");

	public void booked_Successfully() {
		System.out.println(driver.findElement(booked_Successfully).getText());
	}

	public void add_To_Calender() {
		driver.findElement(add_To_Calender).click();
	}

	public void allow_Access_to_calender() {
		driver.findElement(allow_Access_to_calender).click();
	}

	public void return_To_Appt_List() {
		driver.findElement(return_To_Appt_List).click();
	}

}
