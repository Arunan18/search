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

import java.io.IOException;

import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;

public class Test_Script extends DriverIntialization{
	 
	
	@Test
	public void PlantCodeSingleSearch() throws InterruptedException, IOException {
		
//		STEP 1 : Login the System
		LoginTest.Login(); 
		
//		STEP 2 : Navigate Master
		MainNavigationTest.navigateMaster();
		
//		STEP 3 : Navigate Plant Main Module
		MainNavigationTest.navigatePlant(); 
		
//		STEP 4 : Navigate Plant Sub Module
		SubNavigationTest.navigatePlant();
		
		PlantSearchTest.checkBeforeSearchData("RMC");
		driver.navigate().refresh();
//		STEP 5 : Check Plant Code Search Button Properties
		PlantSearchTest.plantCodeSearch();
		
//		STEP 6 : Click Plant Code Search Button 
		PlantSearchTest.ClickPlantCodeSearch();
		
//		STEP 7 : Check Plant Code Text Box
		PlantSearchTest.plantCodeSearchTextBox();
		
//		STEP 8 : Input Search Data
		PlantSearchTest.inputDataSearch();
		

		PlantSearchTest.checkAfterSearchData("RMC");
		 
		
		
		
		
	}

}
