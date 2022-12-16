package com.medevantage.app.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.AppointmentConfm_Page;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class AppointmentConfm_Test extends BaseClass {
	AppointmentConfm_Page ApptConf;

	@Test
	public void appointmentConf() throws InterruptedException, IOException {
		ApptConf = new AppointmentConfm_Page(driver);
		ApptConf.booked_Successfully();
		ApptConf.add_To_Calender();
		//ApptConf.allow_Access_to_calender();
		ApptConf.return_To_Appt_List();
	}
}
