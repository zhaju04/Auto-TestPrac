package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://formy-project.herokuapp.com/scroll");
		 
		 WebElement name = driver.findElement(By.id("name"));
		 
		 Actions actions = new Actions(driver);
		 actions.moveToElement(name);
		 name.sendKeys ("Ruth Du");
		 
		 WebElement date = driver.findElement(By.id("date"));
		 date.sendKeys("01/01/2020");
		 
		 Thread.sleep(5000);
	     driver.quit();
	}

}
