package com.medevantage.app.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.SelectPatient_Page;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class SelectPatient_Test extends BaseClass {
	SelectPatient_Page selectPatient;

	@Test()
	public void selectPatient() throws InterruptedException {

		selectPatient = new SelectPatient_Page(driver);
		selectPatient.dropdown_List();
		selectPatient.select_Patient();
		//selectPatient.next_Button();

	}
}
