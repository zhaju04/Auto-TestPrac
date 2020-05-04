package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class autocomplete_Explicitwait {

	public static void main(String[] args, int timeOutinSeconds) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();

		        driver.get("http://formy-project.herokuapp.com/autocomplete");
		        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, California");
		        
		        WebDriverWait wait = new WebDriverWait(driver,10);       
		        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		        autocompleteResult.click();
		        
		        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		        
		        driver.quit();
		    
		
	}

}
