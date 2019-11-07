package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bwoserlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//we have to write the script for chrome bwoser initiation 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\SELENIUM JAR\\chromedriver.exe"); 
		  driver=new ChromeDriver(); 
		  driver.get("https:\\www.amazon.in");
		 
		//initiating firefoxdriver 
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\SELENIUM JAR\\geckodriver.exe"); 
		 
		  driver=new FirefoxDriver(); 
		  driver.get("https://www.amazon.in/");
		 
	}
}