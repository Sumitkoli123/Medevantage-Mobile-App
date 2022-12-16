package com.medevantage.app.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.AppointmentConfm_Page;
import com.medevantage.app.pages.BookApt_Page;
import com.medevantage.app.pages.BookSlot_Page;
import com.medevantage.app.pages.Book_Appt_as_caregiverPatient_Page;
import com.medevantage.app.pages.CancelApt_Page;
import com.medevantage.app.pages.Dashboard_Page;
import com.medevantage.app.pages.RescheduleApt_Page;
import com.medevantage.app.pages.SelectPatient_Page;
import com.medevantage.app.pages.SignIn_Page;
import com.medevantage.app.utility.DataGenerator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class Book_Appt_as_caregiverPatient_Test extends BaseClass {

	SignIn_Page signin;
	SelectPatient_Page selectPatient;
	Dashboard_Page dashboard;
	Book_Appt_as_caregiverPatient_Page caregiverPt;
	BookApt_Page bookApt;
	BookSlot_Page slots;
	AppointmentConfm_Page ApptConf;
	CancelApt_Page myAppts;
	RescheduleApt_Page reschApt;

	@Test(priority = 1, dataProvider = "caregiverUserA", dataProviderClass = DataGenerator.class)
	public void signIn_toSelect_caregiverPatient(String Email, String Pass) throws InterruptedException, IOException {
		signin = new SignIn_Page(driver);
		signin.getStarted();
		signin.setSignIn_Email(Email);
		signin.setSignIn_Pass(Pass);
		signin.signIn_Button();
		selectPatient = new SelectPatient_Page(driver);
		selectPatient.dropdown_List();
		MobileElement pt = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		pt.click();
		pt.sendKeys("Rich Test Patient");
		Thread.sleep(8000);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(0, 396)).perform();
		selectPatient.next_Button();
	}

	@Test(priority = 2)
	public void patientDashboard() throws InterruptedException, IOException {
		dashboard = new Dashboard_Page(driver);
		Thread.sleep(8000);
		dashboard.patient_Name();
		dashboard.leftMenu();
		dashboard.book_Appt();
	}

	@Test(priority = 3)
	public void search_Provider_byName() throws InterruptedException, IOException {
		caregiverPt = new Book_Appt_as_caregiverPatient_Page(driver);
		caregiverPt.searchProvider_byName();
		caregiverPt.selectProvider();
		caregiverPt.bookAptButton();
	}

	@Test(priority = 4)
	public void booking_Appt_For_generalFollowUp() throws InterruptedException {
		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_General_Follow_Up();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}

	@Test(priority = 5)
	public void book_Slot() throws InterruptedException, IOException {
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
			@SuppressWarnings("rawtypes")
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(178, 723)).perform();
			slots.book_Btn();
			slots.continue_Button();
		}

	}

	@Test(priority = 6)
	public void appointmentConf() throws InterruptedException, IOException {
		ApptConf = new AppointmentConfm_Page(driver);
		ApptConf.booked_Successfully();
		ApptConf.add_To_Calender();
		ApptConf.return_To_Appt_List();
	}

	@Test(priority = 7)
	public void cancelAppointment() throws InterruptedException {
		myAppts = new CancelApt_Page(driver);
		driver.findElement(By.xpath("//android.view.View[2][@index='2']/android.view.View[1]")).click();
		myAppts.cancel_Appt_Button();
		myAppts.select_Cancellation_Reason();
		myAppts.Reason();
		myAppts.continue_Button();
		Thread.sleep(3000);
		Assert.assertEquals(myAppts.appt_Status(), " Cancelled", "Appt_Cancellation_Failed");
	}

	@Test(priority = 8)
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
			@SuppressWarnings("rawtypes")
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(178, 723)).perform();
			slots.book_Btn();
			slots.continue_Button();
		}
	}

	@Test(priority = 9)
	public void rescheduleAppointmentConf() throws InterruptedException, IOException {
		ApptConf = new AppointmentConfm_Page(driver);
		ApptConf.booked_Successfully();
		ApptConf.add_To_Calender();
		ApptConf.return_To_Appt_List();
	}

}