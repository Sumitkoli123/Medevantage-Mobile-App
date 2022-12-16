package com.medevantage.app.tests;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.Caregiver_Page;
import com.medevantage.app.pages.Manage_Other_Records_Page;
import com.medevantage.app.pages.SelectPatient_Page;
import com.medevantage.app.pages.SignIn_Page;
import com.medevantage.app.utility.DataGenerator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class Caregiver_Test extends BaseClass {
	Caregiver_Page reqOther;
	SignIn_Page signin;
	Manage_Other_Records_Page pending_Req;
	Manage_Other_Records_Page approved_Req;
	Manage_Other_Records_Page rejected_Req;
	SelectPatient_Page selectPatient;
	String patientnName;

	@Test(priority = 1, dataProvider = "caregiverUserA", dataProviderClass = DataGenerator.class)
	public void selfUserA1_SignIn_to_send_caregiver_request(String Email, String Pass)
			throws InterruptedException, IOException {

		signin = new SignIn_Page(driver);
		signin.getStarted();
		signin.setSignIn_Email(Email);
		signin.setSignIn_Pass(Pass);
		signin.signIn_Button();
	}

	@Test(priority = 2, dataProvider = "Req_To_Other", dataProviderClass = DataGenerator.class)
	public void Req_To_Other_Record_caregiver_request_send(String userName) {

		reqOther = new Caregiver_Page(driver);
		reqOther.req_to_other_record();
		reqOther.access_Type();
		reqOther.full_Access();
		// reqOther.no_Access();
		// reqOther.read_Access();
		reqOther.setusername(userName);
		reqOther.relationship();
		reqOther.relationship_Friend();
		reqOther.request_Button();
		reqOther.left_Menu();
		reqOther.logout();
		reqOther.click_Yes();
	}

	@Test(priority = 3, dataProvider = "caregiverUserB", dataProviderClass = DataGenerator.class)
	public void CaregiverUserB1_SignIn_to_approve_caregiver_request(String Email, String Pass)
			throws InterruptedException, IOException {

		signin = new SignIn_Page(driver);
		signin.getStarted();
		signin.setSignIn_Email(Email);
		signin.setSignIn_Pass(Pass);
		signin.signIn_Button();

		pending_Req = new Manage_Other_Records_Page(driver);
		pending_Req.left_Menu();
		//patientnName = pending_Req.userNameB();
		pending_Req.manage_Other_Record();

		List<MobileElement> pending_Req_Tab = driver.findElements(By.xpath("//*[@text='Sorry!']"));

		if (pending_Req_Tab.size() < 0 || pending_Req_Tab.size() > 0) {
			System.out.println("We couldn't find any results.");
		} else {
			System.out.println("Pending caregiver Request present");
			pending_Req.patient_Name();
			// pending_Req.patient_Email();
			pending_Req.terms_And_condition_Checkbox();
			pending_Req.approve_Req();
			// pending_Req.reject_Req();
			approved_Req = new Manage_Other_Records_Page(driver);
			approved_Req.approved_Tab();
			// approved_Req.patient_Name();
			// approved_Req.patient_Email();
			// approved_Req.change_Access_Btn();
			// approved_Req.no_Access();
			// approved_Req.read_Access();
			// approved_Req.full_Access();
			reqOther = new Caregiver_Page(driver);
			reqOther.left_Menu();
			reqOther.logout();
			reqOther.click_Yes();
		}
	}

	@Test(priority = 4, dataProvider = "caregiverUserA", dataProviderClass = DataGenerator.class)
	public void selfUserA2_SignIn_to_check_patient_present_in_list(String Email, String Pass)
			throws InterruptedException, IOException {

		signin = new SignIn_Page(driver);
		signin.getStarted();
		signin.setSignIn_Email(Email);
		signin.setSignIn_Pass(Pass);
		signin.signIn_Button();

		selectPatient = new SelectPatient_Page(driver);
		selectPatient.dropdown_List();

		MobileElement pt = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		pt.click();
		pt.sendKeys(patientnName);
		Thread.sleep(8000);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(0, 396)).perform();

		reqOther = new Caregiver_Page(driver);
		reqOther.left_Menu();
		reqOther.logout();
		reqOther.click_Yes();
	}

	@Test(priority = 4, dataProvider = "caregiverUserB", dataProviderClass = DataGenerator.class)
	public void CaregiverUserB2_SignIn_to_revokeCaregiver_request(String Email, String Pass)
			throws InterruptedException, IOException {

		signin = new SignIn_Page(driver);
		signin.getStarted();
		signin.setSignIn_Email(Email);
		signin.setSignIn_Pass(Pass);
		signin.signIn_Button();
		pending_Req = new Manage_Other_Records_Page(driver);
		pending_Req.left_Menu();
		patientnName = pending_Req.userNameB();
		pending_Req.manage_Other_Record();
		approved_Req = new Manage_Other_Records_Page(driver);
		approved_Req.approved_Tab();

		List<MobileElement> pending_Req_Tab = driver.findElements(By.xpath("//*[@text='Sorry!']"));

		if (pending_Req_Tab.size() < 0 || pending_Req_Tab.size() > 0) {
			System.out.println("We couldn't find any results.");
		} else {
			System.out.println("Approved Request present");
			approved_Req = new Manage_Other_Records_Page(driver);
			approved_Req.patient_Name();
			// approved_Req.patient_Email();
			approved_Req.revoke_Access_Btn();
			rejected_Req = new Manage_Other_Records_Page(driver);
			rejected_Req.rejected_Tab();
			List<MobileElement> rejected_Tab = driver.findElements(By.xpath("//*[@text='Sorry!']"));

			if (rejected_Tab.size() < 0 || rejected_Tab.size() > 0) {
				System.out.println("We couldn't find any results.");
			} else {

				System.out.println("Rejected Caregiver Request present");
				rejected_Req = new Manage_Other_Records_Page(driver);
				rejected_Req.patient_Name();
				// rejected_Req.patient_Email();
				reqOther = new Caregiver_Page(driver);
				reqOther.left_Menu();
				reqOther.logout();
				reqOther.click_Yes();
			}
		}
	}

	@Test(priority = 5, dataProvider = "caregiverUserA", dataProviderClass = DataGenerator.class)
	public void selfUserA3_SignIn_to_check_patient_removed_from_list(String Email, String Pass)
			throws InterruptedException, IOException {

		signin = new SignIn_Page(driver);
		signin.getStarted();
		signin.setSignIn_Email(Email);
		signin.setSignIn_Pass(Pass);
		signin.signIn_Button();
		selectPatient = new SelectPatient_Page(driver);
		selectPatient.dropdown_List();
		WebElement pt = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		pt.click();
		pt.sendKeys(patientnName);
		Thread.sleep(8000);
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		List<MobileElement> pt_Name = driver.findElements(By.xpath("//*[@text='No items found.']"));

		if (pt_Name.size() < 0 || pt_Name.size() > 0) {
			System.out.println("Rejected Patient is Removed From List");
			reqOther = new Caregiver_Page(driver);
			reqOther.close();
			reqOther.left_Menu();
			reqOther.logout();
			reqOther.click_Yes();
		} else {
			System.out.println("Rejected Patient is Not Removed From List");
		}
	}
}
