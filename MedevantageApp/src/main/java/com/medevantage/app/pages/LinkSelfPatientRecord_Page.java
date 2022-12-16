package com.medevantage.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LinkSelfPatientRecord_Page {

	public WebDriver driver;

	public LinkSelfPatientRecord_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By left_Menu = By.xpath("//*[@text='menu']");
	
	By patientName = By.xpath("//android.view.View[1]/android.widget.TextView[@index='1']");
	
	By selectPatientPage = By.xpath("//*[@text='Select Patient Page']");

	By link_Self_Patient = By.xpath("//*[@text='Link Self Patient Record']");
	
	//By SetuserName = By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Username:']]]");

	By gender = By.xpath("//*[@text='Gender :']");
	
	By male = By.xpath("//*[@text='Male']");
	
	By homePhone = By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Home Phone:']]]");

	By birthDate = By.xpath("//*[@text='Birth Date:']");
	
	By datePicker = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View[2][@index='1']");
	
	By SetDOB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View[2]/android.view.View[1][@index='1']");
	
	By add = By.xpath("//*[@text='Add']");

	
	public void left_Menu() {
		driver.findElement(left_Menu).click();
	}
	
	public String patientName() {
		return driver.findElement(patientName).getText();
	}
	
	public void selectPatientPage() {
		driver.findElement(selectPatientPage).click();
	}
	
	public void link_Self_Patient() {
		driver.findElement(link_Self_Patient).click();
	}

	public void gender() {
		driver.findElement(gender).click();
	}

	public void male() {
		driver.findElement(male).click();
	}

	public void SethomePhone(String HomePhone) {
		driver.findElement(homePhone).sendKeys(HomePhone);
	}
	

	public void birthDate() {
		 driver.findElement(birthDate).click();
	}
	
	public void datePicker() {
	    driver.findElement(datePicker);
		
	}

	public void SetDOB() {
		driver.findElement(SetDOB).click();
	}
	public void add() {
		driver.findElement(add).click();
	}

}
