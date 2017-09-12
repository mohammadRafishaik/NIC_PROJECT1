package Main_Method;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prperties_File {

	public static void properties() throws IOException   {
		// TODO Auto-generated method stub
		File r=new File("C:\\Users\\USER\\Downloads\\Filehandling.js\\Or.Properties");
		FileInputStream sr=new FileInputStream(r);
		Properties prop1=new Properties();
		prop1.load(sr);
	}

}
