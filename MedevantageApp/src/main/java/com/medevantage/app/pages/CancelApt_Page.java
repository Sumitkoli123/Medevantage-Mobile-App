package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CancelApt_Page {

		public WebDriver driver;

		public CancelApt_Page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		By my_Appts_Button = By.xpath("//*[contains(@text, 'My Appointments')]");
		//By upcoming_Appt_Page = By.xpath("//*[contains(@text, 'Tuesday, August 9, 2022')]");
		By select_Apt = By.xpath("//*[contains(@text, 'Tuesday, August 9, 2022')]");
		By cancel_Appt_Button = By.xpath("//*[contains(@text, 'close CANCEL')]");
		By select_Cancellation_Reason = By.xpath("//*[contains(@resource-id, 'ion-rb-3-lbl')]");
		By Reason = By.xpath("//android.view.View[4][@index='3']");
		By continue_Button = By.xpath("//*[contains(@text, 'CONTINUE')]");
		By calender_Allow = By.xpath("//*[contains(@text, 'ALLOW')]");
		By appt_Status = By.xpath("//*[contains(@text, ' Cancelled')]");
		
		
		
		public void my_Appts_Button() {
			driver.findElement(my_Appts_Button).click();
		}
	/*	
		public void upcoming_Appt_Page() {
			driver.findElement(upcoming_Appt_Page).click();
		}
	*/	
		public void select_Apt() {
			driver.findElement(select_Apt).click();
		}
		
		public void cancel_Appt_Button() {
			driver.findElement(cancel_Appt_Button).click();
		}
		
		public void select_Cancellation_Reason() {
			System.out.println("Appointment Cancellation Reason : "  + driver.findElement(select_Cancellation_Reason).getText());
		}
		
		public void Reason() {
			driver.findElement(Reason).click();
		}
		
		public void continue_Button() {
			driver.findElement(continue_Button).click();
		}
		
		public void calender_Allow() {
			driver.findElement(calender_Allow).click();
		}
		
		public String appt_Status() {
			return driver.findElement(appt_Status).getText();
			 
		}
		
		
}
