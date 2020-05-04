package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://formy-project.herokuapp.com/dragdrop");
		 
		 WebElement image = driver.findElement(By.id("image"));
		 
		 WebElement box = driver.findElement(By.id("box"));
		 
		 Actions actions = new Actions(driver);
		 actions.dragAndDrop(image,box).build().perform();
		 
		 Thread.sleep(5000);
		 driver.quit();
		 
	}

}
