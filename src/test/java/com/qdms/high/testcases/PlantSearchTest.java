//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Suntharalingam Arunan
//* Date Written     : 22/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        22/02/2023   Arunan     Orginal Version
//*
//************************************************************************************
package com.qdms.high.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.PlantSearchPage;

public class PlantSearchTest extends DriverIntialization {
	static PlantSearchPage psp = new PlantSearchPage();
	static boolean PlantCodeSearchVisible = true;
	static boolean PlantCodeSearchEnable = true;
	static boolean PlantCodeSearchTextBoxVisible = true;
	static boolean PlantCodeSearchTextBoxEnable = true;
	static boolean PlantCodeSearchButtonVisible = true;
	static boolean PlantCodeSearchButtonEnable = true;
	static String PlanteCode = null;
	static String SBU = null;
	static boolean TableData = true;
	static int BeforeFilteringDataCount = 0;
	static int AfterFilteringDataCount = 0;

//	Plant Code Search Button
	public static void plantCodeSearch() {
		PageFactory.initElements(driver, psp);

//		Check Plant Code Search Properties
		testCase = extent.createTest("Plant Code Search Button Visible");
		try {
			Assert.assertEquals(PlantSearchPage.PlantCodeSearch.isDisplayed(), true);
			testCase.log(Status.INFO, "Plant Code Search Button Visible");
			testCase.log(Status.PASS, "Plant Code Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			PlantCodeSearchVisible = false;
			testCase.log(Status.INFO, "Plant Code Search Button Not Visible");
			testCase.log(Status.FAIL, "Plant Code Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			PlantCodeSearchVisible = false;
			testCase.log(Status.INFO, "Dont have Plant Code Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Plant Code Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (PlantCodeSearchVisible) {
//			Check Plant Code Search Enable
			testCase = extent.createTest("Plant Code Search Button Enable");
			try {
				Assert.assertEquals(PlantSearchPage.PlantCodeSearch.isEnabled(), true);
				testCase.log(Status.INFO, "Plant Code Search Button Enable");
				testCase.log(Status.PASS, "Plant Code Search Button Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				PlantCodeSearchEnable = false;
				testCase.log(Status.INFO, "Plant Code Search Button Not Enable");
				testCase.log(Status.FAIL, "Plant Code Search Button Not Enable").assignCategory("High-Severity");
			}

			if (PlantCodeSearchEnable) {
//				
			}
		}
	}

//	Check Plant Code Search Button Click
	public static void ClickPlantCodeSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		if (PlantCodeSearchVisible && PlantCodeSearchEnable) {
			PlantSearchPage.PlantCodeSearch.click();
		}
	}

//	Plant Code input TextBox Properties
	public static void plantCodeSearchTextBox() throws InterruptedException {
		PageFactory.initElements(driver, psp);

//		Check Plant Code Search TextBox Visible
		testCase = extent.createTest("Plant Code Search Text Box Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(PlantSearchPage.PlantCodeSearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Plant Code Search Text Box Visible");
			testCase.log(Status.PASS, "Plant Code Search Text Box Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			PlantCodeSearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Plant Code Search Text Box Not Visible");
			testCase.log(Status.FAIL, "Plant Code Search Text Box Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			PlantCodeSearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Dont have Plant Code Search Text Box Locator");
			testCase.log(Status.FAIL, "Dont have Plant Code Search Text Box Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (PlantCodeSearchTextBoxVisible) {
//			Check Plant Code Search TextBoxEnable
			testCase = extent.createTest("Plant Code Search Text Box Enable");
			try {
				Assert.assertEquals(PlantSearchPage.PlantCodeSearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Plant Code Search Text Box Enable");
				testCase.log(Status.PASS, "Plant Code Search Text Box Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				PlantCodeSearchTextBoxEnable = false;
				testCase.log(Status.INFO, "Plant Code Search Text Box Not Enable");
				testCase.log(Status.FAIL, "Plant Code Search Text Box Not Enable").assignCategory("High-Severity");
			}

			if (PlantCodeSearchTextBoxEnable) {
//				
			}
		}
	}


//Plant Code Search Button Properties
public static void plantCodeSearchButton() throws InterruptedException {
	PageFactory.initElements(driver, psp);

//	Check Plant Code Search TextBox Visible
	testCase = extent.createTest("Plant Code Search Button Visible");
	try {
		Thread.sleep(1000);
		Assert.assertEquals(PlantSearchPage.PlantCodeSearchTextBox.isDisplayed(), true);
		testCase.log(Status.INFO, "Plant Code Search Button Visible");
		testCase.log(Status.PASS, "Plant Code Search Button Visible Script Pass").assignCategory("High-Severity");
	} catch (AssertionError e) {
		PlantCodeSearchButtonVisible = false;
		testCase.log(Status.INFO, "Plant Code Search Button Not Visible");
		testCase.log(Status.FAIL, "Plant Code Search Button Not Visible").assignCategory("High-Severity");
	} catch (NoSuchElementException e) {
		PlantCodeSearchButtonVisible = false;
		testCase.log(Status.INFO, "Dont have Plant Code Search Button Locator");
		testCase.log(Status.FAIL, "Dont have Plant Code Search Button Locator, So Smoke Fail")
				.assignCategory("High-Severity");
	}

	if (PlantCodeSearchButtonVisible) {
//		Check Plant Code Search TextBoxEnable
		testCase = extent.createTest("Plant Code Search Button Enable");
		try {
			Assert.assertEquals(PlantSearchPage.PlantCodeSearchTextBox.isEnabled(), true);
			testCase.log(Status.INFO, "Plant Code Search Button Enable");
			testCase.log(Status.PASS, "Plant Code Search Button Enable Script Pass")
					.assignCategory("High-Severity");
		} catch (AssertionError e) {
			PlantCodeSearchButtonEnable = false;
			testCase.log(Status.INFO, "Plant Code Search Button Not Enable");
			testCase.log(Status.FAIL, "Plant Code Search Button Not Enable").assignCategory("High-Severity");
		}

		if (PlantCodeSearchButtonEnable) {
//			
		}
	}
}

//Plant Code input TextBox Properties
public static void plantCodeSearchButtonClick() throws InterruptedException {
	PageFactory.initElements(driver, psp);

	if(PlantCodeSearchButtonVisible && PlantCodeSearchButtonEnable) {
		PlantSearchPage.PlantCodeSearchBtn.clear();
	}
}

//	Input Search Data
	public static void inputDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);
		if (PlantCodeSearchTextBoxVisible && PlantCodeSearchTextBoxEnable) {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("PlantSearch");

			int rowcount = sheet.getLastRowNum();
			for (int i = 0; i <= rowcount; i++) { 
				XSSFRow row = sheet.getRow(i);

				boolean check = (boolean) row.getCell(0).getBooleanCellValue();
				PlanteCode = (String) row.getCell(1).getStringCellValue();
				SBU = (String) row.getCell(1).getStringCellValue();

				if (check) {
					Thread.sleep(2000);
					PlantSearchPage.PlantCodeSearchTextBox.sendKeys("RMC");
					
					
					if(BeforeFilteringDataCount == AfterFilteringDataCount) {
						testCase = extent.createTest("Check Correct Data Count Filter");
						testCase.log(Status.INFO, "Correct Data Count Filtered");
						testCase.log(Status.PASS, "Correct Data Count Filtered").assignCategory("High-Severity");
					} else {
						testCase = extent.createTest("Check Correct Data Count Filter");
						testCase.log(Status.INFO, "Wrong Data Count Filtered");
						testCase.log(Status.FAIL, "Wrong Data Count Filtered").assignCategory("High-Severity");
					}
					
				}
 
			}
		}
	}

//	Check Data
	public static void checkWrongDataFilter(String PlantCode) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.PlantCodeColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.ColumnBefore + j + PlantSearchPage.ColumnAfter));
				String CodeName = code.getText();
				if (!CodeName.contains(PlantCode)) {
					TableData = false; 
				} 
			}
			PlantSearchPage.NextPageBtn.click();
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
			if (TableData) {
				testCase = extent.createTest("Check Wrong Data Filter");
				testCase.log(Status.INFO, "Unwanted Data Not Filtering");
				testCase.log(Status.PASS, "Filter Correctly Working").assignCategory("High-Severity");
			} else {
				testCase = extent.createTest("Check Wrong Data Filter");
				testCase.log(Status.INFO, "Unwanted Data Filtering");
				testCase.log(Status.FAIL, "Filter Wrongly Working").assignCategory("High-Severity");
			}
		}

	}
 
	
	
