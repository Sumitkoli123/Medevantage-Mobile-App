package com.medevantage.app.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.Dashboard_Page;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class Dashboard_Test extends BaseClass {
	
	Dashboard_Page dashboard;

	@Test
	public void dashboard() throws InterruptedException, IOException {

		dashboard = new Dashboard_Page(driver);
		Thread.sleep(5000);
		dashboard.patient_Name();
		dashboard.leftMenu();
		dashboard.book_Appt();
		Assert.assertTrue(false);
	}
}
