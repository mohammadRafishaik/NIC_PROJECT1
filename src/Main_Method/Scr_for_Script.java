package Main_Method;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Scr_for_Script {
	
	
	public static void Screenshots(WebDriver driver, String ScreenshotName) throws IOException {
		//public  void Screenshots_for_entaire_script {
			
			try {
				TakesScreenshot ts=(TakesScreenshot)driver;
				File sr=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sr, new File("./Screenshots/"+ScreenshotName+".png"));
			} catch (Exception e) {
			System.out.println("While taking screenshots "+e.getMessage());
				
			}
			

		}

		public static void failureScreenshots(WebDriver result,String ScreenshotName, TakesScreenshot driver) throws IOException {
		System.out.println("Taken Screen Shots only fail script");
		if(ITestResult.FAILURE==((ITestResult) result).getStatus()) {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sr=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sr, new File("./Screenshots/"+ScreenshotName+".png"));
		}

		}
}
//		public static void properties() throws IOException   {
//			// TODO Auto-generated method stub
//			File r=new File("C:\\Users\\USER\\Downloads\\Filehandling.js\\Or.Properties");
//			FileInputStream sr=new FileInputStream(r);
//			Properties prop1=new Properties();
//			prop1.load(sr);
//		}
//}
