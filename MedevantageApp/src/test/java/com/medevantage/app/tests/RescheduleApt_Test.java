package com.medevantage.app.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.AppointmentConfm_Page;
import com.medevantage.app.pages.BookApt_Page;
import com.medevantage.app.pages.BookSlot_Page;
import com.medevantage.app.pages.RescheduleApt_Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class RescheduleApt_Test extends BaseClass {
	BookApt_Page bookApt;
	BookSlot_Page slots;
	AppointmentConfm_Page ApptConf;
	RescheduleApt_Page reschApt;
	String morningSlots = "Morning";

	@Test
	public void rescheduleAppointment() throws InterruptedException {

		reschApt = new RescheduleApt_Page(driver);
		reschApt.reschedule_Apt_Button();
		Thread.sleep(5000);
		reschApt.set_Appt_Reason();
		reschApt.continue_Button();

		slots = new BookSlot_Page(driver);
		slots.click_next_Day();

		List<MobileElement> check_slot = driver.findElements(By.xpath("//android.view.View[2][@index='1']/android.view.View[@index='0']/android.widget.Button"));

		if (check_slot.size() < 0 || check_slot.size() > 0) {
			System.out.println("Slots are not available.");
			slots.click_Next_Availability();
			@SuppressWarnings("rawtypes")
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(178, 723)).perform();
			slots.book_Btn();
			slots.continue_Button();
		} else {
			System.out.println("Slots are available.");
		}

	

		if (driver.findElement(By.xpath("//*[@text='Morning' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='08:00 AM']]]")).isDisplayed()) 
		{
			System.out.println("Morning Slot is Available");
			slots.select_morning_Slot();
/*			
		}
		else
		{
			System.out.println("Morning Slot Are Not Available");
		}
		

		if (driver.findElement(By.xpath("//*[@text='Afternoon' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='08:00 AM']]]")).isDisplayed()) 
		{
			System.out.println("Afternoon Slot is Available");
			slots.select_afternoon_Slot();
		}
		else
		{
			System.out.println("Afternoon Slot Are Not Available");
		}
		
		if (driver.findElement(By.xpath("//*[@text='Evening' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='08:00 AM']]]")).isDisplayed())
		{
			System.out.println("Evening Slot is Available");
			slots.select_evening_Slot();
		}
		else
		{
			System.out.println("Evening Slot Are Not Available");
		}			

		List<MobileElement> Afternoon_Slot = driver.findElements(By.xpath("//*[contains(@text, 'Afternoon')]"));

		if (Afternoon_Slot.size() < 0 || Afternoon_Slot.size() > 0) {
			System.out.println("Afternoon Slots are available.");
			slots.select_afternoon_Slot();
		} else {
			System.out.println("Afternoon Slots are Not available.");
		}
		

		List<MobileElement> Evening_Slot = driver.findElements(By.xpath("//*[contains(@text, 'Evening')]"));

		if (Evening_Slot.size() < 0 || Evening_Slot.size() > 0) {
			System.out.println("Evening Slots are available.");
			slots.select_evening_Slot();
		} else {
			System.out.println("Evening Slots are Not available.");
		}
	
		slots.book_Btn();
		slots.continue_Button();

		ApptConf = new AppointmentConfm_Page(driver);
		ApptConf.booked_Successfully();
		ApptConf.add_To_Calender();
		ApptConf.return_To_Appt_List();
*/	
	}
}
}
