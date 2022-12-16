package com.medevantage.app.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.BookSlot_Page;
import com.medevantage.app.pages.CancelApt_Page;
import com.medevantage.app.pages.Dashboard_Page;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class CancelApt_Test extends BaseClass {

	BookSlot_Page slots;
	CancelApt_Page myAppts;
	Dashboard_Page dashboard;

	@Test
	public void cancel_Appointment() throws InterruptedException

	{
		dashboard = new Dashboard_Page(driver);
		dashboard.leftMenu();
		myAppts = new CancelApt_Page(driver);
		myAppts.my_Appts_Button();
		//myAppts.select_Apt();
		slots = new BookSlot_Page(driver);
		slots.select_morning_Slot();	
		//slots.select_afternoon_Slot();
		myAppts.cancel_Appt_Button();
		myAppts.select_Cancellation_Reason();
		myAppts.Reason();
		myAppts.continue_Button();
		Thread.sleep(3000);
		Assert.assertEquals(myAppts.appt_Status(), " Cancelled", "Appt_Cancellation_Failed");

	}
   
}
