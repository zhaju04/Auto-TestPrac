package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SwitchToActiveWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://formy-project.herokuapp.com/switch-window");
		 
		 WebElement NewTabButton = driver.findElement(By.id("new-tab-button"));
		 NewTabButton.click();
		 
		 String originalHandle = driver.getWindowHandle();
		 
		 Thread.sleep(5000);
		 
		 for(String handle1: driver.getWindowHandles()) {
			 driver.switchTo().window(handle1);
		 }
		 
		 Thread.sleep(5000);
		 
		 driver.switchTo().window(originalHandle);
		 
		 Thread.sleep(5000);
	     driver.quit();
	}

}