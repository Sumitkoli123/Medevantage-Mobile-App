package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;

public class RescheduleApt_Page {
	
		public WebDriver driver;

		public RescheduleApt_Page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		By reschedule_Apt_Button = By.xpath("//*[contains(@text, 'reload outline RESCHEDULE APPOINTMENT')]");
		By appt_Reason = By.xpath("//android.widget.EditText[@index='0']");
		By continue_Button = By.xpath("//*[contains(@text, 'CONTINUE')]");
		
		
		public void reschedule_Apt_Button() {
			driver.findElement(reschedule_Apt_Button).click();
		}
		
		public void set_Appt_Reason() {
			MobileElement text = driver.findElement(appt_Reason); //.sendKeys("Test Rescheduled Appointment");
			text.clear();
			text.sendKeys("Automated Rescheduled Test Appointment");
		}

		public void continue_Button() {
			driver.findElement(continue_Button).click();
		}


}
