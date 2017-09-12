package Main_Method;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRM_Page extends Test_Execution_Comman_related_method  {
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception, Throwable {
		
		System.out.println("CRM PAGE EXCUTION START");
		
		///////////////////Login method//////////////////s
		CRM_Page.Comman(args);
		WebDriver d = null;
		///////////////////Proprties file data reader///////////////
		File r=new File("C:\\Users\\USER\\Downloads\\Filehandling.js\\Or.Properties");
		FileInputStream sr=new FileInputStream(r);
		Properties prop1=new Properties();
		prop1.load(sr);
//		Thread.sleep(2000);
//		//boolean a=true;
	    Thread.sleep(2000);
		
//		d.findElement(By.xpath(prop1.getProperty("locator"))).click();
		
		
		

		
	}
	}

