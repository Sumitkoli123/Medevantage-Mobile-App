package com.medevantage.app.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.AppointmentConfm_Page;
import com.medevantage.app.pages.BookApt_Page;
import com.medevantage.app.pages.BookSlot_Page;
import com.medevantage.app.pages.CancelApt_Page;
import com.medevantage.app.pages.Dashboard_Page;
import com.medevantage.app.pages.Provider_Search_Page;
import com.medevantage.app.pages.RescheduleApt_Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class Provider_Search_Test extends BaseClass {
	Dashboard_Page dashboard;
	Provider_Search_Page searchPro;
	BookApt_Page bookApt;
	BookSlot_Page slots;
	AppointmentConfm_Page ApptConf;
	CancelApt_Page myAppts;
	RescheduleApt_Page reschApt;

	@Test(priority = 1)
	public void patientDashboard() throws InterruptedException, IOException {
		dashboard = new Dashboard_Page(driver);
		Thread.sleep(8000);
		dashboard.patient_Name();
		dashboard.leftMenu();
		dashboard.book_Appt();
	}

	@Test(priority = 2, enabled = false)
	public void providerSearch_bySpeciality() throws Exception {

		searchPro = new Provider_Search_Page(driver);
		searchPro.searchSpeciality();
		searchPro.selectSpeciality();
		searchPro.clickSearchBtn();
		searchPro.clickBookApt();
	}

	@Test(priority = 2)
	public void providerSearch_bySpeciality_and_byLocayion() throws Exception {

		searchPro = new Provider_Search_Page(driver);
		searchPro.searchSpeciality();
		searchPro.selectSpeciality();
		searchPro = new Provider_Search_Page(driver);
		searchPro.searchLocation();
		searchPro.selectLocation();
		searchPro.clickSearchBtn();
		searchPro.clickBookApt();
	}

	@Test(priority = 3)
	public void bookedAppt_For_medicareSickVisit() throws InterruptedException {

		bookApt = new BookApt_Page(driver);
		bookApt.location_Dropdown();
		bookApt.select_Location();
		bookApt.reason_Dropdown();
		bookApt.select_Reason_as_Medicare_Sick_Visit();
		bookApt.set_Appt_Reason();
		bookApt.continue_Button();
	}

	@Test(priority = 4)
	public void bookSlot() throws InterruptedException, IOException {
		slots = new BookSlot_Page(driver);
		slots.click_next_Day();

		List<MobileElement> check_slot = driver.findElements(
				By.xpath("//android.view.View[2][@index='1']/android.view.View[@index='0']/android.widget.Button"));

		if (check_slot.size() < 0 || check_slot.size() > 0) {
			System.out.println("Slots are not available. Checking next availability");
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

	@Test(priority = 5)
	public void appointmentConf() throws InterruptedException, IOException {
		ApptConf = new AppointmentConfm_Page(driver);
		ApptConf.booked_Successfully();
		ApptConf.add_To_Calender();
		ApptConf.return_To_Appt_List();
	}

	@Test(priority = 6)
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

	@Test(priority = 7)
	public void rescheduleAppointment() throws InterruptedException {
		reschApt = new RescheduleApt_Page(driver);
		reschApt.reschedule_Apt_Button();
		Thread.sleep(5000);
		reschApt.set_Appt_Reason();
		reschApt.continue_Button();
		slots = new BookSlot_Page(driver);
		slots.click_next_Day();
		List<MobileElement> check_slot = driver.findElements(
				By.xpath("//android.view.View[2][@index='1']/android.view.View[@index='0']/android.widget.Button"));

		if (check_slot.size() < 0 || check_slot.size() > 0) {
			System.out.println("Slots are not available.Checking next availability");
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

	@Test(priority = 8)
	public void rescheduleAppointmentConf() throws InterruptedException, IOException {
		ApptConf = new AppointmentConfm_Page(driver);
		ApptConf.booked_Successfully();
		//ApptConf.add_To_Calender();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Return To Appointment List']")));
		element.click();
		//ApptConf.return_To_Appt_List();
	}

}