package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 //DesiredCapabilities capabilities = new DesiredCapabilities();
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);
		// WebDriver driver = new FirefoxDriver(capabilities);
		// capabilities.setCapability(FirefoxDriver.BINARY, "C:\\Users\\r_zha\\Downloads\\Firefox Installer.exe");		 

		 WebDriver driver = new FirefoxDriver();
		 // System.setProperty("webdriver.chrome.driver","/webdriver/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
	   String baseUrl = "http://demo.guru99.com/test/newtours/";
	   String expectedTitle = "Welcome: Mercury Tours";
	   String actualTitle = "";
	   driver.get(baseUrl);
	   actualTitle = driver.getTitle();
	     
	     if (actualTitle.contentEquals(expectedTitle)){
	           System.out.println("Test Passed!");
	      } else {
	        System.out.println("Test Failed");
	
	        driver.close();
	        System.exit(0);
	     	        }
	 }
}


