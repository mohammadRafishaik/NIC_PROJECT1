package Main_Method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Filehandling.Frame_Work_Library;

public class Test_Execution_Comman_related_method extends Scr_for_Script {
	
	

	@SuppressWarnings("static-access")
		public static void Comman (String[] args) throws Throwable, IOException {
		
//public static void Main(String[] args) throws IOException, Throwable {
//	
//	//Test_Execution TE=new Test_Execution();
//	Test_Execution.Comman();
//	System.out.println("SUccessfully done");
//	
		Frame_Work_Library n=new Frame_Work_Library();
		  //  n.excel();
	n.read();
			System.out.println("values"+n);
			
			System.out.println("Application level script is start");
			
			String ds= "http://45.79.209.142:99/admin/login.html";
//			String ds1="mohammad.rafi@yitsol.com";
////			String ds2="Rafi@1234";
			String ds1="Application For NewLL";
			
			
			////////////////// Properties file reader///////////////
			//Scr_for_Script.properties();
			
			File r=new File("C:\\Users\\USER\\Downloads\\Filehandling.js\\Or.Properties");
			FileInputStream sr=new FileInputStream(r);
			Properties prop1=new Properties();
			prop1.load(sr);
			
			WebDriver r1=new FirefoxDriver();
			
			//String ds11="http://45.79.209.142:9999/admin/login.html";
			r1.navigate().to(prop1.getProperty("Url"));
			Thread.sleep(2000);
			
			////////////////Failure Scr method Calling///////////
			
		//	Excel.failureScreenshots(r1, "TelepathyFailureTescase");
			
			////////////screenshot method calling here  with class name/////////////
			//Test_Execution scr1=new Test_Execution();
			//////////////
			Scr_for_Script.Screenshots(r1, "S4RND HOME PAGE");
		System.out.println("value	"+r1.getCurrentUrl());
		
			r1.findElement(By.xpath(prop1.getProperty("ApplyOnline_DN"))).click();
			Scr_for_Script.Screenshots(r1, "ApplyOnline_Drop_down action");
		//	System.out.println("value	"+);
			//r1.get("username");
			r1.findElement(By.xpath(prop1.getProperty("New_LLR"))).click();
			Scr_for_Script.Screenshots(r1, "New_LLR Page");
		//r1.get("Password");
			r1.findElement(By.xpath(prop1.getProperty("Countinuie_Button"))).click();
			//r1.getTitle();
			Thread.sleep(3000);
			
			Scr_for_Script.Screenshots(r1, "New_Licence Page");
			
			r1.findElement(By.xpath(prop1.getProperty("New_Submit_Button"))).click();
			
			Scr_for_Script.Screenshots(r1, "Application Page");
			r1.getTitle();

			System.out.println("  Title "+	r1.getTitle());
			
			
			
			if(ds1.contentEquals(r1.getTitle()) )
			{
				Frame_Work_Library.xp();
	        }
			
			else
					
			{
				Frame_Work_Library.xf();
		    }
	
							
	}
	
public static void LL_Submission() throws IOException, Exception {
	//WebDriver d = new FirefoxDriver();
WebDriver d = null;
	File r=new File("C:\\Users\\USER\\Downloads\\Filehandling.js\\Or.Properties");
	FileInputStream sr=new FileInputStream(r);
	Properties prop1=new Properties();
	prop1.load(sr);
	WebElement element=d.findElement(By.xpath(prop1.getProperty("State_Name")));
	
	Select value=new Select(element);
	value.selectByValue("Gujarat");
	d.findElement(By.xpath(prop1.getProperty("name"))).click();
	

}
}
