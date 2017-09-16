package com.Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public  class Frame_Work_Library {
  static String  f="C:\\Users\\USER\\Desktop\\S4RND_TEST.xlsx";
 static WebDriver driver;
 
		public  void excel() throws InvalidFormatException, IOException 
		
		{
			
			
			/////////Data write from excel method////////////////////
		
		FileInputStream srs=new FileInputStream(f);
		XSSFWorkbook a=new XSSFWorkbook(srs);
		XSSFSheet a1=a.getSheet("Test data");
		
		//Createrow is ok but it will cear the entaire row data so we go for below
		
		Cell c1=a1.createRow(0).createCell(0);
		
		//Cell c1=a1.getRow(0).createCell(0);
		
		c1.setCellValue("URL");
		
		a1.createRow(1).createCell(0).setCellValue("https://s4rnd.nic.in:8443/sarathiservice/sarathiHomePublic.do");		
		
		a1.getRow(0).createCell(1).setCellValue("Action1");
		
		a1.getRow(1).createCell(1).setCellValue("ApplyOnline_Click");
				
		a1.getRow(0).createCell(2).setCellValue("Action2");
				
		a1.getRow(1).createCell(2).setCellValue("New LL_Click");
		
		a1.getRow(0).createCell(2).setCellValue("Action2");
		
		a1.getRow(1).createCell(2).setCellValue("New LL_Click");
		
		a1.getRow(0).createCell(3).setCellValue("Action3");
		a1.getRow(1).createCell(3).setCellValue("Fill Ll Aplication");
		
		a1.getRow(0).createCell(4).setCellValue("Action4");
		a1.getRow(1).createCell(4).setCellValue("Click On Submit Button");
		
		a1.getRow(0).createCell(5).setCellValue("Status");
		FileOutputStream a2=new FileOutputStream(f);
		a.write(a2);
		a2.close();
		a.close();
		
		System.out.println("Returned");
		
		
		}
		/////////Data Read from excel method////////////////////
		
		//@SuppressWarnings("deprecation")
		public static void read() throws IOException, Throwable {
			
			Frame_Work_Library m=new Frame_Work_Library();
		    m.excel();
			FileInputStream srs1=new FileInputStream(f);
			@SuppressWarnings("resource")
			XSSFWorkbook b=new XSSFWorkbook(srs1);
			XSSFSheet b1=b.getSheet("Test data");
			int c2=b1.getLastRowNum();
			int c3=b1.getRow(0).getLastCellNum();
		
			
			for(int i=0;i<=c2-1;i++) {
				for(int k=0;k<=c3-2;k++)
				{
//					XSSFCell yourcell=b1.getRow(i).getCell(k);
//					yourcell.setCellType(Cell.CELL_TYPE_STRING);
//			String d=yourcell.getStringCellValue();
		String d=b1.getRow(i).getCell(k).getStringCellValue();
				System.out.println("all values  "+d);
				}
				
				
			}
			
			
			
}
		///////////////Status pass in excel method/////////////
		public static void xp() throws Throwable {
			
			//File f=new File("C:\\Users\\Dell\\Desktop\\17th Excel practice.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook xw=new XSSFWorkbook(fis);
			XSSFSheet xs=xw.getSheet("Test data");
			
			//Cell c1=xs.createRow(0).createCell(2);
		// @SuppressWarnings("unused")
		Cell c1=xs.getRow(1).createCell(5);
		 
			c1.setCellValue("pass");
			FileOutputStream fos=new FileOutputStream(f);
			xw.write(fos);
			xw.close();
			fos.close();
		}
/////////////////////Status Fail in excel method//////////////
		
public static void xf() throws Throwable {
			
			//File f=new File("C:\\Users\\Dell\\Desktop\\17th Excel practice.xlsx");
			FileInputStream sf=new FileInputStream(f);
			XSSFWorkbook xw=new XSSFWorkbook(sf);
			XSSFSheet xs=xw.getSheet("Test data");
			
			//Cell c1=xs.createRow(0).createCell(2);
		// @SuppressWarnings("unused")
		Cell c1=xs.getRow(1).createCell(5);
		 
			c1.setCellValue("fail");
			FileOutputStream fos=new FileOutputStream(f);
			xw.write(fos);
			xw.close();
			sf.close();
	
}

	



	


////////////Screenshots method //////////////////////
/*public  void Screenshots_for_entaire_script(WebDriver driver, String ScreenshotName) throws IOException {
	
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File("./Screenshots/"+ScreenshotName+".png"));
	} catch (Exception e) {
	System.out.println("While taking screenshots "+e.getMessage());
		
	}
	

}

public static void failureScreenshots(WebDriver result, String ScreenshotName) throws IOException {
System.out.println("Taken Screen Shots");
if(ITestResult.FAILURE==((ITestResult) result).getStatus()) {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sr=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sr, new File("./Screenshots/"+ScreenshotName+".png"));
}

}*/



//  @Test
//
//	@SuppressWarnings("static-access")
//		public static void main (String[] args) throws Throwable, IOException {
//	  Frame_Work_Library n=new Frame_Work_Library();
//		  //  n.excel();
//			n.read();
//			System.out.println("values"+n);
//			
//			System.out.println("Application level script is start");
//			
//			String ds= "http://45.79.209.142:99/admin/login.html";
////			String ds1="mohammad.rafi@yitsol.com";
//////			String ds2="Rafi@1234";
//			String ds1="Telepathy Admin Portal";
//			
//			
//			
//			
//			File r=new File("C:\\Users\\Dell\\Downloads\\Filehandling\\OR.properties");
//			FileInputStream sr=new FileInputStream(r);
//			Properties prop1=new Properties();
//			prop1.load(sr);
//			
//			WebDriver r1=new FirefoxDriver();
//			
//			//String ds11="http://45.79.209.142:9999/admin/login.html";
//			r1.navigate().to(prop1.getProperty("Url"));
//			Thread.sleep(2000);
//			
//			////////////////Failure Scr method Calling///////////
//			
//		//	Excel.failureScreenshots(r1, "TelepathyFailureTescase");
//			
//			////////////screenshot method calling here /////////////
//			
//		n.Screenshots_for_entaire_script(r1, "Telepathyhomepage");
//		
//		System.out.println("value	"+r1.getCurrentUrl());
//		
//			r1.findElement(By.xpath(prop1.getProperty("UserValue"))).sendKeys(prop1.getProperty("Username"));
//			n.Screenshots_for_entaire_script(r1, "Telepathy User name");
//		//	System.out.println("value	"+);
//			//r1.get("username");
//			r1.findElement(By.xpath(prop1.getProperty("PasswordValue"))).sendKeys(prop1.getProperty("Password"));
//			n.Screenshots_for_entaire_script(r1, "Telepathy Password");
//		//r1.get("Password");
//			r1.findElement(By.xpath(prop1.getProperty("SubmitButton"))).click();
//			r1.getTitle();
//			Thread.sleep(3000);
//			
//			n.Screenshots_for_entaire_script(r1, "Telepathy CRM Page");
//			
//			System.out.println("  Title "+	r1.getTitle());
//			
//			
//			
//			if(ds1.contentEquals(r1.getTitle()) )
//			{
//				Frame_Work_Library.xp();
//	        }
//			
//			else
//					
//			{
//				Frame_Work_Library.xf();
//		    }
//	
			
		}
	

	