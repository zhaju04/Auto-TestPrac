package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();

		 driver.get("http://formy-project.herokuapp.com/checkbox");
		 
		 WebElement Checkbox1 = driver.findElement(By.id("checkbox-1"));
		 Checkbox1.click();
		 Thread.sleep(3000);
		 Checkbox1.click();
		 Thread.sleep(5000);
		
		 WebElement Checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
		 Checkbox2.click();
		 Thread.sleep(3000);
		 Checkbox2.click();
		 Thread.sleep(5000);
		 
		 WebElement Checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
		 Checkbox3.click();
		 Thread.sleep(3000);
		 Checkbox3.click();
		 Thread.sleep(5000);
		 
		 driver.quit();

	}

}
