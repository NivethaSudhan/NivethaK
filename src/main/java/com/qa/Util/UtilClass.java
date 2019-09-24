package com.qa.Util;
import java.io.IOException;

import ParentClass.parentClass;



public class UtilClass extends parentClass {
	public UtilClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static long Page_Load_Timeout=50;
	public static long Implicit_Wait=20;
	
	/*public void screenshot()
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(driver.findElement(By.xpath("")));
		FileUtils.copyFile(src, "");
		
	}*/

}
