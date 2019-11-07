package scripts;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest {
	public static Properties p;

    public static WebDriver driver;
    public static void init() throws IOException 
 {
    	Properties p= new Properties();
    	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\javaselenium\\FirstProject\\src\\scripts\\data.properties");
    	p.load(fis);
 }
	
	  public static void launch(String browser) {
		  
	  if(p.getProperty(browser).equals("chrome")) { 
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\SELENIUM JAR\\chromedriver.exe"); 
		  driver=new ChromeDriver(); 
		  }else if(p.get(browser).equals("firefox")) {
			  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\SELENIUM JAR\\geckodriver.exe");
	  
	  driver=new FirefoxDriver();
	  
	  }
	  
	  }public static void navigateurl(String url) { driver.get(p.getProperty(url));
	  
	  }
	 



    	
    



}
