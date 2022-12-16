package com.medevantage.app.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.BookApt_Page;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class BookApt_Test extends BaseClass {
	BookApt_Page bookApt;

	@Test(enabled=false)
	public void booked_Appt_For_Ancillary_and_Vaccination() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_Ancillary_and_Vaccination();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}
	
	@Test(enabled=false)
	public void booked_Appt_For_General_Follow_up() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_General_Follow_Up();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}
	
	@Test()
	public void booked_Appt_For_Medicare_Sick_Visit() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_Medicare_Sick_Visit();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}
	
	@Test(enabled=false)
	public void booked_Appt_For_PreOp_Clearance() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_PreOp_Clearance();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}
	
	@Test(enabled=false)
	public void booked_Appt_For_Sick_Visit() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_Sick_Visit();
		bookApt.select_Concussion();
		bookApt.select_Concussion_as_Yes();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}
	
	@Test(enabled=false)
	public void booked_Appt_For_Well_Vsit() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_Well_Visit();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}
	
	@Test(enabled=false)
	public void booked_Appt_For_Annual_physical() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_Annual_Physical();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}
	
}
