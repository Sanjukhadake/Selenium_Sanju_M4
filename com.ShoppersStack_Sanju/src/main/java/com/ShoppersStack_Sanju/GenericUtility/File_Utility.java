package com.ShoppersStack_Sanju.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {

	FileInputStream fis;
	
	public String readPropertyData(String key) throws IOException {
		FileInputStream fis =new FileInputStream(FrameWorkConstants.propertyPath);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	
	public String readExcelData(String sheetName, int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream(FrameWorkConstants.excelPath);
		Workbook wo =WorkbookFactory.create(fis);
		String value = wo.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
		
	}
}

