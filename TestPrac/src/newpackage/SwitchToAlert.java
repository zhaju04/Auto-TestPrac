package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://formy-project.herokuapp.com/switch-window");
		
		 Thread.sleep(5000);
		 WebElement alertButton = driver.findElement(By.id("alert-button"));
		 alertButton.click();
		 
		 Thread.sleep(5000);
		 
		 Alert alert = driver.switchTo().alert();
		 
		 Thread.sleep(5000);
		 alert.accept();
		 
		 driver.quit();
		
	}

}
