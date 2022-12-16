package com.medevantage.app.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.Manage_Other_Records_Page;
import com.medevantage.app.pages.SignIn_Page;

import io.appium.java_client.MobileElement;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class Manage_Other_Records_Test extends BaseClass {

	Manage_Other_Records_Page pending_Req;
	Manage_Other_Records_Page approved_Req;
	Manage_Other_Records_Page rejected_Req;
	SignIn_Page signin;

	@Test(priority=1)
	public void pendingRequest() {

		// signin = new SignIn_Page(driver);
		// signin.getStarted();

		pending_Req = new Manage_Other_Records_Page(driver);
		pending_Req.left_Menu();
		pending_Req.manage_Other_Record();

		List<MobileElement> pending_Req_Tab = driver.findElements(By.xpath("//*[@text='Sorry!']"));

		if (pending_Req_Tab.size() < 0 || pending_Req_Tab.size() > 0) {
			System.out.println("We couldn't find any results.");
		} else {

			System.out.println("Pending caregiver Request present");
			pending_Req.patient_Name();
			pending_Req.patient_Email();
			pending_Req.terms_And_condition_Checkbox();
			pending_Req.approve_Req();
			// pending_Req.reject_Req();
		}
	}

	@Test(priority=2)
	public void approvedRequest() {
		approved_Req = new Manage_Other_Records_Page(driver);
		approved_Req.approved_Tab();

		List<MobileElement> approved_Req_Tab = driver.findElements(By.xpath("//*[@text='Sorry!']"));

		if (approved_Req_Tab.size() < 0 || approved_Req_Tab.size() > 0) {
			System.out.println("We couldn't find any results.");
		} else {

			System.out.println("Approved Caregiver Request present");
			approved_Req.patient_Name();
			approved_Req.patient_Email();
			approved_Req.change_Access_Btn();
			// approved_Req.no_Access();
			approved_Req.full_Access();
			// approved_Req.read_Access();
			approved_Req.revoke_Access_Btn();

		}

	}

	@Test(priority=3)
	public void rejectedRequest() {

		rejected_Req = new Manage_Other_Records_Page(driver);
		rejected_Req.rejected_Tab();

		List<MobileElement> rejected_Tab = driver.findElements(By.xpath("//*[@text='Sorry!']"));

		if (rejected_Tab.size() < 0 || rejected_Tab.size() > 0) {
			System.out.println("We couldn't find any results.");
		} else {

			System.out.println("Rejected Caregiver Request present");
			rejected_Req.patient_Name();
			rejected_Req.patient_Email();
			// rejected_Req.req_Rejected();

		}

	}
}
