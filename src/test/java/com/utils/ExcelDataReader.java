package com.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	public static String excelDataReader(String sheetname, int rowNum, int colNum)
	{
		try {
		String excelPath="C:\\Users\\Ganesh Dandekar\\eclipse-workspace\\ObsquraZone\\ExcelSheetData\\Login Data.xlsx";
		FileInputStream fis=new FileInputStream(excelPath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	

}
