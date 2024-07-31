package com.ShoppersStack_genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_File_utility {
	public String readProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream(Frame_Constantrant.propertyPath);
		Properties pro=new Properties();
		pro.load(fis);
		 String value = pro.getProperty(key);
		return value;
	}
	
	 public String readExcelData(String sheetName, int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		 FileInputStream fis2=new FileInputStream(Frame_Constantrant.excelPath);
		 Workbook wb=WorkbookFactory.create(fis2);
		 String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		 return value;
		 
		 
	 }
}
