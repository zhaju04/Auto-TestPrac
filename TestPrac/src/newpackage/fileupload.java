package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		 System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://formy-project.herokuapp.com/fileupload");

		 WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
		 Thread.sleep(3000);
		 fileUploadField.sendKeys("child.PNG");
		 
		 Thread.sleep(3000);
		 driver.close();
	}

}
