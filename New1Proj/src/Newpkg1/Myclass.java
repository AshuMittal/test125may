package Newpkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Myclass {
	

     
	public void MicrosoftEdge_Test1() {
		System.setProperty("webdriver.edge.driver","E:\\Edge Driver\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
									  }
	
	
	}