//	BeforeFilteringDataCount
	public static void checkBeforeSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.PlantCodeColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.ColumnBefore + j + PlantSearchPage.ColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText(); 
				if (CodeName.contains(Sbu)) {
					BeforeFilteringDataCount = BeforeFilteringDataCount +1;
				}
			}
			PlantSearchPage.NextPageBtn.click();
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
			}
		System.out.println("BeforeFilteringDataCount : "+BeforeFilteringDataCount);
		driver.navigate().refresh();
	}
 
//	afterFilteringDataCount
	public static void checkAfterSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.PlantCodeColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.ColumnBefore + j + PlantSearchPage.ColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText(); 
				if (CodeName.contains(Sbu)) {
					AfterFilteringDataCount = AfterFilteringDataCount +1;
				}
				if (!CodeName.contains(Sbu)) {
					TableData = false; 
				}
			}
			PlantSearchPage.NextPageBtn.click();
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
			if (TableData) {
				testCase = extent.createTest("Check Wrong Data Filter");
				testCase.log(Status.INFO, "Unwanted Data Not Filtering");
				testCase.log(Status.PASS, "Filter Correctly Working").assignCategory("High-Severity");
			} else {
				testCase = extent.createTest("Check Wrong Data Filter");
				testCase.log(Status.INFO, "Unwanted Data Filtering");
				testCase.log(Status.FAIL, "Filter Wrongly Working").assignCategory("High-Severity");
			}
			}
		System.out.println("AfterFilteringDataCount : "+AfterFilteringDataCount);
	}
}
