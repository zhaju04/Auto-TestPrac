package newpackage;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();

		        driver.get("http://formy-project.herokuapp.com/autocomplete");
		        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, California");
		        Thread.sleep(1000);
		        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		        autocompleteResult.click();
		        Thread.sleep(5000);
		        driver.quit();
		    

	}

}
