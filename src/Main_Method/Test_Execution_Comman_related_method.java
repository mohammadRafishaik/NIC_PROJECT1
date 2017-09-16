package Main_Method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
			String ds1="New LL Acknowledgement";
			
			
			////////////////// Properties file reader///////////////
			//Scr_for_Script.properties();
			
			File r=new File("C:\\Users\\USER\\Downloads\\Filehandling.js\\Or.Properties");
			FileInputStream sr=new FileInputStream(r);
			Properties prop1=new Properties();
			prop1.load(sr);
			
			WebDriver r1=new FirefoxDriver();
			r1.manage().window().maximize();
			r1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//String ds11="http://45.79.209.142:9999/admin/login.html";
			r1.navigate().to(prop1.getProperty("Url"));
			Thread.sleep(2000);
			
			////////////////Failure Scr method Calling///////////
			
		//	Excel.failureScreenshots(r1, "TelepathyFailureTescase");
			
			////////////screenshot method calling here  with class name/////////////
			//Test_Execution scr1=new Test_Execution();
					
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
			//r1.getTitle();
			//=========================================================================================
					
			   ////////////Application filling///////////
			
			////////Select State and RTO office from where LL is being applied/////////////////
			
			r1.findElement(By.xpath(prop1.getProperty("State_Dw"))).click();
			Thread.sleep(2000);
			r1.findElement(By.xpath(prop1.getProperty("State_Up"))).click();
			Thread.sleep(2000);

			r1.findElement(By.id(prop1.getProperty("Rto_Dw"))).click();
			Thread.sleep(2000);

			r1.findElement(By.xpath(prop1.getProperty("Rto_Barabanki"))).click();
			Thread.sleep(4000);
			Scr_for_Script.Screenshots(r1, "State and Rto Page Declaration page");

			///////////////Personal Details//////////////////////////
			
r1.findElement(By.id(prop1.getProperty("Name"))).sendKeys(prop1.getProperty("Name_Value"));
Thread.sleep(2000);

r1.findElement(By.id(prop1.getProperty("Middle_Name"))).sendKeys(prop1.getProperty("Middle_Name_Value"));
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("Last_Name"))).sendKeys(prop1.getProperty("Last_Name_Value"));
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("Relation_DropDown"))).click();
Thread.sleep(2000);
r1.findElement(By.xpath(prop1.getProperty("Relation_Name"))).click();
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("FName"))).sendKeys(prop1.getProperty("Fname_Value"));
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("FMName"))).sendKeys(prop1.getProperty("FMName_Value"));
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("FLName"))).sendKeys(prop1.getProperty("FLName_Value"));
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("Gender"))).click();
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("Qualification"))).click();
Thread.sleep(2000);
r1.findElement(By.xpath(prop1.getProperty("Qualification_Value"))).click();
Thread.sleep(2000);
r1.findElement(By.xpath(prop1.getProperty("MobileNumber"))).sendKeys(prop1.getProperty("MobileNumber_Value"));
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("dateofbirth"))).sendKeys(prop1.getProperty("dateofbirth_Value"));
Thread.sleep(4000);
Scr_for_Script.Screenshots(r1, "Personal Details Page");

////////////Address/////////////////////////

//r1.findElement(By.id(prop1.getProperty("Distric"))).click();
//Thread.sleep(2000);
//r1.findElement(By.xpath(prop1.getProperty("Distric_Value"))).click();
//Thread.sleep(2000);
r1.findElement(By.xpath(prop1.getProperty("SubDistric"))).click();
Thread.sleep(3000);
r1.findElement(By.xpath(prop1.getProperty("SubDistric_Value"))).click();
Thread.sleep(2000);

r1.findElement(By.id(prop1.getProperty("pincode"))).sendKeys(prop1.getProperty("pincode_Value"));
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("sameaddress"))).click();
Thread.sleep(4000);
Scr_for_Script.Screenshots(r1, "Address page");

///////////////////Select Class of vehicles/////////////////////////
r1.findElement(By.xpath(prop1.getProperty("Covs"))).click();
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("Selected_Covs"))).click();
Thread.sleep(2000);
r1.findElement(By.id(prop1.getProperty("submittbutton"))).click();
Thread.sleep(2000);
r1.switchTo().alert().accept();
Thread.sleep(4000);
Scr_for_Script.Screenshots(r1, "LL Acknowledgement Page");

r1.getTitle();


	System.out.println(" Title "+	r1.getTitle());
			
			
			
			if(ds1.contentEquals(r1.getTitle()) )
			{
				Frame_Work_Library.xp();
	        }
			
			else
					
			{
				Frame_Work_Library.xf();
		    }
	
							
	}
	
//public static void LL_Submission() throws IOException, Exception {
//	//WebDriver d = new FirefoxDriver();
//	WebDriver d = null;
//	File r=new File("C:\\Users\\USER\\Downloads\\Filehandling.js\\Or.Properties");
//	FileInputStream sr=new FileInputStream(r);
//	Properties prop1=new Properties();
//	prop1.load(sr);
//    d.get(prop1.getProperty("url1"));
//	d.findElement(By.xpath(prop1.getProperty("State"))).click();
//	
//	
//
//}
}
