package com.wbl.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.wbl.base.TestBase;

import org.openqa.selenium.TakesScreenshot;


public class TestUtil extends TestBase{
		
		public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


		public static long PAGE_LOAD_TIMEOUT=20;
		public static long IMPLICIT_WAIT=10;
	
		public static String TESTDATA_SHEET_PATH = "C:\\Users\\sivaj\\eclipse-workspace"
				+ "\\FreeCRMTestAutomation\\src\\main\\java\\com\\wbl\\testdata\\RediffContacsData.xlsx";
		
		public static Object[][] getTestData(String sheetName) throws IOException {
			
			Object[][] data=null;
			XSSFWorkbook wb=null;
			
			wb= new XSSFWorkbook(TESTDATA_SHEET_PATH);
			XSSFSheet sheet=wb.getSheet(sheetName);
			
			int rowsIndex=sheet.getLastRowNum(); //gets last  row number that is how many data sets we want to run on the test case
			//rowsIndex starts from 0
			
			data = new Object[rowsIndex][];
			for ( int i=1;i<=rowsIndex;i++) { //we are not accessing row 0, because its the heading for columns
				XSSFRow row=sheet.getRow(i); 
				int columns= row.getLastCellNum();// this return no of columns
				
				Object[] colData=new Object[columns];
				
				for(int j=0;j<columns;j++) {
					colData[j]= row.getCell(j).toString(); //accessing the cell the and storing the data of each row into an array object.
				}
				data[i-1]=colData; //giving the data of each row to data row.
			}
			wb.close();
			return data;	
		}

		
		public static  String takeScreenshotAtEndofTest() throws IOException {
			
			//TakesScreenshot screensht=((TakesScreenshot)driver);
			//File image=screensht.getScreenshotAs(OutputType.FILE);
			File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDIr=System.getProperty("user.dir");
			String destination=currentDIr + "/screenshots/" + System.currentTimeMillis()+ ".png";
			File finaldestination=new File(destination);
			FileHandler.copy(scrFile,finaldestination);
			//FileHandler.copy(scrFile,new File(currentDIr + "/screenshots/" + System.currentTimeMillis()+ ".png"));
			return destination;
		}
		
}



