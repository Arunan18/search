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
package com.qdms.high.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlantSearchPage {
	@FindBy(xpath = "//div[@class='ant-table-filter-dropdown']/div/input")
	public static WebElement PlantCodeSearchTextBox;
	@FindBy(xpath = "//div[@class='ant-table-filter-dropdown']/div/div/button[1]")
	public static WebElement PlantCodeSearchBtn;

	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[3]/div/span[2]")
	public static WebElement PlantCodeSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[2]/div/span[2]")
	public static WebElement PlantNameSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[3]/div/span[2]")
	public static WebElement SbuSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[4]/div/span[2]")
	public static WebElement PlantManagerSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[5]/div/span[2]")
	public static WebElement AddressSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[6]/div/span[2]")
	public static WebElement ContactNoSearch;
	
	
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> PlantCodeColumn;
	
	
	public static String ColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String ColumnAfter="]/td[3]";
	
	
}
