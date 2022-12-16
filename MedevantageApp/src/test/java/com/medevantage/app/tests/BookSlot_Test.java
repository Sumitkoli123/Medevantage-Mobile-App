package com.medevantage.app.tests;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.BookSlot_Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class BookSlot_Test extends BaseClass {
	BookSlot_Page slots;
	String morningSlots = "Morning";
	String afternnoonSlots = "Afternoon";
	String eveningSlots = "Evening";

	@Test
	public void book_Slot() throws InterruptedException, IOException {

		slots = new BookSlot_Page(driver);
		slots.click_next_Day();

		List<MobileElement> check_slot = driver.findElements(
				By.xpath("//android.view.View[2][@index='1']/android.view.View[@index='0']/android.widget.Button"));

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
			@SuppressWarnings("rawtypes")
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(178, 723)).perform();
			slots.book_Btn();
			slots.continue_Button();
		}
/*
		if (morningSlots.contains("Morning")) {
			slots.select_morning_Slot();
		}

		else if (afternnoonSlots.contains("Afternoon")) {
			slots.select_afternoon_Slot();
		}

		else if (eveningSlots.contains("Evening")) {
			slots.select_evening_Slot();
		}

		else {
			System.out.println("...Booking Slot...");
		}

		slots.book_Btn();
		slots.continue_Button();
*/
	}
}
