package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ExecuteJavascripts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://formy-project.herokuapp.com/modal");
		 
		 WebElement modalButton = driver.findElement(By.id("modal-button"));
		 modalButton.click();
		 
		 Thread.sleep(5000);
		 WebElement closeButton = driver.findElement(By.id("close-button"));
		 closeButton.click();
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", closeButton);
		 Thread.sleep(5000);
		 
		 driver.quit();
	}

}
