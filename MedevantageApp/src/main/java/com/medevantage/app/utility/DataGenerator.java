package com.medevantage.app.utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	public static String excelPath = System.getProperty("user.dir") + "\\src\\main\\resources\\testData\\TestData.xlsx";

	@DataProvider(name = "signInData")
	public static Object[][] signInData() throws IOException {
		FileInputStream file = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet signinSheet = workbook.getSheet("SignIn");
		int numberOfRow = signinSheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[numberOfRow][2];

		System.out.println(numberOfRow);

		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row = signinSheet.getRow(i);
			XSSFCell Email = row.getCell(0);
			XSSFCell Pass = row.getCell(1);
			data[i][0] = Email.getStringCellValue();
			data[i][1] = Pass.getStringCellValue();
			workbook.close();
		}
		return data;
	}

	@DataProvider(name = "signUpData")
	public static Object[][] signUpData() throws IOException {
		FileInputStream file = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet signinSheet = workbook.getSheet("SignUp");
		int numberOfRows = signinSheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[numberOfRows][6];

		System.out.println(numberOfRows);

		for (int i = 0; i < numberOfRows; i++) {
			XSSFRow row = signinSheet.getRow(i);
			XSSFCell fName = row.getCell(0);
			XSSFCell lName = row.getCell(1);
			XSSFCell Email = row.getCell(2);
			XSSFCell pNumber = row.getCell(3);
			XSSFCell pass = row.getCell(4);
			XSSFCell conPass = row.getCell(5);
			data[i][0] = fName.getStringCellValue();
			data[i][1] = lName.getStringCellValue();
			data[i][2] = Email.getStringCellValue();
			DataFormatter formatter = new DataFormatter();
			try {
				data[i][3] = formatter.formatCellValue(pNumber);
			} catch (Exception e) {
				data[i][3] = "";
			}
			data[i][4] = pass.getStringCellValue();
			data[i][5] = conPass.getStringCellValue();

			workbook.close();
		}
		return data;

	}

	@DataProvider(name = "Forgot_Pass")
	public static Object[][] ForgotPasswordData() throws IOException {
		FileInputStream file = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet signinSheet = workbook.getSheet("ForgotPass");
		int numberOfRow = signinSheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[numberOfRow][1];

		System.out.println(numberOfRow);

		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row = signinSheet.getRow(i);
			XSSFCell Email = row.getCell(0);
			data[i][0] = Email.getStringCellValue();
			workbook.close();

		}
		return data;

	}

	@DataProvider(name = "Self_Link")
	public static Object[][] SelfLinkData() throws IOException {
		FileInputStream file = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet signinSheet = workbook.getSheet("SelfLink");
		int numberOfRow = signinSheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[numberOfRow][1];

		System.out.println(numberOfRow);

		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row = signinSheet.getRow(i);
			//XSSFCell UserName = row.getCell(0);
			XSSFCell HomePhone = row.getCell(0);
			// XSSFCell DOB = row.getCell(2);
			//data[i][0] = UserName.getStringCellValue();
			DataFormatter formatter = new DataFormatter();
			try {
				data[i][0] = formatter.formatCellValue(HomePhone);
			} catch (Exception e) {
				data[i][0] = "";
			}
			// data[i][2] = DOB.getStringCellValue();
			workbook.close();

		}
		return data;

	}

	@DataProvider(name = "Req_To_Other")
	public static Object[][] ReqToOtherData() throws IOException {
		FileInputStream file = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet signinSheet = workbook.getSheet("ReqToOther");
		int numberOfRow = signinSheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[numberOfRow][1];

		System.out.println(numberOfRow);

		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row = signinSheet.getRow(i);
			XSSFCell userName = row.getCell(0);
			data[i][0] = userName.getStringCellValue();
			workbook.close();
		}
		return data;

	}

	@DataProvider(name = "caregiverUserA")
	public static Object[][] caregiverUseArData() throws IOException {
		FileInputStream file = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet signinSheet = workbook.getSheet("CaregiverUserA");
		int numberOfRow = signinSheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[numberOfRow][2];

		System.out.println(numberOfRow);

		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row = signinSheet.getRow(i);
			XSSFCell Email = row.getCell(0);
			XSSFCell Pass = row.getCell(1);
			data[i][0] = Email.getStringCellValue();
			data[i][1] = Pass.getStringCellValue();
			workbook.close();
		}
		return data;
	}

	@DataProvider(name = "caregiverUserB")
	public static Object[][] caregiverUserBData() throws IOException {
		FileInputStream file = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet signinSheet = workbook.getSheet("CaregiverUserB");
		int numberOfRow = signinSheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[numberOfRow][2];

		System.out.println(numberOfRow);

		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row = signinSheet.getRow(i);
			XSSFCell Email = row.getCell(0);
			XSSFCell Pass = row.getCell(1);
			data[i][0] = Email.getStringCellValue();
			data[i][1] = Pass.getStringCellValue();
			workbook.close();
		}
		return data;
}
}
